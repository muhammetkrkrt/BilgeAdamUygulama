package lesson008;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Question006 {
	public static void ortalamaHesapla(int sayi) {
		ArrayList<Integer> girilenSayilar = new ArrayList<Integer>();
		int toplam = 0 ;
		for (int i = 0 ; i < sayi ; i++) {
	    	   Random rnd = new Random();
	    	   int sayi1 = rnd.nextInt(500);
	    	   girilenSayilar.add(sayi1);
	    	   
	    	   toplam +=sayi1;
	    	   }
		int ortalama = (toplam/girilenSayilar.size());
		System.err.println(girilenSayilar.toString());
		System.out.println("Ortalama: " + ortalama);
		
		
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Lütfen arrayin uzunluğunu giriniz");
		int uzunluk = sc.nextInt();
		ortalamaHesapla(uzunluk);

	}

}
