package maraton1;

import java.util.Scanner;


public class Question004 {
	private static void menuyuGoster() {
		System.out.println("**************************");
		System.out.println("* Geometrik Hesaplayıcı  *");
		System.out.println("**************************");
		System.out.println("1.Kare alan hesaplama");
		System.out.println("2.Kare çevre hesaplama");
		System.out.println("3.Diktörgen alan hesaplama");
		System.out.println("4.Diktörgen çevre hesaplama");
		System.out.println("5.Daire alan hesaplama");
		System.out.println("6.Daire çevre hesaplama");
		System.out.println("7. Çıkış");

	}
	public static void hesaplayici() {
		int secim = Integer.MAX_VALUE ;
		final double PI = 3.14 ;
		do {
			
	     menuyuGoster();
        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen seçimini giriniz(1-7) : ");
        secim = input.nextInt();
        switch (secim) {
		case 1: 
			System.out.println("*Kare alan hesaplama*");
			System.out.println("Lütfen kenar uzunluğunu giriniz:");
			double sayi1 = input.nextDouble();
			System.out.println("Sonuç = " + (sayi1*sayi1));
			break;
		case 2:
			System.out.println("*Kare çevre hesaplama*");
			System.out.println("Lütfen kenar uzunluğunu giriniz:");
			double sayi2 = input.nextDouble();
			
			System.out.println("Sonuç = " + (4*sayi2));
			break;
		case 3:
			System.out.println("*Diktörgen alan hesaplama*");
			System.out.println("Lütfen kısa kenar uzunluğunu giriniz:");
			double sayi3 = input.nextDouble();
			System.out.println("Lütfenuzun kenar uzunluğunu giriniz:");
			double sayi4 = input.nextDouble();
			System.out.println("Sonuç = " + (sayi3*sayi4));
			break;
		case 4:
			System.out.println("*Diktörgen çevre hesaplama*");
			System.out.println("Lütfen kısa kenar uzunluğunu giriniz:");
			double sayi5= input.nextDouble();
			System.out.println("Lütfenuzun kenar uzunluğunu giriniz:");
			double sayi6 = input.nextDouble();
			System.out.println("Sonuç = " + (2*(sayi5+sayi6)));
			break;
		case 5 :
			System.out.println("*Daire alan hesaplama*");
			System.out.println("Lütfen yarıçap uzunluğunu giriniz:");
			double yariCap = input.nextDouble();
			System.out.println("Sonuç = " + (PI*(yariCap*yariCap)));
			break;
		case 6:
			System.out.println("*Daire çevre hesaplama*");
			System.out.println("Lütfen yarıçap uzunluğunu giriniz:");
			double yariCap1 = input.nextDouble();
			System.out.println("Sonuç = " + (PI*2*yariCap1));
			break;
			
			case 7 :
			System.out.println("Hoşçakalın...");
		default:
			
			System.out.println("Hatalı sayı girdiniz. Lütfen menüdeki sayılardan birini girin.");
			
			break;
		}
		}while (secim != 7);
	}

	public static void main(String[] args) {
		
		hesaplayici();
        
	}

}
