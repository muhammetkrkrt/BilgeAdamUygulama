package maraton1;


public class Question002 {
	public static void tekrarEden (int[] array) {
	    int tekrarEden = array[0];
		int sayac = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if(i != j  && (array[i] == array[j])) {
					sayac++;
					break;
				}
				if (sayac == 0) {
					tekrarEden = array[i];
				}
			}
			       
		
			}
		if (sayac == 0 ) {
			System.out.println("Tekrar eden sayı bulunamamıştır.");
		}else {
			System.out.println( tekrarEden+ " sayisi " + sayac +  "  kez tekrar ediyor." );
		}
		
		
		
			
	}

	public static void main(String[] args) {
		int[] array1 = {  7, 5, 3, 7, 7, 23,77,18, 2, 0, 7 };
		int[] array2 = { 0, 1, 5, 3 };
		int[] array3 = { 2, 3, 43, 5, 3 };
		int[] array4 = { 1 , 4 ,9 ,9 ,0 ,3 ,9 ,47 ,9};
         tekrarEden(array1);
         tekrarEden(array2);
         tekrarEden(array3);
         tekrarEden(array4);
	}

}
