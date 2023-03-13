package lesson003;

import java.util.Scanner;

public class Question005 {

	public static void main(String[] args) {
		// Girilen sayının faktöriyelini bulan program
		Scanner scanner=new Scanner(System.in);
		System.out.println("Bir sayı girelim:");
		int sayi=scanner.nextInt();
		int fak =1;
		
		for(int i = 1;i<=sayi;i++) {
			fak = fak * i ;
		}
		System.out.println("faktöriyeli:" + fak);

	}

}
