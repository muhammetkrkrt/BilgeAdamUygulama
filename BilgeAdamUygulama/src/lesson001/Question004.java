package lesson001;

import java.util.Scanner;

public class Question004 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Lütefen 1. sayıyı giriniz:");
		
		float sayi1 = input.nextInt();
		System.out.println("Lütefen 2. sayıyı giriniz:");
		
		float sayi2 = input.nextInt();
		if (sayi1<sayi2) {
			System.out.println("Büyük olan sayı: "+sayi2);
		}
		else if(sayi2<sayi1) {
			System.out.println("Büyük olan sayı: "+ sayi1);
		}
		else
			System.out.println("sayılar eşittir");
		
		
		

	}

}
