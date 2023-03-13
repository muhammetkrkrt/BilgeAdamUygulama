package lesson014.helper;

import java.util.Random;

import lesson011.Product;

public class RandomGenererateld {

	public static  String Random() {
		
	    Random rd = new Random();
		
		long sayi = rd.nextLong(1000,5000);
		String id = String.valueOf(sayi);
		
		
		return id ;
	}
public static  String urunKodu(String name) {
		
	    Random rd = new Random();
		
		long sayi = rd.nextLong(100,999);
		String id = String.valueOf(sayi);
		
		
		
		return id ;
	}
	
	
	
}
