package lesson008;

import java.util.Date;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Question001 {
	public static int yasHesapla(int yıl) {
		int yas = 2023 - yıl ;
		return yas;
		
	}
	public static int yüzyılHesapla (int yil) {
		int yuzyil = yil /100 +1;
		return yuzyil;
	}
	public static void bilgileriYazdır() {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Lütfen doğum yılınızı giriniz: ");
	 int dogumYili =sc.nextInt();
	 int yas = yasHesapla(dogumYili);
	  int yuzyil =yüzyılHesapla(dogumYili);
		System.out.println("Yaşınız: " + yas +" Kaçınçı yüzyıl: " + yuzyil);
	}
	

	public static void main(String[] args) {
		// Dogum yılınızı girerek yaşınızı ve hangi yüzyılda doğduğunu hesaplayan program
		//3 farklı method yazıcaz 
		//yüzyıl hesapla 
		//yas hesapla
		//bilgilerYazdır
         bilgileriYazdır();
         
	}

}
