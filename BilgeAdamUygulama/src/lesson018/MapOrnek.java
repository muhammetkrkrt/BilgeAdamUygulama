package lesson018;

import java.util.HashMap;
import java.util.Scanner;

public class MapOrnek {

	public static void main(String[] args) {
		//character ve int tutan bi map olusturalim 
		//kullanicidan bir kelime alalim 
		//ve girilen kelimede hangi harften kac tane var onu yazdiralim
		
		HashMap< Character, Integer>  map = new HashMap<>();
		
		Scanner sc = new Scanner(System.in);
		String metin = sc.nextLine();
		
		
		for (int i = 0; i < metin.length(); i++) {
			char c = metin.charAt(i);
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
	
	
	
	
	}}

	

