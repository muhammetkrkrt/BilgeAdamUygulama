package lesson013;

import java.util.Iterator;
import java.util.Scanner;

public class Sinav {
	private String dersKonusu;
	private String[] cevaplar;
	private String ders;
	private SoruSinifi[] sorular;
	public static String[] cevapSecenekleri = { "A", "B", "C", "D" };
	private int soruSayisi;
	private int sure;
	private int maxPuan;

	public void sinavOlustur() {
		Scanner sc = new Scanner(System.in);
		System.out.println("lutfen dersin ismini giriniz: ");
		ders = sc.nextLine();
		System.out.println("Lutfen dersin konusunu yaziniz: ");
		dersKonusu = sc.nextLine();
		System.out.println("Sinavin suresini giriniz: ");
		sure = Integer.valueOf(sc.nextLine());
		System.out.println("Soru sayisini giriniz");
		soruSayisi = Integer.valueOf(sc.nextLine());
		sorular = new SoruSinifi[soruSayisi];

			for (int i = 0; i <soruSayisi; i++) {
				SoruSinifi soru = new SoruSinifi();
				soru.soruOlustur(cevapSecenekleri);
				sorular[i] = soru ;
			
		}
		
		
		
		
	}
	public void cevapGir() {
		Scanner sc = new Scanner(System.in);
		cevaplar = new String[sorular.length];
		for (int i = 0; i < sorular.length; i++) {
			System.out.println( (i+1) +" .soru " + sorular[i].getIcerik() );
           for (int j = 0; j < sorular[i].getCevapIcerikleri().length; j++) {
			System.out.println(cevapSecenekleri[j] + "  -) " + sorular[i].getCevapIcerikleri()[j]);
		}
           System.out.println("Lutfen cevaplari giriniz");
           cevaplar[i] = sc.nextLine();
		
		}
	}
	public void cevaplariKontrolEt() {
		// dogruSayisi
		// yanlıs sayisi
		// puanını kullanıcıya gösterilm

		int dogru = 0;
		int puan = 0;
		int yanlis = 0;

		for (int i = 0; i < sorular.length; i++) {
			if (cevaplar[i].equals(sorular[i].getDogruCevap())) {
				dogru++;
				puan += sorular[i].getPuan();
			} else {
				yanlis++;
			}
		}
		System.out.println("doğru cevap sayiniz= " + dogru);
		System.out.println("yanlis cevap sayiniz= " + yanlis);

		System.out.println("toplam puan= " + puan);
	}
	
	
	public String getDersKonusu() {
		return dersKonusu;
	}


	public void setDersKonusu(String dersKonusu) {
		this.dersKonusu = dersKonusu;
	}


	public String[] getCevaplar() {
		return cevaplar;
	}

	public void setCevaplar(String[] cevaplar) {
		this.cevaplar = cevaplar;
	}

	public String getDers() {
		return ders;
	}

	public void setDers(String ders) {
		this.ders = ders;
	}

	public SoruSinifi[] getSorular() {
		return sorular;
	}

	public void setSorular(SoruSinifi[] sorular) {
		this.sorular = sorular;
	}

	public String[] getCevapSecenekleri() {
		return cevapSecenekleri;
	}

	public void setCevapSecenekleri(String[] cevapSecenekleri) {
		this.cevapSecenekleri = cevapSecenekleri;
	}

	public int getSoruSayisi() {
		return soruSayisi;
	}

	public void setSoruSayisi(int soruSayisi) {
		this.soruSayisi = soruSayisi;
	}

	public int getSure() {
		return sure;
	}

	public void setSure(int sure) {
		this.sure = sure;
	}

	public int getMaxPuan() {
		return maxPuan;
	}

	public void setMaxPuan(int maxPuan) {
		this.maxPuan = maxPuan;
	}

}
