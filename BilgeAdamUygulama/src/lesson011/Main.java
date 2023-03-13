package lesson011;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	
	public static  Product productEkle() {
		Scanner sc = new Scanner(System.in);
		Product product = new Product();
		System.out.println("urun fiyati: ");
		int price = sc.nextInt();
		System.out.println("Stock: ");
		int stock = sc.nextInt();
		System.out.println("isim: ");
		String name = sc.next();
		
		product.setName(name);
		product.setPrice(price);
		product.setStock(stock);
		
		System.out.println("Urun basariyla olusturuldu  ID'si " + product.getId() + "ismi: " +product.getName());
		return product;
	}
	public static  void productEkle2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("urun fiyati: ");
		int price = sc.nextInt();
		System.out.println("Stock: ");
		int stock = sc.nextInt();
		System.out.println("isim: ");
		String name = sc.next();
		
		Product product = new Product(name,stock,price);
		
		System.out.println("Urun basariyla olusturuldu  ID'si " + product.getId() + "ismi: " +product.getName());
	}
	
	public static void sepeteEkle(Product product) {
		Sepet sepet = new Sepet();
		sepet.sepeteUrunEkle(product);
		
	}
	public static void main(String[] args) {
		// product sinifi olusturalim 
		//id , price , name , stock 
		// bilgileriGoster methodu yazalim
		// degiskenler private 
		
		
		//veritabanina kaydet --> urun ismi + veritabanina kaydet
		// urunu guncelle -->  ismini guncelleyecegiz parametre olarak string name
		
		
		//sepet sinifi olusturalim 
		// array olarak products , totalprice
		
		//sepete urun ekle metodu yazalim
		//void donsun  , parametre -->  product tipinde 
		// gelen producti arayin icine aticaz
		
		
		// aldigimiz degerler ile product olusturalim
		
		// spete ekle metodu yapalim 
		//Product product6 = productEkle();
		
		// urunKodu
		// Apple Pro
		//App325
		//urun olustururken urunun ismini alalim 
		//ve  bir urun koduolusturalim
		//Apple --> app258
		
		
		Product product1 = new Product( "asus", 50, 45000);
		product1.bilgileriGoster();
		Product product2 = new Product( "apple", 100, 46000);
		product2.bilgileriGoster();
		product2.urunuGuncelle("asus2");
		product2.bilgileriGoster();
		product2.veriTabaninaKaydet();
		Product product3 = new Product( "Moster", 50, 40000);
		product3.bilgileriGoster();
		
		Sepet sepet1=new Sepet();
		
		
		
		sepet1.sepeteUrunEkle(product3);
		sepet1.sepeteUrunEkle(product3);
		sepet1.sepeteUrunEkle(product3);
		sepet1.sepeteUrunEkle(product3);
		sepet1.sepeteUrunEkle(product3);
		sepet1.sepeteUrunEkle(product3);
		sepet1.sepeteUrunEkle(product3);
		sepet1.sepeteUrunEkle(product3);
		sepet1.sepeteUrunEkle(product3);
		sepet1.sepeteUrunEkle(product3);
		
		
		
		product3.bilgileriGoster();
		System.out.println(sepet1.getTotalprice());
		sepet1.sepetiYazdir();
		sepet1.sepettekiUrunleriYaz();
		
//		Product eklenenProduc = productEkle();
//		sepeteEkle(eklenenProduc);
		

		
		

		
		
		
		
	}

}
