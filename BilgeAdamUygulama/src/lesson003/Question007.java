package lesson003;

import java.util.Scanner;

public class Question007 {

	public static void main(String[] args) {
		//girilen sayının asal olup olmadığıını bulan program
		Scanner scanner=new Scanner(System.in);
		System.out.println("lütfen sayıyı giriniz");
		int sayi=scanner.nextInt();
		
		boolean isPrime=true ;
		for (int i = 2;i<sayi;i++) {
			if(sayi%i == 0) {
				isPrime = false ;
				}
			else {
				isPrime= true ;
				
			}
			if(isPrime == false) {
				System.out.println("asal sayı değildir");
				break;
			}
			else {
				System.out.println("asal sayıdır");
				break;
			}
				
	

	}

}}
