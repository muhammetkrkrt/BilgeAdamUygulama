package lesson002;

import java.util.Scanner;

public class Question002 {

	public static void main(String[] args) {
		// dışarıdan iki tane alınan sayısal değer alalım
		//iki sayının toplamı çift ise true değilse false yazdıralım
		//en sondada sayıların toplamının yarısını yazdıralım
		//dışarıdan alacagımız sayı int
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen ilk sayıyı giriniz: ");
		int sayi1 = scanner.nextInt();
		System.out.println("lütfen ikinci sayıyı giriniz: ");
		int sayi2 = scanner.nextInt();
		
		double toplam = sayi1 + sayi2 ;
		
	     
		boolean durum= (toplam%2 ==0);
		System.out.println("çift mi: "+ durum);
		System.out.println("sayıların ortalaması: " + toplam/2);
		
		
		
	}

}
