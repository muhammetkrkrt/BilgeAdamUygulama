package lesson013;

public class Main {

	public static void main(String[] args) {
		// Sinav sinifi olusturalim
		
//		SoruSinifi soru1 = new SoruSinifi();
//		String[] cevapSecenekleri = { "A", "B", "C", "D" };
//		soru1.soruOlustur(cevapSecenekleri);
//		
		Sinav sinav1 = new Sinav();
		sinav1.sinavOlustur();
		for (int i = 0 ; i < sinav1.getSorular().length ; i++) {
			System.out.println(sinav1.getSorular()[i].getIcerik());
		}
//		sinav1.cevapGir();
		
		
	}

}
