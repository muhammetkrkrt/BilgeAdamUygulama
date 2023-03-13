package lesson005;

import java.util.Arrays;

public class Question004 {

	public static void main(String[] args) {
		// Tint[] sayilar = { 0, 120, -5, -85, -256, 16, 1258, 81, 14 } 
		//0 dan küçük sayılar yerine 100 koyalım;

		
		
		int[] sayilar = { 0, 120, -5, -85, -256, 16, 1258, 81, 14 };
		
		
		for(int i = 0;i<sayilar.length;i++) {
			
			if(sayilar[i]<=0) {
				sayilar[i] = 100 ;
	    	int yeniDeger = sayilar[i];
	       System.out.println(i+ ".indexi değişti-->" + yeniDeger);
			}
		}
		System.out.println(Arrays.toString(sayilar));
		
		   StringBuilder sb = new StringBuilder();
		   sb.append("My name is Muhammet.");
		           sb.append(" ");
		           sb.append("I am a lion tamer.");
		   System.out.println(sb.toString());
	}

}
