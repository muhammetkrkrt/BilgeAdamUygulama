package lesson003;

import java.util.Scanner;

public class Question013 {

	public static void main(String[] args) {
		// girilen sayının basamaklarını açıkla
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Lütfen sayıyı giriniz:");
		int sayi=scanner.nextInt();
		int i = 1;
		while(sayi>0) {
			System.out.println(i + "ler basamagı"+ sayi%10);
			sayi /= 10;
               i=i*10;
    }
    
		

	}

}
