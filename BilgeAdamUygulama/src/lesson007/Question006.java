package lesson007;

import java.util.Scanner;

public class Question006 {
	private static void buyukMu(int x) {
		int sayininUzunlugu = basamakHesapla(x);
		if (x>=4) {
			System.out.println("Sayi 1000 den büyük veya eşit");
		}else {
			System.out.println("sayi 1000 den küçüktür");
		}
	}
private static int basamakHesapla(int x) {
	
	String newSayi = String.valueOf(x);
	int basamakSayisi = newSayi.length();
	return basamakSayisi;
	
	
	
}
	public static void main(String[] args) {
		// parametre olarak in alan ve int döndüren 
		//girilen sayının kaç basamaklı olduğunu bulan methodu yazalım
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz");
		int sayi = sc.nextInt();
		
		buyukMu(sayi);
	

}}
