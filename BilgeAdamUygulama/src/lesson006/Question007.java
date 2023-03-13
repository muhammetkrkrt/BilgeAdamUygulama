package lesson006;

import java.util.Scanner;

public class Question007 {

	public static void main(String[] args) {
		// Girilen metinde türkçe karakterleri ingilizce karaktere çeviriyoruz
		
		String[] ingilizceKarakter = { "I", "i", "s", "S", "c", "C", "g", "G", "u", "U", "o", "O" };
	    String[] turkceKarakter = { "İ", "ı", "ş", "Ş", "ç", "Ç", "ğ", "Ğ", "ü", "Ü", "ö", "Ö" };

        Scanner sc = new Scanner(System.in);
        System.out.println("Kelimeyi giriniz : ");
        String kelime = sc.nextLine();
        for (int i = 0; i < turkceKarakter.length; i++) {
		if(kelime.contains(turkceKarakter[i])) {
			
        kelime = kelime.replace(turkceKarakter[i], ingilizceKarakter[i]);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        }}
        System.out.println(kelime);
			
			
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}}
