package lesson009;

import java.util.Scanner;

public class Menu {
	public static Scanner scanner = new Scanner(System.in);

	// Heapte static fieldlar program başladıgında kendine özel bir yer ayırır.
	// program kapanana kadar bellekte kalır

	public void menu() {
		boolean check = true;

		while (check) {
			System.out.println("1-Toplama");
			System.out.println("2-Çıkarma");
			System.out.println("Seçiminiz: ");

			Scanner scanner = new Scanner(System.in);
			int secim = scanner.nextInt();
			scanner.nextLine();
			switch (secim) {
			case 1:
				toplam();
				break;
			case 2:
				cikarma();
				break;
			case 3:
				bolme();
				break;
			case 4:
				usAlma();
				break;

			default:
				System.out.println("geçerli sayı giriniz");
				break;
			}
		}
	}

	public static void usAlma() {
		int usSonuc = 1;
		System.out.println("Taban: ");
		int sayi = scanner.nextInt();

		System.out.println("Us: ");
		int kuvvet = scanner.nextInt();

		for (int i = 0; i < kuvvet; i++) {
			usSonuc *= sayi;
		}
		System.out.println(usSonuc);
	}

	// 15:00
	public static void bolme() {
		System.out.println("kaç adet sayi giriceksiniz: ");
		int sayi = scanner.nextInt();
		float bolme = 0;
		for (int i = 0; i < sayi; i++) {
			System.out.println(i + 1 + ".sayi");
			float a = scanner.nextFloat();
			if (i == 0) {
				bolme = a;
			} else {
				bolme = bolme / a;
			}
		}
		System.out.println("Sonuc " + bolme);
	}

	private static void cikarma() {
		int i = 1;
		int result = 0;
		System.out.println("kaç adet sayi giriceksiniz: ");
		int n = scanner.nextInt();
		while (i <= n) {
			System.out.println(i + ".sayi");
			int sayi = scanner.nextInt();
			if (i == 1) {
				result += sayi;
				i++;
				break;
			}
			result -= sayi;
			i++;
		}
		System.out.println("Sonuc " + result);
	}

	private static void toplam() {
		int toplam = 0;
		int i = 1;
		boolean check = true;

		while (check) {
			System.out.println(i++ + ". sayi");
			int sayi = scanner.nextInt();
			if (sayi != 0) {
				toplam += sayi;
			} else {
				check = false;
				System.out.println("Sonuc: " + toplam);
			}
		}

	}
}
