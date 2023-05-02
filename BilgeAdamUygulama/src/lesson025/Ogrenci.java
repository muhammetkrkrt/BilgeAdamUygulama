package lesson025;

import java.io.Serializable;

public class Ogrenci implements Serializable{
	
	
	private String isim;
	private double ortalama ;
	
	
	
	public Ogrenci(String isim, double ortalama) {
		super();
		this.isim = isim;
		this.ortalama = ortalama;
	}
	public Ogrenci(String isim) {
		super();
		this.isim = isim;
	
	}

	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public double getOrtalama() {
		return ortalama;
	}
	public void setOrtalama(double ortalama) {
		this.ortalama = ortalama;
	}
	@Override
	public String toString() {
		return "Ogrenci [isim=" + isim + ", ortalama=" + ortalama + "]";
	}
	
	
	

}
