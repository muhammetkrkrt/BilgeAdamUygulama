package lesson001;

import java.util.Scanner;

public class Question007 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("sayı giriniz:");
		int sayi=scanner.nextInt();
		if(sayi%2 ==0) {
			System.out.println("girilen sayı çifttir.");
		}
		else  {
			System.out.println("girilen sayı tektir");
		}
		

	}

}
