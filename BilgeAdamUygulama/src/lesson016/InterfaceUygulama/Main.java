package lesson016.InterfaceUygulama;

public class Main {
	static Kutuphane kutuphane = new Kutuphane("Milli Kutuphane");
	public static void adminMenu() {
		
		while (true) {
			System.out.println(" 1 - Kitap Ekle");
			System.out.println(" 2 -Butun Kitaplari Listele");
			System.out.println(" 3 -Yazara ait kitaplar");
			System.out.println(" 4 -Kitap sil");
			System.out.println(" 5 - Indirim yap.");
			System.out.println(" 6- Kitap guncelle .");
			System.out.println(" 7- Indirimdeki kitaplari listele .");
			int secim = Util.intDegerAl("Seciminiz?");
			switch (secim) {
			case 1 :
				kutuphane.kitapEkle();
				break;
			case 2 :
				kutuphane.kitapListele();
			case 3 :
				kutuphane.yazarBul();
				break;
			case 4 :
				kutuphane.kitapSil();
				break;
			case 5 :
				kutuphane.indirimYap();
		        break;
			case 6 :
				kutuphane.kitabiGuncelle();
				break;
			case 7:
				
			default:
				break;
			}
		}
	}

	public static void main(String[] args) {
		
//       int sayi = Util.intDegerAl("Lutfen deger girin:");
//       String isim = Util.stringDegerAl("Lutfen isim giriniz: ");
//		
//		System.out.println(sayi + " " + isim);
		
		
		adminMenu();
		
		
	}

}
