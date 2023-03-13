package com.muhammetkarakurt.Soru3;

public class Aslan  extends MemeliHayvan{
	
	//////////////  Constructors ///////////
	
	public Aslan(String isim, int kilosu, int uzunlugu) {
		super(isim, kilosu, uzunlugu);
		setSinifAdi("Aslan");
		setTehlikeliMi(true);
	}

	
	//////////// Metods Override /////////////
	
	public void yuru() {
		System.out.println(getAd()+" isimli "+getSinifAdi()+ " yürüyor..");
		
	}

	
	public void sesCikar() {
		
		System.out.println(getAd()+ " kükrüyor...");
		
	}

	

}
