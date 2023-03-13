package lesson005;

import java.util.Scanner;

public class Question006 {

	public static void main(String[] args) {
		// dizi içerisinde 2 ve 4 ün kaç kere geçtiğini
		//hangisinin daha fazla olduğunu bulan program
		// ödevv kaçları istiyorsak kullanıcıdan alalım
		Scanner sc= new Scanner(System.in);
		
		int[] array = { 1, 3, 4, 4, 4, 2, 2, 2, 9, 8, 8 };
		int sy2 = 0 ;
		int sy4 = 0 ;
	
		for (int i = 0; i < array.length; i++) {
			if(array[i] == 2) {
				sy2++;
				
			}
			else if(array[i]==4) {
				sy4++;
			}
		}
		System.out.println("2 den " + sy2 + "adet var");
		System.out.println("4 den " + sy4 + "adet var");
		if(sy2<sy4) {
			System.out.println("daha çok geçen:  " + sy4);
		}else if (sy2>sy4) {
			System.out.println("daha çok geçen:  " + sy2);
		}else {
			System.out.println("Eşit sayıdalar ve : " + sy2);
		}
		
	}

}
