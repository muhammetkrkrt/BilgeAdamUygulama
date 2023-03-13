package com.muhammetkarakurt.Soru4;

import java.util.HashMap;
import java.util.Map;

public class BusinessYolcu extends Yolcu {
	
      /////////////// Fields //////////////
	
	private final int BUSINNESFIYAT = 200;
	private final int BUSINNESVIPFIYAT = 150;
	private Map<String, Integer> bBiletler;
	private boolean isVIP;
	
         //////////////Constructors ///////////
	
	public BusinessYolcu(int id, String ad, String soyad, boolean isVIP) {
		super(id, ad, soyad);
		this.isVIP = isVIP;
		this.bBiletler = new HashMap<>();
	}

      /////////////////    Metods   //////////////

	@Override
	public void biletAl(EFirma eFirmaAdi) {

		
		if (isVIP()) {
			int biletFiyatı =getBASEFIYAT() + BUSINNESFIYAT +BUSINNESVIPFIYAT;
			bBiletler.put(eFirmaAdi.toString(), biletFiyatı);
			System.out.println(getAd() +" "+getSoyad()+ " yolcusu " + eFirmaAdi.toString() + " icin VIP bilet almistir Biletleriniz -->"+ bBiletler);
		} else {
			int biletFiyatı = getBASEFIYAT()+ BUSINNESFIYAT;
			bBiletler.put(eFirmaAdi.toString(), biletFiyatı);
            System.out.println(getAd() +" "+getSoyad()+ " yolcusu " + eFirmaAdi.toString() + " icin bilet almistir Biletleriniz -->"+ bBiletler);
		}
		int sayi = (int)(Math.random()*biletNumaralari.size());
		setKoltukNo(biletNumaralari.get(sayi));
		biletNumaralari.remove(sayi);
	}

	@Override
	public void checkInYap() {
		if (isCheckIn()) {
			System.out.println(getAd() +" "+getSoyad()+ " icin zaten chekin  yapilmistir . Ucaga binebilirsiniz");
		} else {
			System.out.println("Checkin yapilmistir , iyi seyehatler..");
			setCheckIn(true);
		}

	}

	@Override
	public void ucagaBin() {
		if (!isCheckIn()) {
			System.out.println("Ucaga binmek icin önce checkin yapiniz");
		} else
			System.out.println(getAd() +" " +getSoyad()+ " "+ getKoltukNo() + " numarali koltukda ucaga binebilirsiniz");

	}
	
	public void yolcuBilgileriniGetir() {
		System.out.println("Yolcu Bilgileri --> Busines Yolcusu "+getAd()+" " +getSoyad()+" Biletleri "+bBiletler );

	}
	
	
         /////////////// Getter and Setter /////////////

	public boolean isVIP() {
		return isVIP;
	}

	public void setVIP(boolean isBusiness) {
		this.isVIP = isBusiness;
	}

	public Map<String, Integer> getBiletler() {
		return bBiletler;
	}
}
