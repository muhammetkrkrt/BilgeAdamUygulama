package lesson012;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//pizza Sparis uygulamasi
		// pizza sinifi olusturacagiz 
		//attribute --> price , vejeteryan mi , normal mi 
		// eger verjeteryan ise fiyat 300 
		//normal ise fiyat 200 tl 
		// Mainde 1 pizza olusturalim
		
		// sos ekle  50 tl ekle
		// peynirEkle 100 tl eklensin
		//eve sparis ver  20 tl kurye parasi
		// fis al  bizzanin total price
 
		// kullanicidan vegi mi normal mi 
		// sonra menu cikaralim
		//1-sos ekle 
		// 2 - peynir ekle
		// 3 - fiyati goruntule
		
		
		Pizza pizza = new Pizza(true);
		
		System.out.println(pizza.getPrice() + "  TL");
		
		pizza.eveSparisVer();
		pizza.sosEkle ();
		pizza.peynirEkle();
		
		pizza.fisAl();
		menu();
		
	}
	static Pizza pizza2 ;
	public static void menu() {
		Pizza pizza2 = null ;
	boolean cikis = true ;
		Scanner sc = new Scanner(System.in);
		System.out.println("pizzanizi belirtin");
		boolean isVegi = true ;
		String pizzaTercihi = sc.nextLine();
		if (pizzaTercihi.equals("vegi")) {
			pizza2 = new Pizza(isVegi);
		}
		else if (pizzaTercihi.equals("normal")) {
			isVegi = false;
			pizza2 = new Pizza(isVegi);
		}else
		{
			System.out.println("Boyle bir urun bulunmamakta");
		}
		
		
		while (cikis) {
			System.out.println("***Menu****");               // sos cikar 
			System.out.println("1 - Sos ekle");
			System.out.println("2 - peynir ekle");          // peynir cikar
			System.out.println("3 - fis al ");             
			System.out.println("4 - sos cikart");
			System.out.println("5 - peynir cikart");
			 int secim = sc.nextInt();
			switch (secim) {
			
			case 1:
				pizza2.sosEkle();
				break;
			case 2:
				pizza2.peynirEkle();
				break;
			case 3:
				pizza2.fisAl();
				break;
			case 4:
				pizza2.sosCikar();
				break;
			case 5:
				pizza2.peynirCikar();
				break;

			default:
				System.out.println("Boyle bir islem bulunamadi");
				break;
			}
			
		}
		
		
		
		
		
	}

}
