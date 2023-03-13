package com.muhammetkarakurt.Soru3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HayvanatBahcesi {
	
	///////////  Fields /////////////////
	
	Map<String, Hayvan> hayvanlar = new HashMap<>();
	
	
	
	/////////////////    Metods   //////////////
	
	
	public boolean  adiAyniOlanVarmi(Hayvan hayvan) {
		
		
		boolean varMi = hayvanlar.containsKey(hayvan.getAd());
		return varMi;

	}
	public void bahceyeHayvanEkle(Hayvan hayvan) {
		
		String ad = hayvan.getAd().toLowerCase();
   	
		if(adiAyniOlanVarmi(hayvan)) {
			System.out.println("Hayvanat bahcesinde " + hayvan.getAd() + " isimli hayvan zaten mevcut.");
			
		}else {
			hayvanlar.put(ad , hayvan);
			System.out.println(hayvan.getAd()+ " isimli "+hayvan.getSinifAdi() +"  hayvanat bahcesine eklendi..");
		}


	}
	
	
	public void bahceyeMemeliHayvanEkle(MemeliHayvan memeliHayvan) {
		
		String ad = memeliHayvan.getAd().toLowerCase();
		
		if (adiAyniOlanVarmi(memeliHayvan)) {
			System.out.println("Hayvanat bahcesinde " + memeliHayvan.getAd() + " isimli hayvan zaten mevcut.");
		} else {
			hayvanlar.put(ad, memeliHayvan);
			System.out.println(memeliHayvan.getAd()+ " isimli "+memeliHayvan.getSinifAdi() +"  hayvanat bahcesine eklendi..");
		}
	}
	
	
	
	public void bahceyeSurungenEkle(Surungenler surungen) {
		
		String ad = surungen.getAd().toLowerCase();
		
		if (adiAyniOlanVarmi(surungen)) {
			System.out.println("Hayvanat bahcesinde " + surungen.getAd() + " isimli hayvan zaten mevcut.");
		} else {
			hayvanlar.put(ad, surungen);
			System.out.println(surungen.getAd()+ " isimli "+surungen.getSinifAdi() +"  hayvanat bahcesine eklendi..");
		}
	}
	
	public void hayvanBilgileriniYazdir(String ad) {
		String ad1 = ad.toLowerCase();
		
		boolean kontrol = false ;
		for (Entry<String ,Hayvan> set : hayvanlar.entrySet()) {
			if(set.getKey().equals(ad1)) {
				System.out.println("                --- Bilgiler ---");
				System.out.println("Ust Sinifi -> " + set.getValue().getUstSinifAdi() + "// Sinifi -> " + set.getValue().getSinifAdi());
				System.out.println("Ismi: " + set.getValue().getAd() + "// Kilosu: " + set.getValue().getKilosu() + "// Uzunlugu: " + set.getValue().getUzunlugu());
				System.out.println("Tehlikeli mi: " + set.getValue().isTehlikeliMi());
				kontrol= true;
				break;
	}}
			if (kontrol == false) {
				System.out.println("Hayvanat bahcesinde " + ad + " isimli hayvan bulunamadi.");
			}
			
		}
	public void hayvaniHareketEttir(String ad) {
		
		try {
			if(hayvanlar.get(ad).getUstSinifAdi().equalsIgnoreCase("memelihayvan")) {
				MemeliHayvan tempA =  (MemeliHayvan) hayvanlar.get(ad);
				tempA.yuru();
			}else if (hayvanlar.get(ad).getUstSinifAdi().equalsIgnoreCase("surungen")) {
				Surungenler tempA =  (Surungenler) hayvanlar.get(ad);
				tempA.surun();
			}
		}catch (Exception e) {
			System.out.println("Hayvanet bahcesinde " + ad + " isimde bir hayvan bulunamadi");
		}	
	}
	
	
	public void hayvanSesCikarsin(String ad) {
		
		
			if(hayvanlar.containsKey(ad)) {
				hayvanlar.get(ad).sesCikar();
	}
			else {
				System.out.println("Hayvanat bahcesinde " + ad + " isimli hayvan bulunamadi.");
			}
			
		
	}
	
	public void hayvaninCinsiniBul(String ad) {
		
		if (hayvanlar.containsKey(ad)) {
			System.out.println(ad + "  isimli hayvan " + hayvanlar.get(ad).getSinifAdi() + " cinsinden bir hayvandir.");
		} else {
		System.out.println(ad + " isimli hayvan Hayvanat Bahçesinde yok");
		}
	}
	
}
