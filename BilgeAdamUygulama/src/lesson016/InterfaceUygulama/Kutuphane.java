package lesson016.InterfaceUygulama;

import java.util.ArrayList;
import java.util.List;

public class Kutuphane implements IKutuphaeManager{

	private String isim;
	private List<Kitap> kitaplar ;

	
	
	public Kutuphane(String isim) {
		super();
		this.isim = isim;
		this.kitaplar= new ArrayList<>();
		System.out.println("Kutuphane olustu..");
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public List<Kitap> getKitaplar() {
		return kitaplar;
	}

	public void setKitaplar(List<Kitap> kitaplar) {
		this.kitaplar = kitaplar;
	}

	public void kitapEkle() {
	  String isim = Util.stringDegerAl("Lutfen Kitap ismi girin: ");
	  String yazar = Util.stringDegerAl("Lutfen Yazar ismi girin: ");
	  int fiyat = Util.intDegerAl("Lutfen kitabin Fiyatini giriniz: ");
	  Kitap kitap = new Kitap(isim, yazar, fiyat);
	  kitaplar.add(kitap);
	  System.out.println(kitap.getName()  +"kutuphaneye eklendi..");
	}

	
	public void kitapListele() {
		
		for (int i = 0; i < kitaplar.size(); i++) {
			System.out.println((i+1) +". kitap " + kitaplar.get(i).getName() + " Fiyati ->" + kitaplar.get(i).getFiyat());
		}
	}

	public void yazarBul() {
		String yazar = Util.stringDegerAl("Lutfen aradiginiz yazari giriniz");
		for (Kitap kitap : kitaplar) {
			if(kitap.getYazar().equals(yazar)) {
				System.out.println(yazar + " 'a  ait kitaplar. \n  --> " + kitap.getName());
			}
		}
		
	}

	public void kitapSil() {
		String isim = Util.stringDegerAl("Lütfen Kitap İsmini Girin");
		Kitap kitap = kontrol(isim);
		if (kitap != null) {
			kitaplar.remove(kitap);
			System.out.println("Başarıyla silindi");
		}
	}

	public void indirimYap() {
		String kitapIsmi = Util.stringDegerAl("İndirim uygulanacak Kitap İsmini Girin");
		int indirim = Util.intDegerAl("Lütfen indirm miktari uygulayın");
		Kitap kitap = kontrol(kitapIsmi);
		if (kitap != null) {
			kitap.setFiyat(kitap.getFiyat() - indirim);
			System.out.println("Güncel Fiyatı--> " + kitap.getFiyat());
			kitap.setIndirimdeMi(true);
		}

	}

	private Kitap kontrol(String name) {
		for (int i = 0; i < kitaplar.size(); i++) {
			if (kitaplar.get(i).getName().equalsIgnoreCase(name)) {
				return kitaplar.get(i);
			}
		}
		System.out.println("Kitap bulunamamıştır");
		return null;
	}


	public void kitabiGuncelle() {
		String kitapIsmi = Util.stringDegerAl("Ismini degistirmek istediginiz Kitap İsmini Girin");
		
		Kitap kitap = kontrol(kitapIsmi);
	
		if(kitap != null) {
			String guncelIsim = Util.stringDegerAl("Guncellemek İsmini Girin");
			kitap.setName(guncelIsim);
		}
		
		
		
	}

	@Override
	public void indirimdekiKitaplariListele() {
		 System.out.println("*** Indirimdeki Kitaplar ***");
		for (Kitap kitap : kitaplar) {
			if(kitap.isIndirimdeMi()) {
				System.out.println(kitap.getName() + "adli kitap indirimde.  fiyati -->" + kitap.getFiyat());
			}
		}
	}}
	
