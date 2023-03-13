package com.muhammetkarakurt.Soru3;

public abstract class  Surungenler extends Hayvan {
	
             //////////////Constructors ///////////

	public Surungenler(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu);
		setUstSinifAdi("Surungen");
	}

           //////////////Abstract  Metods ////////////
	
	public abstract void surun(); 
}
