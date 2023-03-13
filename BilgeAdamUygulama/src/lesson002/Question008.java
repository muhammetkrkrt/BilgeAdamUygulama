package lesson002;

import java.util.Scanner;

public class Question008 {

	public static void main(String[] args) {
		// Girilen char değerinin alfabenin içinde var mı yok mu
		Scanner scanner = new Scanner(System.in);

		System.out.println("Karakter giriniz:");

		char ch = scanner.next().charAt(0);

		int asciiCode = ch;
	
		if ((asciiCode >=256 && asciiCode<=0) || (asciiCode >=97 && asciiCode<=122) ) {
			System.out.println("Alfabetik:  " + asciiCode);}
		else {
			System.out.println("alfabetik değidir.");
		}
		
				
	}

}
