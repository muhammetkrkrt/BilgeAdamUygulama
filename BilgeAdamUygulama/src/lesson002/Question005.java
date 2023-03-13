package lesson002;

import java.util.Scanner;

public class Question005 {

	public static void main(String[] args) {
		/*
		  Koç Burcu : 21 Mart - 20 Nisan
		  Boğa Burcu : 21 Nisan - 21 Mayıs
		  İkizler Burcu : 22 Mayıs - 22 Haziran
		  Yengeç Burcu : 23 Haziran - 22 Temmuz
		  Aslan Burcu : 23 Temmuz - 22 Ağustos
		  Başak Burcu : 23 Ağustos - 22 Eylül
		  Terazi Burcu : 23 Eylül - 22 Ekim
		  Akrep Burcu : 23 Ekim - 21 Kasım
		  Yay Burcu : 22 Kasım - 21 Aralık
		  
		  1. Ay Oğlak Burcu : 22 Aralık - 21 Ocak
		  1. Ay Kova Burcu : 22 Ocak - 19 Şubat
		  
		  Balık Burcu : 20 Şubat - 20 Mart
		*/
		
		// Kaçıncı ayda doğdunuz-->  4. ayda 
		// hangi gün doğdunuz-->  Ayın 20'sinde
		
		//Switch case kullanalım
		//Default --> lütfen 1-12 arasında bir sayı girin
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kaçıncı ayda doğdunuz");
		int ay = scanner.nextInt();
		System.out.println("Kaçıncı gün doğdunuz");
		int gun = scanner.nextInt();
		switch (ay) {
		case 1:
			if(gun < 21) {
				System.out.println("Oğlak");
			}else {
				System.out.println("Kova");
			}
			break;
		case 2:
			if(gun < 19) {
				System.out.println("Kova");
			}else if(gun>19 && gun<=31){
				System.out.println("Balık");
			}else {
				System.out.println("lütfen geçerli bir gün girin");
			}
			break;
		default:
			System.out.println("1-12 arasında bir sayı giriniz");
			break;
		}
	}

}
