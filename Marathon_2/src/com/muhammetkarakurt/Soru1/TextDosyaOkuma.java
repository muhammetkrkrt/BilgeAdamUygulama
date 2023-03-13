package com.muhammetkarakurt.Soru1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class TextDosyaOkuma {
	
	//////////// Fields //////////////////////
	static Scanner sc = new Scanner(System.in);
	static HashMap<String, String> rehber = new HashMap<>();
	
	
	//////////////// Metods //////////////////////

	public void girdiyiFormatla(String line) {
		String[] strTemp = line.trim().split(";");
		String[] strTemp2 = strTemp[0].split(" " );
		rehber.put(strTemp2[0]+" "+strTemp2[1], strTemp[2]);
		String[] str = {"Isim:"+ strTemp2[0].trim() +"    SoyIsim:" +strTemp2[1].trim() + "   Sehir:" +strTemp[1].trim() + "    Telefon no:" + strTemp[2].trim() };
		for (String string : str) {
			System.out.printf("%s %n" , string);
		}
		System.out.println("----------------------------------------------------------------- ");
		
	}
	public void anahtarDegeriniYazdir() {
		System.out.println("\n          *******Numara Arama***********");
		System.out.println("Lutfen numrasini istediginiz kisinin Ismini giriniz: ");
		String isim = sc.nextLine().trim();
		System.out.println("Lutfen numrasini istediginiz kisinin Soyismini giriniz: ");
		String soyisim = sc.nextLine().trim();
		String yapi = "";
		try {
			yapi = isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase() + " "
					+ soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).toLowerCase();
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("İsim ve ya soyisim en az iki karakter icermelidir");
		}
		
		if (null == rehber.get(yapi)) {
			System.out.println("Aradığınız kişi rehberde kayıtlı değil!");
		} else {
			System.out.println(yapi + " isimli kişinin telefon numarası: " + rehber.get(yapi));
		}
	}
	
	public void dosyayiOkuVeYaz() {
		
	try(BufferedReader bufferedReader = new BufferedReader(new FileReader("rehber.txt"))){
			
			
			String line;
			while((line = bufferedReader.readLine()) != null) {
				girdiyiFormatla(line);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosta bulunumadi...!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Dosya okuma sırasında hata oluştu...!");
			e.printStackTrace();
		}
		
	}
		
		////////////// Main //////////////
	
	public static void main(String[] args) {
		TextDosyaOkuma text = new TextDosyaOkuma();
		text.dosyayiOkuVeYaz();
		text.anahtarDegeriniYazdir();
	
	
	}
	
}
