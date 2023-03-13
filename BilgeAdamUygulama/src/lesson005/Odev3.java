package lesson005;

public class Odev3 {

	public static void main(String[] args) {
		// bir dizide eğer 13 var ise hem 13 ü hemde bir sonraki indexi toplama işlemine
		// dahil etmiyecek
		// dizideki elemanların toplamını bulalım
	
		int nums2[] = { 1, 13, 5, 13, 13, 13, 2, 5, 7, 1 };
		int toplam = 0;
		for (int i = 0; i < nums2.length; i++) {
			if (nums2[i] == 13) {
				if (nums2.length > i+1 && nums2[i+1] != 13) {
					i++;
					
				}
			} else {
				toplam += nums2[i];
			}
		}
		System.out.println("Toplam = " + toplam);

	}
}
