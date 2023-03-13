package lesson007;

import java.util.Scanner;

public class Question004 {
	private static String isimSoyisimYazdırma(String isim, String soyisim) {
		System.out.println("İsminiz: "+ isim  + "Soyisminiz " + soyisim);
		return soyisim ;

		
	}

	public static void main(String[] args) {
		// parametreolarak girilen isim ve soyisimi alıp ekrana yazdıralım
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen isim giriniz");
		String name = sc.nextLine();
		System.out.println("Lütfen soyisim giriniz:");
		String surname = sc.nextLine();
		
		
		isimSoyisimYazdırma(name , surname);
		

	}

	

}
