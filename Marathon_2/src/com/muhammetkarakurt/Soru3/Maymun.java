package com.muhammetkarakurt.Soru3;

public class Maymun  extends MemeliHayvan{
	
             //////////////Constructors ///////////
	
	public Maymun(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu);
		setSinifAdi("Maymun");
		setTehlikeliMi(false);
	}
	
     /////////////////    Metods   override   //////////////
	
	
	
	@Override
	public void yuru() {
		System.out.println(getAd()+" isimli "+getSinifAdi()+ " daldan dala atliyor..");
		
	}

	@Override
	public void sesCikar() {
		
		System.out.println(getAd()+ " ses cikariyor...");
		
	}

	

}
