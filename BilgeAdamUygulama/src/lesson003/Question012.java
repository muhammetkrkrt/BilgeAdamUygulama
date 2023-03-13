package lesson003;

import java.util.Scanner;

public class Question012 {

	public static void main(String[] args) {
		// girilen sayıya kadar tek olan sayıların toplamını bulan program
		Scanner scanner=new Scanner(System.in);
		System.out.println("Lütfen sayı giriniz:");
		int sayi=scanner.nextInt();
		int toplam = 0 ;
		
		
		while(sayi != 0) {
			if(sayi %2 != 0) {
				toplam = toplam + sayi ;
				
			}
			sayi-- ;
		}
		System.out.println(toplam);
		
		
		
		
		
//			for( int i = 1 ; i<=sayi ; i++ ) {
//				if (i % 2 != 0 ) {
//					tekToplam=tekToplam+i;
//				}
//				else {
//					continue;
//				}
//			
//		}
//		System.out.println("Toplam: " + tekToplam);
		
		
		
		

	}

}
