package lesson017;

import java.util.ArrayList;
import java.util.List;

public class ArrayListOrnek {
	
	public static void degerDegistirme(ArrayList<String> sehirler) {
		for (int i = 0; i < sehirler.size(); i++) {
			if(sehirler.get(i).toLowerCase().startsWith("an")) {
				sehirler.set(i, "xxx");
			}
		}
	}

	public static void main(String[] args) {
		
		//bir tane arraylist olusturalim
		//bu arraylistin icinde manuel sehir atalim
		//bu sehirlerden an ile baslayan varsa bu sehri "xxx"
		
		
		ArrayList<String> sehirler =new ArrayList<>();
		sehirler.add("ankara");
		sehirler.add("istanbul");
		sehirler.add("adana");
		
		for (String string : sehirler) {
			if(string.startsWith("an")) {
			  string = "xxx";
			}
			
		}
		degerDegistirme(sehirler);
		
		System.out.println(sehirler.toString());

	}
	
}
