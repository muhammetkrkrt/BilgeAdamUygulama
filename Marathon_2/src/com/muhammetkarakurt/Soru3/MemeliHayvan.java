package com.muhammetkarakurt.Soru3;

public abstract class MemeliHayvan extends Hayvan{
	
	
          //////////////Constructors ///////////
	
	public MemeliHayvan(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu);
		setUstSinifAdi("MemeliHayvan");
	}

	
	      ////////////// Abstract  Metods ////////////
	public abstract void yuru();
}
