package lesson006;

public class Question006 {

	public static void main(String[] args) {
		// bir dizide ard arda gelen 2 indexteki sayı değerleri 2 ise true yoksa false yazdıralım
		int[] sayilar = { 2 , -256, 3, 3, 2, 1258, 32 };
		 
		for (int i = 0; i < sayilar.length-1; i++) {
			int sayi1 = sayilar[i];
			if (sayi1 == sayilar[i+1]) {
				System.out.println("True");
				break;
				
			}else
			{
				System.out.println("false");
				
			}
			
			
		}
		
		
	 
		
	}

}
