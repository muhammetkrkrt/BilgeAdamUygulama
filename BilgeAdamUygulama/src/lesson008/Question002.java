package lesson008;


public class Question002 {
	public static void asalMi(int sayi) {
	   boolean asalMi = true ;
	   for (int j=2 ; j <sayi;j++) {
		   if (sayi % j == 0) {
			   asalMi = false ;
		   }
	   }
	   if(asalMi) {
		   System.out.println(sayi + " asaldir");
	   }
	
		
	}

	public static void main(String[] args) {
		// 1 den 1000 e kadar olan sayıların asal olanlarını bulan methodu yazalım
		//asalMi methodunuz yazcaz bu metotta sadece sayı asalmı diye bakıcaz
		// daha sonra mainde for döngüsüne sokup bulucaz
         
		for (int i =2 ;i<1000;i++) {
			asalMi(i);
		}
	}

}
