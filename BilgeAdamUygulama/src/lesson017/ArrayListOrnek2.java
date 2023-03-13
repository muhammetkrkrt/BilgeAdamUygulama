package lesson017;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class ArrayListOrnek2 {

	public static void main(String[] args) {
		// 1 tane cift sayilar
		//1 tane tek sayilar arraylisti acalim
		//1 den 100 e kadar 35 tane randon sayi uretelim 
		//uretilen sayilardan tekleri tekArrayListesine
		//cifleride ciftArrayListesine atalim
		
		
		ArrayList<Integer> tekSayilarListesi = new ArrayList<>();
		ArrayList<Integer> ciftSayilarListesi = new ArrayList<>();
		
		for(int i = 0 ; i < 35 ; i++){
			Random rd = new Random();
			int sayi = rd.nextInt(0,100);
			if(sayi % 2 == 0) {
				ciftSayilarListesi.add(sayi);
			}else {
				tekSayilarListesi.add(sayi);
			}
			
		}
		System.out.println(ciftSayilarListesi.toString());
		System.out.println(tekSayilarListesi.toString());
		

	}

}
