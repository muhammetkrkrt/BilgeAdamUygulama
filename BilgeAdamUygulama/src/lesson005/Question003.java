package lesson005;

import java.util.Arrays;

public class Question003 {

	public static void main(String[] args) {
		// a ile biten kelimelerin yerine ? yoycaz
        // 0 index değişti diyelim --> yeni değeri 
	
	       String[] dizi = { "Amerika" , "Almanya" , "İsveç" , "Türkiye" ,"Danimarka"};
	       
	       for (int i = 0; i<dizi.length ;i++) {
	    	   if(dizi[i].endsWith("a")) {
	    		   dizi[i]="?";
	    		   String yeniDeger = dizi[i];
	    		   System.out.println(i+ ".indexi değişti-->" + yeniDeger);
	    	   }
	    	   
	       }
	       System.out.println(Arrays.toString(dizi));
	       
	
	
	
	
	
	
	
	
	
	
	

}	}

