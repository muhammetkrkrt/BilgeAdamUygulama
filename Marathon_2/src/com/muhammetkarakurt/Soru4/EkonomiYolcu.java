package com.muhammetkarakurt.Soru4;

import java.util.HashMap;
import java.util.Map;

public class EkonomiYolcu extends Yolcu {
	
        //////////  Fields /////////////////
	
	private final int EKONOMIFIYAT = 100;
	private Map<String, Integer> eBiletler;
	
      //////////////Constructors ///////////

	public EkonomiYolcu(int id, String ad, String soyad) {
		super(id, ad, soyad);
		this.eBiletler = new HashMap<>();
	}


          /////////////////    Metods   //////////////
	
	@Override
	public void biletAl(EFirma eFirmaAdi) {
		
		int biletFiyatı = getBASEFIYAT()+EKONOMIFIYAT;
		
		if (eBiletler.containsKey(eFirmaAdi.toString())) {
			eBiletler.put(eFirmaAdi.toString(), eBiletler.get(eFirmaAdi.toString())+biletFiyatı);
			System.out.println(eFirmaAdi.toString() + " Adlı firmadan bir bilet daha alimistir biletleriniz-->" + eBiletler); 
		} else {
			eBiletler.put(eFirmaAdi.toString(), biletFiyatı);
			System.out.println(getAd() +" "+getSoyad()+ " yolcusu " + eFirmaAdi.toString()+ " icin Ekonomi sınıfından bilet alimistir Biletleriniz -->" + eBiletler);
		}
		setKoltukNo(biletNumaralari.get((int) (Math.random() * biletNumaralari.size())));
		biletNumaralari.remove((int) (Math.random() * biletNumaralari.size()));
	}

	@Override
	public void checkInYap() {
		if (isCheckIn()) {
			System.out.println(getAd() + " "+getSoyad()+ " icin zaten chekin  yapilmistir . Ucaga binebilirsiniz");
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
			System.out.println(getAd() + " "+ getKoltukNo() + " numaralı koltukda ucaga binebilirsiniz");

	}
	
	public void yolcuBilgileriniGetir() {
		System.out.println("Yolcu Bilgileri --> Ekonomi Yolcusu "+getAd()+" " + getSoyad()+" Biletleri "+eBiletler );

	}
	
           /////////////// Getter and Setter /////////////

	public Map<String, Integer> getBiletler() {
		return eBiletler;
	}

	
}
