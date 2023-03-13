package com.muhammetkarakurt.Soru2;

public class Main {

	public static void main(String[] args) {
		
		
		CustomStringTR string = new CustomStringTR("Merhaba");
		
		System.out.println("> " + string.uzunluk());
		System.out.println("> " + string.icindeVarmi("rhb"));
		System.out.println("> " + string.esitMi("Merhaba"));
		System.out.println("> " + string.buyukKucukHarfFarkEtmez("merhaba"));
		System.out.println("> " + string.buyukHarfYap());
		System.out.println("> " + string.kucukHarfYap());
		System.out.println("> " + string.ileMiBasliyor("Me"));
		System.out.println("> " + string.ileMiBitiyor("Me"));
		System.out.println("> " + string.indextekiKarakter(2));
		System.out.println("> " + string.metinIndexi("rh"));
		

	}

}
