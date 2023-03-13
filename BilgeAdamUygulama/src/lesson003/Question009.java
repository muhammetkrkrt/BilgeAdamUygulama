package lesson003;

import java.util.Scanner;

public class Question009 {

	public static void main(String[] args) {
		// girilen sayının basamaklarının tolamını bulalım
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Lütfen sayıyı giriniz");
		int sayi=scanner.nextInt();
		int toplam=0;
		int basamak=0;
		
		 while(sayi > 0)
	        {
	           toplam=(sayi%10)+toplam;
	           sayi/= 10;
	            basamak++;
	        }
	 
	        System.out.println("Basamak Toplamı: " + toplam+ " basamak sayısı:" + basamak);
		
		
		
//		do {
//			toplam=(sayi%10)+toplam;
//			sayi/=10;
//			basamak++;
//				
//		} while (sayi > 0);
//		System.out.println("toplamı" + toplam + " basamak sayısı:" + basamak);
		
		

	}

}
