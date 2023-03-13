package lesson001;

import java.util.Scanner;

public class Question010 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
				System.out.println("1 sayıyı giriniz:");
				float sayi1,sayi2,sayi3;
				sayi1=scanner.nextFloat();
				System.out.println("2.sayıyı giriniz:");
				sayi2=scanner.nextFloat();
				System.out.println("3.sayıyı giriniz:");
				sayi3=scanner.nextFloat();
				float enBuyuk = sayi1;
				if(sayi2>enBuyuk) {
					enBuyuk=sayi2;
				}
				if(sayi3>enBuyuk) {
					enBuyuk=sayi3;
				}
			System.out.println("En büyük sayı:"+enBuyuk);
				
	}

}
