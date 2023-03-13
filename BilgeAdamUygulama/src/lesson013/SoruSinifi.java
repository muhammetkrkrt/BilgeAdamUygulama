package lesson013;

import java.util.Scanner;

public class SoruSinifi {
	private int puan;
	private String icerik;
	private String dogruCevap;
	private String[] cevapIcerikleri;
	
	
	
	public void soruOlustur(String[] cevapSecenekleri) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Lutfen sinavin icerigini girin: ");
		this.icerik = sc.nextLine();
		cevapIcerikleri = new String[cevapSecenekleri.length];
		for (int i = 0; i < cevapSecenekleri.length; i++) {
			System.out.println("lutfen" + cevapSecenekleri[i] + "sikkinin degerini giriniz");
			this.cevapIcerikleri[i] = sc.nextLine();
		}
		System.out.println("Lutfen dogru olan cevabi yaziniz.");
		this.dogruCevap = sc.nextLine().toUpperCase();
		System.out.println("Lutfen sorunun puanini giriniz.");
		puan = Integer.valueOf(sc.nextLine());
		
		
		
		//icerik alalim (soruyu alalim)
		//siklarin degerlerini isteyelim
		//sorunun puani
		//dogru cevabi belirtelim
		
	}

	public SoruSinifi() {

	}

	public int getPuan() {
		return puan;
	}

	public void setPuan(int puan) {
		this.puan = puan;
	}

	public String getIcerik() {
		return icerik;
	}

	public void setIcerik(String icerik) {
		this.icerik = icerik;
	}

	public String getDogruCevap() {
		return dogruCevap;
	}

	public void setDogruCevap(String dogruCevap) {
		this.dogruCevap = dogruCevap;
	}

	public String[] getCevapIcerikleri() {
		return cevapIcerikleri;
	}

	public void setCevapIcerikleri(String[] cevapIcerikleri) {
		this.cevapIcerikleri = cevapIcerikleri;
	}

}
