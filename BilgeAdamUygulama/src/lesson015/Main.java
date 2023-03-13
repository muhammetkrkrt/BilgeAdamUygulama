package lesson015;

public class Main {

	public static void main(String[] args) {
		
		
		Kedi kedi1 = new Kedi("Boncuk", true , "2010", "Tekir");
		Kedi kedi2 = new Kedi("Sansli", false , "2015", "VanKedisi");
		Kedi kedi3 = new Kedi("Beyaz", true , "2012", "Tekir");
		
		
		Kopek kopek1 = new Kopek("zrt", true , "2010", "Rot");
		Kopek kopek2 = new Kopek("zrt", false , "2015", "Golden");
		Kopek kopek3 = new Kopek("zrt", true , "2012", "sada");

		
		kedi1.bilgileriGoster();
		kopek1.bilgileriGoster();
		kedi1.karneOlustur();
		
		Musteri musteri1 = new Musteri("4648522", "Ahmet", "Ankara");
		
		musteri1.hayvanEkle(kopek3);
		System.out.println(musteri1.toString());
	}

}
