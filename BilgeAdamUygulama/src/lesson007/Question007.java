package lesson007;

public class Question007 {
	
	private static int[] tekArray(int[][] array ) {
		int[] newArray = new int [array.length * array[0].length];
		int sayac= 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if(array[i][j] % 2 != 0) {
					newArray[sayac] = array[i][j];
					sayac++;
			}
			}
		}
		return newArray ;
	}
	public static void yazdir(int[] dizi) {
		for (int i = 0; i < dizi.length; i++) {
		if(dizi[i] != 0) {
			
				System.out.print(dizi[i] + "  ");
		
		}}
		
	}

	public static void main(String[] args) {
		// 1- parametre olarak dizi (array) aldığı dizideki tek elemanları farklı bir diziye atıcak
		//2- tek sayıların olduğu diziyi ekrana yazacak
		int[][] matris = { { 56, 23, 678, 231, 5 }, { 234, 21, 78, 26, 6 }, { 654, 33, 32, 67, 2 },
				{ 189, 35, 56, 89, 8 } };
        
		int[] tekler = tekArray(matris);
		yazdir(tekler);
		
		
		
		
		
		
		
		
		
	}

}
