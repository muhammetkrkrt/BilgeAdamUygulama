package lesson004;

import java.util.Scanner;

public class Question002 {

	public static void main(String[] args) {
		// Klavyeden girilen 0 ile 100 arasında 100 dahil 5 adaet sayıdan 
		//en büyük ve en küçük sayıyı yazdıran program
		Scanner sc=new Scanner(System.in);
		int enBuyuk=0;
		int enKucuk=101;
		
		for(int i=1;i<=5;i++) {
			System.out.println(i+".sayı giriniz:");
			int sayi=sc.nextInt();
			if(sayi<=100 && sayi>0) {
				if(sayi>enBuyuk) {
					enBuyuk=sayi;
				}
				else if(sayi<enKucuk) {
					enKucuk=sayi;
					}
			}else {
				i--;
				System.out.println("lütfen 0-101 arası sayı giriniz");
			}
			
		}
		System.out.println("En büyük: " +enBuyuk + "   En küçük:" + enKucuk);

	}

}
