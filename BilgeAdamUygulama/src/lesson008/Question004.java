package lesson008;

import java.util.ArrayList;

public class Question004 {
	
	public static ArrayList<Integer> arrayToplama(int[] array1 , int[] array2) {
		 ArrayList<Integer> toplamArray = new ArrayList<Integer>();
		 for (int i = 0 ; i<array1.length ;i++) {
			 toplamArray.add(array1[i]+array2[i]);
		 }
		 
		System.out.println(toplamArray.toString()); /// pratik yöntem arraylistlerle cözüm
		return toplamArray ;
	}
	public static int[] arrayToplam (int[] array1 , int[] array2) {
		int[] toplam = new int[array1.length];
		for(int i = 0 ; i<array1.length;i++) {
			toplam[i]= array1[i]+array2[i];
			
		}
		return toplam ;
	}
	public static void bilgilerYazdır(int[] array) {
		for(int i =0 ; i<array.length;i++) {
			System.out.println(array[i] + " ");
		}
	}
	
	
	

	public static void main(String[] args) {
		// parametre olarak array alan 
		//ve aldığı arrayleri toplayıp farkli bir arrayin içinde saklayan method
		int[] array1 = { 1, 2, 3, 4, 5, 6 };
		int[] array2 = { 1, 2, 3, 4, 5, 6 };
		int[] toplam = arrayToplam(array1,array2);
		arrayToplama(array1,array2);
		
		bilgilerYazdır(toplam);
		
		
		
		
		
		
	}

}
