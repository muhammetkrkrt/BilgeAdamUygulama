package lesson001;

import java.util.Scanner;

public class Question008 {

	public static void main(String[] args) {
		// Kenarları girilen üçgenin nasıl bir üçgen oldugunu bulan program

		Scanner scanner = new Scanner(System.in);

		System.out.println("1 kenar giriniz: ");
		int kenar1 = scanner.nextInt();

		System.out.println("2 kenar giriniz: ");
		int kenar2 = scanner.nextInt();

		System.out.println("3 kenar giriniz: ");
		int kenar3 = scanner.nextInt();
		
		if(kenar1 > 0 && kenar2 >0 && kenar3 >0) {
			if (kenar1 == kenar2 && kenar2 == kenar3) {
				System.out.println("eşkenar üçgendir");
			}else if(kenar1 == kenar2 || kenar1 == kenar3 || kenar2==kenar3) {
				if(kenar1 ==4) {
					System.out.println("kenar1 4tür");
				}
				System.out.println("ikiz kenar üçgendir");
			}else {
				System.out.println("çeşit kenar üçgen");
			}
		}else {
			System.out.println("üçgen oluşturamazsınız girdiğiniz sayılar 0 dan büyük olmasl lazım");
		}
	}
}