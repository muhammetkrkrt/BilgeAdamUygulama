package lesson001;

import java.util.Scanner;

public class Question005 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Tl miktarı giriniz");
		
		float tl = scanner.nextFloat();
		float dolar =18.81f;
		float kur=tl/dolar;
		System.out.println(kur+"USD");
				
		
		
		

	}

}
