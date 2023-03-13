package lesson009;

import java.util.Scanner;

public class Questin004 {
	static String[] iller = { "Adana", "Adıyaman", "Afyon", "Ağrı", "Amasya", "Ankara", "Antalya", "Artvin", "Aydın",
			"Balıkesir", "Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankırı", "Çorum",
			"Denizli", "Diyarbakır", "Edirne", "Elazığ", "Erzincan", "Erzurum", "Eskişehir", "Gaziantep", "Giresun",
			"Gümüşhane", "Hakkari", "Hatay", "Isparta", "Mersin", "İstanbul", "İzmir", "Kars", "Kastamonu", "Kayseri",
			"Kırklareli", "Kırşehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa", "Kahramanmaraş", "Mardin",
			"Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Rize", "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas",
			"Tekirdağ", "Tokat", "Trabzon", "Tunceli", "Şanlıurfa", "Uşak", "Van", "Yozgat", "Zonguldak", "Aksaray",
			"Bayburt", "Karaman", "Kırıkkale", "Batman", "Şırnak", "Bartın", "Ardahan", "Iğdır", "Yalova", "Karabük",
			"Kilis", "Osmaniye", "Düzce" };

	public static void main(String[] args) {

//		Scanner scanner = new Scanner(System.in);
//		String deger = scanner.nextLine();
//		ilMethodu(deger.charAt(1));

		// bIleBaslayanlar(iller);

//		String[] sesliHarfleriSilinmis = sesliHarfleriSil();
//
//		for (int i = 0; i < sesliHarfleriSilinmis.length; i++) {
//
//			System.out.println(sesliHarfleriSilinmis[i]);
//		}
		
		plakaBul(iller, "Ankara","Adana","Bursa","İzmir");

	}

	// parametre olarak girilen harfe göre ikinci harfi girilen harf ile
	// bulunan şehirleri ilk üç harfini büyük bastıran methodu
	// "a"
	// Bayburt --> BAY
	// Karaman --> KAR

	public static void ilMethodu(char x) {
		for (int i = 0; i < iller.length; i++) {
			if (iller[i].charAt(1) == x) {
				System.out.println(iller[i] + "--> " + iller[i].substring(0, 3).toUpperCase());
			}
		}
	}

	// B harfi ile başlayan şehilerin ilk üç harfini alalım
	// metot parametre olarak dizi alsın
	// for each kullanalaım
	public static void bIleBaslayanlar(String[] array) {

		for (String kelime : array) {
			if (kelime.startsWith("B")) {
				System.out.println(kelime + "--> " + kelime.substring(0, 3).toUpperCase());
			}
		}
	}

	// Sesli harfleri silip silinmiş halini return eden bir method yazalım
	// metot String array döncek paramtre almasın
	// retrun eden arrayi mainde yazdıralım

	public static String[] sesliHarfleriSil() {
		String[] sesliHarfler = { "a", "e", "ı", "i", "o", "ö", "u", "ü" };
		String[] yeniDizi = new String[iller.length];
		
		for (int i = 0; i < iller.length; i++) {
			for (int j = 0; j < sesliHarfler.length; j++) {
				
				if (iller[i].toLowerCase().contains(sesliHarfler[j]) ) {

					iller[i] = iller[i].toLowerCase().replace(sesliHarfler[j], "");
					
				}
			}
			yeniDizi[i] = iller[i];
		}
		return yeniDizi;

	}
	//plakaBul(iller,"Ankara","Karaman");
	//parametre olarak array ve sınırsız sayıda String olarak şehir alsın
	//girilen şehirlerin plakalarını yazdırsın
	
	public static void plakaBul(String[] array, String... il ) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < il.length; j++) {
				if(array[i].equals(il[j])) {
					
					if(i<=9) {
						System.out.println("0" +(i+1) + "-" + array[i]);
					}else {
						System.out.println((i+1)+ "-" + array[i]);
					}
				}
			}
		}
	}
}
