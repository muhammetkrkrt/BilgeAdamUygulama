package lesson007;

public class Question005 {
	private static int toplayici(int sayi1 , int sayi2) {
		int toplam = sayi1 + sayi2;
		return toplam;
	}
	private static boolean kontrol(int sayi ) {
		if(sayi<18) {
			return false ;
		}
		return true ;
		
	}

	public static void main(String[] args) {
		// topla metodu yazalım
		//toplam sonucunu kontrol edelim
		//sayının 10 dan büyük olup olmadığı bulalım
		int toplamSonuc = toplayici(17, 3);
		System.out.println(toplamSonuc);
		boolean kontrol = kontrol(toplamSonuc);
		System.out.println(kontrol ?"Mekana girebilirsiniz"  :"Mekana giremezsiniz" );
//		if(kontrol) {
//			System.out.println("Mekana girebilirsiniz");
//		}else {
//			System.out.println("Mekana giremezsiniz");
//		}

		
		

	

}}
