package lesson001;

import java.util.Scanner;

public class Question009 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		double ort;
		
		System.out.println("ortalamayı giriniz: ");
         ort=scanner.nextDouble();
         
         if(ort>90) {
        	 System.out.println("Harf notunuz AA");
         }
         else if(ort>=80 && ort<=90) {
        	 System.out.println("Harf notunuz BB");
         }
         else if(ort>=70 && ort<80) {
        	 System.out.println("Harf notunuz CC");
         }
         else if (ort>=60 && ort<70) {
        	 System.out.println("Harf notunuz DD");
         }
         else  {
        	 System.out.println("Harf notunuz FF ve kaldınız!!");
         }
        		 
	}

}
