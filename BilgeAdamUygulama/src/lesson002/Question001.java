package lesson002;

import java.util.Scanner;

public class Question001 {

	public static void main(String[] args) {
		// dairenin çevresini ve alanını hesaplayan program
		//r degerini 
		//pi = 3.14
		Scanner scanner= new Scanner(System.in);
		System.out.println(" yarı çapı giriniz");
	     double r = scanner.nextDouble();
	     double pi = 3.14;
	     
	  
	     double cevre = 2 * (pi * r );
	     double alan = pi * r * r ;
	     System.out.println("çevre:" + cevre);
	     System.out.println("alan: " + alan );

	}

}
