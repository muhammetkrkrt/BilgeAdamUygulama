package lesson007;

import java.util.Scanner;

public class Question001 {

	public static void main(String[] args) {
		// iki kez aynı sayı klavyeden girilene kadar döngü devam edicek
		//üst üsteiki sayı girildiğinde o zamana kadar girilen sayıların
		//ortalamasını  veren program

		Scanner sc = new Scanner(System.in);
		int toplam = 0 ;
		int eskiSayi = 0 ;
		int sayi =0 ;
		int i = 0 ;
		boolean kontrol = true ;
		while (kontrol) {
			System.out.println("Lütfen sayı giriniz:");
			sayi = sc.nextInt();
			if(sayi != eskiSayi) {
				toplam += sayi ;
			
			eskiSayi = sayi ;
			i++;
			}else {
				kontrol = false ;
			}
			
		}
			
			System.out.println("Ortalama" + (toplam/i));
		
		
		
		
		
		
	

}}
