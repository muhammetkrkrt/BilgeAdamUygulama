package lesson006;

public class Question005 {

	public static void main(String[] args) {
	int[][] matris ={ { 56, 23, 678, 231, 5 },{ 234, 21, 78, 26, 6 },{ 654, 33, 32, 67, 2 },{ 189, 35, 56, 89, 8 } };

             // tek sayıları farklı bir arrayin içinde toplayalım
	int[] tekSayilar = new int[matris.length*matris[0].length];
	int index = 0 ;
	
            for (int i = 0; i < matris.length; i++) {
				for (int j = 0; j < matris[i].length; j++) {
					if (matris[i][j] %2 != 0) {
						tekSayilar[index] = matris[i][j];
						index++;
						
					}
				}
				
			}
            for (int i = 0; i < index; i++) {
				System.out.print(tekSayilar[i] + "  ");
			}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	}
