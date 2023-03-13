package lesson004;

import java.util.Scanner;

public class Question003 {

	public static void main(String[] args) {
		// Verilen kelimenin harflerini alt alta yazdıralım
		//java
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir kelime yazınız: ");
        String text = sc.nextLine();
        
        for (int i = 0 ; i<text.length();i++) {
        	System.out.println(i + ".indexsi ->" + text.charAt(i));
        	
        }
	}

}
