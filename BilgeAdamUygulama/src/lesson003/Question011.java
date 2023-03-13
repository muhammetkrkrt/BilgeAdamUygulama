package lesson003;

import java.util.Scanner;

public class Question011 {

	public static void main(String[] args) {
		// kullanıcı sıfıra basana kadaraldığımız sayıların çarpımı
		
		Scanner scanner=new Scanner(System.in);
		
	   System.out.println("Lütfen sayı giriniz");
	   int sayi=scanner.nextInt();
	   int carpim=1;
	  
		while (sayi != 0 ) {
			
			carpim=carpim*sayi;
			System.out.println("lütfen sayı giriniz:");
			sayi=scanner.nextInt();
			
		}
		System.out.println("çarpımları: " + carpim);

	}

}
