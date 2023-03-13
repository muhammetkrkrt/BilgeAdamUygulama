package lesson018;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class SetOrnek {

	public static void main(String[] args) {
		
		
		// 2 tane set olusturalim 
		// tekrar edenler tekrar etmeyenler
		//kullanicidan bir kelime alalim 
		//eger tekrar eden harf varsa tekrar edenlersetine atalim
		//ve tekrar etmeyelerden cikaralim 
		//tekrar edenleri ve etmeyenleri yazdiralim
		
		
		
		HashSet<Character> tekrarEden = new HashSet<>();
		HashSet<Character> tekrarEtmeyen = new HashSet<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Metin giriniz:");
		String kelime = sc.nextLine();
		
		for (int i = 0; i < kelime.length(); i++) {
			for (int j = i+1; j < kelime.length(); j++) {
				if(kelime.charAt(i) == kelime.charAt(j)) {
					tekrarEden.add(kelime.charAt(i));
				}
				
			}if(!tekrarEden.contains(kelime.charAt(i))) {
				tekrarEtmeyen.add(kelime.charAt(i));
			}
		}
		System.out.println(tekrarEden);
		System.out.println(tekrarEtmeyen);

	}

}
