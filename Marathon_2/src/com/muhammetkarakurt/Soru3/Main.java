package com.muhammetkarakurt.Soru3;

public class Main {

	public static void main(String[] args) {
		
		
		HayvanatBahcesi hayvanatBahcesi = new HayvanatBahcesi();
		
		hayvanatBahcesi.bahceyeHayvanEkle(new Aslan("King", 150, 100));
		hayvanatBahcesi.bahceyeHayvanEkle(new Aslan("Dear", 120, 100));
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(new Maymun("Ciko", 50, 70));
		hayvanatBahcesi.bahceyeSurungenEkle(new Kertenkele("Kermit", 5, 25));
		hayvanatBahcesi.bahceyeSurungenEkle(new Yilan("Cobra", 20, 120));
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(new Maymun("dear", 40, 100));
		
		System.out.println(" ----------- \n");
		hayvanatBahcesi.hayvanBilgileriniYazdir("Ciko");
		System.out.println("----------- \n");
		hayvanatBahcesi.hayvanBilgileriniYazdir("Kurt");
		System.out.println("----------- \n");
		hayvanatBahcesi.hayvaniHareketEttir("Kermit");
		System.out.println("----------- \n");
		hayvanatBahcesi.hayvaninCinsiniBul("Leo");
		System.out.println("----------- \n");
		hayvanatBahcesi.hayvanSesCikarsin("ciko");
		
		
		
		
		
	}
	
	

}
