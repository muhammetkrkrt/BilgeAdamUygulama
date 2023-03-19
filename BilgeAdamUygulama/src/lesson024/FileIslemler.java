package lesson024;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileIslemler {
   static Scanner  sc = new Scanner(System.in);
   
   
	public void menu() throws Exception {
		boolean kontrol = true ;
		while (kontrol) {
			System.out.println("0-Cikis");
			System.out.println("1-Dosya yarat");
			System.out.println("2-Metin Ekle");
			System.out.println("3-Metin Okuma");
			System.out.println("4-Dosya silme");
			System.out.println("Lutfen islem seciniz: ");
			int key = Integer.parseInt(sc.nextLine());
			switch (key) {
			case 1:
				try {
					dosyaOlustur(FileSabitler.file);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 2:
				try {
					dosyayaYaz(FileSabitler.file);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 3:
				dosyaOku(FileSabitler.file);
				break;
			case 4:
				dosyaSil();
				break;
			case 0:
				kontrol = false ;
				break;
			default:
				System.out.println("Lutfen gecerli bir secim giriniz..");
				break;
			}
		}
		
	}
	private void dosyaSil() {
		// TODO Auto-generated method stub
		
	}
	private void dosyaOku(File file ) throws Exception {
		if(file.exists()) {
		BufferedReader reader = null;
	    String text = null;
	    try {
	    	reader = new BufferedReader(new FileReader (file));
	        while((text = reader.readLine()) != null) {
	            System.out.println(text);
	        }

	    } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
	        try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }}
		else {
			throw new Exception("Dosya bulunamadi..");
		}
		
	}
	private void dosyayaYaz(File file) throws Exception {
	if(file.exists()) {
		System.out.println("Metni giriniz: ");
		String text = sc.nextLine();
		FileWriter fileWriter = null ;
		try {
			fileWriter = new FileWriter(file , true);
			fileWriter.write(text + "\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fileWriter != null ) {
			fileWriter.close();
			}
		}
	}
	else {
		throw new Exception("Dosya bulunamadi.");
	}
	}
	private void dosyaOlustur(File file) throws Exception {
		
		if(file.exists()) {
			throw new Exception("Bu dosya onceden olusturulmustur.");
		}else {
			System.out.println("Dosyaniz olusturuluyor..");
			file.createNewFile();
			Thread.sleep(1000);
			System.out.println("Dosyaniz olusturulmustur.");
		}
		
	}
	

	
	
}
