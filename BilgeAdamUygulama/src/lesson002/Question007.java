package lesson002;

import java.util.Scanner;

public class Question007 {

	public static void main(String[] args) {
		//girilen karakterin asci kodunu bulan program
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Karakter giriniz:");
		
		char ch = scanner.next().charAt(0);
		
		 int asciiCode= ch;
		 System.out.println("ascii kodunuz:" + asciiCode);
		 
	

	}

}
