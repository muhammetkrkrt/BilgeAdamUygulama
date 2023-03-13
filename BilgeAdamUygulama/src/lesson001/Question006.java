package lesson001;

import java.util.Scanner;

public class Question006 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Vize:");
		double vizeNotu=scanner.nextDouble();
		
		System.out.println("Final:");
		double finalNotu=scanner.nextDouble();
		
		double ort1 = (vizeNotu*0.4) + (finalNotu*0.6);
		
				if(ort1<=50) {
					System.out.println("kaldı");
				}
				else {
					System.out.println("geçtiniz");
				}
		
	}

}
