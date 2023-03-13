package lesson020;

import java.awt.MultipleGradientPaint.ColorSpaceType;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchOrnek2 {
	public static void elemaniGetir(String[] array) {
		int index = 0 ;
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Indexsi giriniz");
			index = scanner.nextInt();
			System.out.println(array[index]);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("dizi asim hatasi");
		}catch (InputMismatchException e) {
			System.out.println("sembol hatasi");
		}catch (Exception e) {
			System.out.println("bilinmeyen hata");
		}
		
		
	}
	public static void arraydeGez(String[] array) {
		int toplam = 0 ;
		int hataToplam = 0;
		for (String string : array) {
			
			try {
				toplam += Integer.valueOf(string);
			} catch (Exception e) {
				hataToplam ++ ;
			}
			
		}
		System.out.println(" Hatasiz sayilarin toplami -> " + toplam);
		System.out.println(" hata sayisi -> " + hataToplam);
	}
	
	
	public static String nullPoiter(String string) {
	return null;
	}
	public static void main(String[] args) {
		
		String[] array = { "6", "10", "bc", null, "20" };

		
		//elemaniGetir(array);
		//arraydeGez(array);
		for (String string : array) {
			nullPoiter(string);
		}
		
		
	}

	
	
	
}
