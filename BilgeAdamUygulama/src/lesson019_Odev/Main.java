package lesson019_Odev;

import java.util.Scanner;

public class Main {
	
	static Televizyon tv;
	static Boolean tvAcikMi = false;
	static int sesSeviyesi = 8;
	static int anlikKanal;

	private static void menuGoster() {
		System.out.println("--------Kumanda-------");
		System.out.println("0 - Çıkış ");
		System.out.println("1 - Televizyon Kur");
		System.out.println("2 - Televizyonu Aç");
		System.out.println("3 - Sesini Artır");
		System.out.println("4 - Sesini Azalt");
		System.out.println("5 - Kanal Değiştir");
		System.out.println("6 - Kanal Bilgisi Goster");
		System.out.println("7 - Televizyonu Kapat");
		System.out.println("8-- Menüyü Goster");

	}

	public static void main(String[] args) {
		menuGoster();

		boolean kontrol = true;
		while (kontrol) {
			
			Scanner scanner = new Scanner(System.in);
			int secim = scanner.nextInt();

			switch (secim) {
			case 1:
				tvKur();
				System.out.println("\n -- > Menüyü Görmek için 8 i tuslayin");
				break;
			case 2:
				televizyonuAc();
				System.out.println("\n -- > Menüyü Görmek için 8 i tuslayin");
				break;
			case 3:
				sesiniArtır();
				System.out.println("\n -- > Menüyü Görmek için 8 i tuslayin");
				break;
			case 4:
				sesiniAzalt();
				System.out.println("\n -- > Menüyü Görmek için 8 i tuslayin");
				break;
			case 5:
				kanalDegistir();
				System.out.println("\n -- > Menüyü Görmek için 8 i tuslayin");
				break;
			case 6:
				kanalBilgisiniGoster();
				System.out.println("\n -- > Menüyü Görmek için 8 i tuslayin");
				break;
			case 7:
				tvKapat();
				break;
			case 8:
				menuGoster();
				break;
			case 0:
				kontrol = false;
				System.out.println("Çıkış");
				break;

			}
		}

	}

	private static void tvKapat() {

		if (tvAcikMi != false) {
			System.out.println("Televizyonunuz kapali konumda .");

		} else {
			tvAcikMi = true;
			System.out.println("Televizyonunuz kapatiliyor .");
		}

	}
	public static void kanalGoster(int kanalNo) {
	    Kanal kanal = tv.getKanallar().get(kanalNo - 1);
	    System.out.println("Kanal adi: " + kanal.getKanalAdi() + " Kanal no:" + kanal.getKanalNo());
	}
	public static void kanalBilgisiniGoster() {
	    if (tvAcikMi) {
	        System.out.println("Televizyonunuz kapalidir.");
	    } else {
	        System.out.println("Kanal Listesi: ");
	        for (Kanal kanal : tv.getKanallar() ) {
	            kanalGoster(kanal.getKanalNo());
	        }
	        System.out.println("Acik olan kanal: ");
	        kanalGoster(anlikKanal);
	    }
	}


	private static void kanalDegistir() {

		 if (tvAcikMi) {
		        System.out.println("Televizyonunuz kapalidir");
		        return;
		    }
		    tv.tumKanallariGoster();
		    Scanner scanner = new Scanner(System.in);
		    System.out.println("Hangi kanali açmak istiyorsunuz?");
		    int secilenKanal = scanner.nextInt();
		    
		    System.out.println("Şu an " + secilenKanal + ". kanal acik:");
		    tv.gosterKanal(secilenKanal);
		    
		    anlikKanal = secilenKanal;
	}

	private static void sesiniAzalt() {
		if (tvAcikMi != false) {
			System.out.println("Televizyonunuz kapalidir");

		} else {
			sesSeviyesi--;
			System.out.println("Ses seviyesi: " + sesSeviyesi);
		}
	}

	private static void sesiniArtır() {
		if (tvAcikMi != false) {
			System.out.println("Televizyonunuz kapalidir");

		} else {
			sesSeviyesi++;
			System.out.println("Ses seviyesi: " + sesSeviyesi);
		}
	}
	
	private static void televizyonuAc() {
		if(tv != null) {
			System.out.println("Televizyon acildi");
			System.out.println(tv.getKanallar().get(0).getKanalAdi() + " kanalini izliyorsunuz.");
		}
		else {
			System.out.println("Önce televizyonu kurmalisiniz.");
		}
	}

	private static void tvKur() {

		if (tv == null) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Televizyonun markasini giriniz: ");
			String marka = scanner.nextLine();
			System.out.println("Boyutunu (inch olarak) giriniz: ");
			String boyut = scanner.nextLine();
			tv = new Televizyon(marka, boyut);
			System.out.println("Televizyonunuz kurulmustur-->>" + " Tv markanız --> " + tv.getMarka() + "  Tv boyutunuz --> "
					+ tv.getBoyut());

			tvAcikMi = false;
			tv.kanallariOlustur();

		} else {
			System.err.println("Televizyonunuz zaten kurulmustur!");
		}

	}

}
