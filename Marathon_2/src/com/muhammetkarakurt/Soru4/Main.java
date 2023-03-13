package com.muhammetkarakurt.Soru4;

public class Main {

	public static void main(String[] args)
	{
			
		Yolcu yolcu1 = new EkonomiYolcu(2222, "Yusuf", "Karakurt");	
		Yolcu yolcu2 = new BusinessYolcu(555, "Yunus", "Karakurt", false);	
		Yolcu yolcu3= new BusinessYolcu(1111, "Muhammet", "Karakurt", true);
		
		
		
		yolcu1.biletAl(EFirma.ADJ);
		yolcu1.ucagaBin();
		yolcu1.checkInYap();
		yolcu1.ucagaBin();
		System.out.println("\n -------------");
		yolcu2.biletAl(EFirma.ADJ);
		yolcu2.biletAl(EFirma.THY);
		yolcu2.ucagaBin();
		yolcu2.ucagaBin();
		yolcu2.checkInYap();
		System.out.println("\n----------------");
		yolcu3.biletAl(EFirma.ADJ);
		yolcu3.ucagaBin();
		yolcu3.ucagaBin();
		yolcu3.checkInYap();
		yolcu3.checkInYap();
		yolcu3.ucagaBin();
		yolcu3.yolcuBilgileriniGetir();
		

		
		
	}
}
