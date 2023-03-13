package lesson006;

import java.util.Scanner;

public class Question003 {

	public static void main(String[] args) {
		// ikiye ikilik bir array oluşturalım
		//bu arayin içine isimler yazdıracağız
		//isimleri kullanıcıdan alacagız
		// çıktı olarak
		// 1 .group  ali ve mehmet
		// 2 .grup ahmet ve hakan
		
        String[][] array = new String[2][2];
        
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
        	for (int j = 0; j < array.length; j++) {
        		System.out.println("İsim");
				String isim = sc.nextLine();
				array[i][j]= isim ;
				
			}
			
		}
        for (int i = 0; i < array.length; i++) {
        	System.out.println(i+1 + ". Group");
        	for (int j = 0; j < array.length; j++) {
				System.out.println(array[i][j]);
			}
			
		}
        
      

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	}
