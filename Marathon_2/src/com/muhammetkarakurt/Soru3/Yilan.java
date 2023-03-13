package com.muhammetkarakurt.Soru3;

public class Yilan extends Surungenler{

	
            //////////////Constructors ///////////
	
	public Yilan(String isim, int kilosu, int uzunlugu) {
		super(isim, kilosu, uzunlugu);
		setSinifAdi("Yilan");
		setTehlikeliMi(true);
	}

	
        /////////////////    Metods   override   //////////////
	
	@Override
	public void surun() {
		
		System.out.println(getAd() + " isimli " + getSinifAdi() + "surunuyor...");
	}

	@Override
	public void sesCikar() {
		System.out.println( getAd() + " tisss'liyor...");
		
	}


}
