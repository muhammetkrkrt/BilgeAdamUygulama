package com.muhammetkarakurt.Soru2;

public class CustomStringTR {
	
	
	      /////////// Fields //////////////
private String string;
	
	

     ////////////// Constructors /////////////////

	public CustomStringTR(String string) {
		super();
		this.string = string;
	}

	
	
	////////////////  Metods ////////////////
	
	public int uzunluk() {
		int uzunluk = string.length();
		return uzunluk;
	}
	public boolean icindeVarmi(String kelime) {
		boolean isV = string.contains(kelime);
		return isV;
	}
	public String kucukHarfYap() {
		String kucuk = string.toLowerCase();
		return kucuk;
	}
	public String buyukHarfYap() {
		String buyuk = string.toUpperCase();
		return buyuk;
	}
	public boolean esitMi(String kelime) {
		boolean isE = string.equals(kelime);
		return isE;
	}
	public boolean buyukKucukHarfFarkEtmez(String kelime) {
		boolean isEIC = string.equalsIgnoreCase(kelime);
		return isEIC;
	}
	public char indextekiKarakter(int index) {
		char c = string.charAt(index);
		return c;
	}
	public boolean ileMiBitiyor(String kelime) {
		boolean isBi = string.endsWith(kelime);
		return isBi;
	}
	public boolean ileMiBasliyor(String kelime) {
		boolean isBa = string.startsWith(kelime);
		return isBa;
	}
	public int metinIndexi(String kelime) {
		int index = string.indexOf(kelime);
		return index;
	}
	
	/////////////////////Getter and Setter ///////////////////////
	
	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

}
