package lesson001;

import java.util.Scanner;

public class Question011 {

	public static void main(String[] args) {
	 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir sayı giriniz:");
		int sayi1=scanner.nextInt();
		System.out.println("2.sayıyıgiriniz:");
		int sayi2=scanner.nextInt();
		
		if(sayi1>sayi2) {
			System.out.println("büyük sayı: "+sayi1);
		}
		else if (sayi2>sayi1) {
			System.out.println("büyük sayı: "+sayi2);
		}
		
		else {
			System.out.println("sayılar eşittir: "+sayi2);
		}
	 

	}

}
