package lesson003;

import java.util.Scanner;

public class Question010 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Sayıyı giriniz :");
		int sayi=scanner.nextInt();
		boolean kontrol = true;
		if (sayi == 0) {
			System.out.println("sıfırdan farklı bir değer girin");
		} else {
			while (kontrol == true) {
				if (sayi % 5 == 0) {
					sayi = sayi / 5;
					if (sayi == 1) {
						System.out.println("5 in kuvvetidir.");
						kontrol = false;
					}
				} else {
					System.out.println("5 in kuvveti değildir");
					kontrol = false;
				}
			}
		}
		
		
	
		
		
		// Girilen sayının 5 in katı değilm bulan program 
//		for (int i = 0;i<=sayi;i++) {
//			if(sayi%5 == 0) {
//				System.out.println("Sayı beşin katıdır");
//				break;
//				
//			}
//			else {
//				System.out.println("Sayı beşin katı değildir.");
//				break;
//				
//			}
//		}
		
		
		//// Girilen sayının 5 in kuvveti değilm bulan program
//		if(Math.log(sayi)%Math.log(5)==0) 
//		{
//			System.out.println("sayı 5in kuvvetidir");
//			}
//		else
//		{System.out.println("sayı 5in kuvveti değildir");
//		}
		
		
		

	}

}
