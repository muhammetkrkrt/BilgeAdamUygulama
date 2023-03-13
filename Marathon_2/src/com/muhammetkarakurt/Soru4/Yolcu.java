package com.muhammetkarakurt.Soru4;

import java.util.ArrayList;
import java.util.List;

public abstract class Yolcu {
	
         //////////Fields /////////////////
	
	private int id ;
	private String ad;
	private String soyad;
	private int koltukNo;
	private boolean checkIn;
	private final int BASEFIYAT = 100;
	static List<Integer> biletNumaralari = new ArrayList<>() ;
	
           //////////////Constructors ///////////
	
	public Yolcu(int id, String ad, String soyad) {
		super();
		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
		biletleriDoldur();
	}
/////////////////    Metods   //////////////
	
	private static void biletleriDoldur() {
		for (int i = 1; i < 200; i++) {
			biletNumaralari.add(i);
		}
	}
	
/////////////////   Abstract  Metods   //////////////
	
	public abstract void yolcuBilgileriniGetir();
	public abstract void checkInYap();
	public abstract void ucagaBin();
	public abstract void biletAl(EFirma eFirmaAdi);
	
 /////////////// Getter and Setter /////////////

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public int getKoltukNo() {
		return koltukNo;
	}

	public void setKoltukNo(int koltukNo) {
		this.koltukNo = koltukNo;
	}

	public boolean isCheckIn() {
		return checkIn;
	}

	public void setCheckIn(boolean checkIn) {
		this.checkIn = checkIn;
	}

	public static List<Integer> getBiletNumaralari() {
		return biletNumaralari;
	}

	public static void setBiletNumaralari(List<Integer> biletNumaralari) {
		Yolcu.biletNumaralari = biletNumaralari;
	}

	public int getBASEFIYAT() {
		return BASEFIYAT;
	}

	



}
