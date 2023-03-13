package lesson005;

import java.util.Scanner;

public class Odev1 {

	public static void main(String[] args) {
		// dizi içerisinde 2 ve 4 ün kaç kere geçtiğini
		//hangisinin daha fazla olduğunu bulan program
		// ödevv kaçları istiyorsak kullanıcıdan alalım
		Scanner sc= new Scanner(System.in);
		System.out.println("Lütfen birinci sayıyı giriniz: ");
		int kSayi1=sc.nextInt();
		System.out.println("Lütfen ikinci sayıyı giriniz: ");
		int kSayi2 = sc.nextInt();
		int[] array = { 1, 3, 4, 4, 4, 2, 2, 2, 9, 8, 8 };
        int sayi1 =0 ;
        int sayi2 = 0 ;
	
		for (int i = 0; i < array.length; i++) {
			if(array[i] == kSayi1) {
	              sayi1++ ;
				
			}
			else if(array[i]== kSayi2) {
			       sayi2++;
			}
		}
		System.out.println(kSayi1 + " den " + sayi1 + " adet var");
		System.out.println(kSayi2 + " den " + sayi2 + " adet var");
		if(sayi1>sayi2) {
			System.out.println("daha çok geçen:  " + kSayi1 + " sayısıdır");
		}else if (sayi2>sayi1) {
			System.out.println("daha çok geçen:  " + kSayi2 + " sayısıdır");
		}else {
			System.out.println("Eşit sayıdalar ve : " + kSayi2 );
		}
		
	}

}