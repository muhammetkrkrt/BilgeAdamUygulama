package lesson005;

import java.util.Random;
import java.util.Scanner;

public class Question002 {

	public static void main(String[] args) {
		// random int sayı üretmemiz lazım
		//random sayıyı üretelim 0 ile 100 arasında bunu yazdıralım
		  Random rastgele = new Random();
		  // 0-99 arası sayıları çeker.
		  int sayi = rastgele.nextInt(0,3);
          int secim = -1 ;
          int sayac = 0 ;
          while(secim != 0) {
        	  sayac++;
        	  Scanner sc=new Scanner(System.in);
              System.out.println("Lütfen bir sayı giriniz:");
              int kSayi = sc.nextInt();
            
          if(sayi>kSayi) {
          System.out.println("litfen sayıyı yükseltin");
          sayac++;
        
          }else if (sayi<kSayi) {
          System.out.println("lütfen sayıyı azaltın");
          }
          
          else {
        	  System.out.println(sayac+ ".adımda buldunuz");
        	  System.out.println("Devam etmek istiyor musunuz Evetse 1 Hayırsa 0");
        	  secim=sc.nextInt();
        	  sayac= 0;
        	 
        	  
          }
          
         
          
          
          }
         
          
          
}}
