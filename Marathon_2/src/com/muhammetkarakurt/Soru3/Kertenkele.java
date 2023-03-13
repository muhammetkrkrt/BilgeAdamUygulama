package com.muhammetkarakurt.Soru3;

public class Kertenkele extends Surungenler{

                //////////////Constructors ///////////
	
	public Kertenkele(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu);
		setSinifAdi("Kertenkele");
		setTehlikeliMi(false);
	}
	
	
    /////////////////    Metods   override   //////////////

      public void surun() {
		
		System.out.println(getAd() + " isimli " + getSinifAdi() + "  surunuyor...");
	}

	@Override
	public void sesCikar() {
		System.out.println( getAd() + " ses cikariyor...");
		
	}



}
