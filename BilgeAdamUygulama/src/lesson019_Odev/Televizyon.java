package lesson019_Odev;

import java.util.ArrayList;

public class Televizyon {

	private String marka;
	private String boyut;
	private ArrayList<Kanal> kanallar;
	
	
	public Televizyon(String marka, String boyut) {
		super();
		this.marka = marka;
		this.boyut = boyut;
		
		this.kanallar = new ArrayList<>();
		kanallariOlustur();
		
		
	}
	
	public void kanallariOlustur() {
		Kanal kanal1= new HaberKanali("HaberTurk",1,"SonDakika");
		Kanal kanal2= new HaberKanali("NTVSpor",2,"Spor");
		Kanal kanal3= new MuzikKanali("NumberOne",3,"Yabanci muzik");
		Kanal kanal4= new MuzikKanali("Trt muzik",4,"Halk muzigi");
		kanallar.add(kanal1);
		kanallar.add(kanal2);
		kanallar.add(kanal3);
		kanallar.add(kanal4);
	}
	
	
	
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getBoyut() {
		return boyut;
	}
	public void setBoyut(String boyut) {
		this.boyut = boyut;
	}
	public ArrayList<Kanal> getKanallar() {
		return kanallar;
	}
	public void setKanallar(ArrayList<Kanal> kanallar) {
		this.kanallar = kanallar;
	}


	public void gosterKanal(int kanalNo) {
		 Kanal kanal = kanallar.get( kanalNo- 1);
		 System.out.println("Kanal adı: " + kanallar.get(kanalNo-1).getKanalAdi() + " Kanal no:" + kanallar.get(kanalNo-1).getKanalNo());
		
	}

	public void tumKanallariGoster() {
	    for (Kanal kanal : kanallar) {
	    	System.out.println("Kanal adı: " + kanal.getKanalAdi() + " Kanal no:" + kanal.getKanalNo());
		}
	      
		
	}



	
	
	
}
