package lesson005;

public class Odev2 {

	public static void main(String[] args) {
		// Bir dizide en büyük ikinci sayıyı bulan program
		int dizi[] = {5,4,23,23,4,56,99,7,17,102,102,36,99};
		int enBuyuk = dizi[0];
		int buyuk2 = dizi[0];
		for(int i = 1 ;i<dizi.length;i++) {
			if (dizi[i]>enBuyuk) {
				buyuk2 = enBuyuk;
				enBuyuk = dizi[i];
				
			}
			else if (dizi[i]>buyuk2 && dizi[i] != enBuyuk) {
				buyuk2 = dizi[i];
			}
			
			
		}
	
		System.out.println("İkinci büyük sayı: " + buyuk2);
	}

}
