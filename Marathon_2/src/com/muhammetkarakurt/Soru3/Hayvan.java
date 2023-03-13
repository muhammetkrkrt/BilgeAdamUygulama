package com.muhammetkarakurt.Soru3;

public abstract class Hayvan {

	         /////////////// Fields ////////////// 
	
	private String ad;
	private int kilosu;
	private int uzunlugu;
	private boolean tehlikeliMi;
	private String sinifAdi;
	private String ustSinifAdi ;
	
	
	
           //////////////Constructors ///////////
	public Hayvan(String ad, int kilosu, int uzunlugu) {
		super();
		this.ad = ad;
		this.kilosu = kilosu;
		this.uzunlugu = uzunlugu;
		this.tehlikeliMi = false;	
	}
	
	
	/////////////// Abstract Metods /////////////////
	
	public abstract void sesCikar();

	/////////////// Getter and Setter /////////////
	
	
	public String getAd() {
		return ad;
	}
	public void setIsim(String ad) {
		this.ad = ad;
	}
	public int getKilosu() {
		return kilosu;
	}
	public void setKilosu(int kilosu) {
		this.kilosu = kilosu;
	}
	public int getUzunlugu() {
		return uzunlugu;
	}
	public void setUzunlugu(int uzunlugu) {
		this.uzunlugu = uzunlugu;
	}
	public boolean isTehlikeliMi() {
		return tehlikeliMi;
	}
	public void setTehlikeliMi(boolean tehlikeliMi) {
		this.tehlikeliMi = tehlikeliMi;
	}
	public String getSinifAdi() {
		return sinifAdi;
	}
	public void setSinifAdi(String sinifAdi) {
		this.sinifAdi = sinifAdi;
	}
	
	public String getUstSinifAdi() {
		return ustSinifAdi;
	}

	public void setUstSinifAdi(String ustSinifAdi) {
		this.ustSinifAdi = ustSinifAdi;
	}
	
	
	/////////////    toString     /////////////////

	

	@Override
	public String toString() {
		return "Hayvan [Adi=" + ad + ", kilosu=" + kilosu + ", uzunlugu=" + uzunlugu + ", tehlikeliMi=" + tehlikeliMi
				+  "]";
	}
	
	
	
}
