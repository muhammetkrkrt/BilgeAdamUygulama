package lesson004;

import java.util.Scanner;

public class Question001 {

	public static void main(String[] args) {
		// Girilen sayının mükemmel sayı olup olmadığını bulan program 
		// bölenlerinin toplamı kendisini veren
		//(medium) makale oku ..
		Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz:");
        int sayi=sc.nextInt();
        int toplam = 0;
		for (int i = 1 ; i < sayi ; i++) {
			if(sayi %i == 0)  
				toplam += i;
		}
		
		if (toplam == sayi) 
			System.out.println(sayi + " mükemmel bir sayidir");
		else
			System.out.println(sayi + " mükemmel bir sayi degildir");
		

	}

}
