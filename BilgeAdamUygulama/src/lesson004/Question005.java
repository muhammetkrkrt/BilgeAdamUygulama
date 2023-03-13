package lesson004;

import java.util.Scanner;

public class Question005 {

	public static void main(String[] args) {
		// Verilen kelimeniniçinde kaçtane "e" olduğunu bulan algoritma



          Scanner sc=new Scanner(System.in);
          System.out.println("metni giriniz:");
          String  text = sc.nextLine();
          int counter = 0;
          for(int i = 0;i<text.length();i++) {
        	  if(text.charAt(i)=='e')
        		  counter++;
        		  
        	  
          }
          System.out.println(counter);

	
	}	}
