package lesson004;

import java.util.Scanner;

public class Question007 {

	public static void main(String[] args) {

		//          Menu 1-Dışarıdan bir kelime ve bir harf girilsin  eğer kelimemizin
		// için de o 
		//         harf varsa kaç tane olduğunu ve index numaralarını yazdırın.
		//         eğer harfi içermiyorsa bir çıktı aradağınız harf yok gibi
		//         2-Dışarıdan bir kelime giriniz daha sonra değiştirmek istediğiniz
		// harfi
		//           giriniz daha sonra hangi harfle değiştireceğinizi giriniz Eğer
		// kelimemiz
		//           içerisinde o harf varsa değiştirsin.
		//         3-Dışarıdan Girilen bir kelimeyi ters çevirip yazdıralım.Polindrom
		// olup
		//          * olmadığını bulunuz(kek,iki,kabak,kayak)
		// 4 sistemden çık

		Scanner sc = new Scanner(System.in);
		boolean kontrol = true;
		while (kontrol) {
			System.out.println("=====String İşemleri=====");
			System.out.println("1-Harf Saydırma");
			System.out.println("2-Harf Değiştirme");
			System.out.println("3-Polindrom Kontrolu");
			System.out.println("4- kelimenin harflerinin arasına ? koy"); // en sona koymicaz
			System.out.println("5- kelimenin ilk üç indexinin alıp sonuna ... koyun");
			System.out.println("6- kelimenin ilk üç geri kalan hafler yerine ... koyalım");
			int secim = sc.nextInt();
			sc.nextLine();

			switch (secim) {
			case 1:
				int sayac = 0;
				String indexler = "";
				System.out.println("Lütfen bir kelime giriniz:");
				String kelime = sc.nextLine();
				System.out.println("Hangi harfi saymak istiyorsunuz:");
				String harf = sc.nextLine();
				if (!kelime.contains(harf)) {
					System.out.println("Aradığınız harf kelimenin içinde yoktur.");
				} else {
					for (int i = 0; i < kelime.length(); i++) {
						if (kelime.charAt(i) == harf.charAt(0)) {
							sayac++;
							indexler += i + ",";
							System.out.print(indexler);

						}
					}
					System.out.println(sayac + " adet " + harf + " harfi var");
				}

				break;
			case 2:
				System.out.println("Lütfen bir kelime giriniz:");
				String kelime2 = sc.nextLine();
				System.out.println("Değiştirmek istediğiniz harfi giriniz:");
				String eskiHarf = sc.nextLine();
				System.out.println("Neyle Değiştireceğiz:");
				String yeniHarf = sc.nextLine();
				if (kelime2.contains(eskiHarf)) {
					kelime2 = kelime2.replace(eskiHarf, yeniHarf);
					System.out.println("yeni kelime:  " + kelime2);
				} else {
					System.out.println("Değiştirmek istediğiniz harf kelimede mecut değil");
				}
				break;
			case 3:
				System.out.println("Lütfen bir kelime giriniz:");
				String kelime3 = sc.nextLine();
				String kelime4 = "";
				for (int i = kelime3.length() - 1; i >= 0; i--) {
					kelime4 = kelime4 + kelime3.charAt(i);
				}
				if (kelime3.equals(kelime4)) {
					System.out.println(kelime4 + " polindrom bir kelimedir");
				} else {
					System.out.println(kelime3 + " polindrom kelime değildir");
				}

				break;
			case 0:
				kontrol = false;
				System.out.println("Çıkış yaptınızzzz.");

				break;
			case 6:
				System.out.println("Lütfen kelimeyi giriniz:");
				String kelime5 = sc.nextLine();
				String yeniKelime = "";
				for (int i = 0; i < kelime5.length(); i++) {
					if (i < 3) {
						yeniKelime += kelime5.charAt(i);
					} else {
						yeniKelime += ".";

					}
				}
				System.out.println(yeniKelime);
			default:
				break;

			case 4:
				StringBuilder stringBuilder = new StringBuilder();
				System.out.println("kelime giriniz:");
				String kelime6 = sc.nextLine();
				for (int i = 0; i < kelime6.length(); i++) {
					stringBuilder.append(kelime6.charAt(i) + "?");
				}
				String yeni = stringBuilder.toString();

				System.out.println(yeni);
				System.out.println(stringBuilder.substring(0, stringBuilder.length() - 1));
				break;
			case 5:
				

			}
		}

	}

}
