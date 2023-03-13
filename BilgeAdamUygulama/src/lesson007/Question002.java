package lesson007;

import java.util.Iterator;

public class Question002 {

	public static void main(String[] args) {
		// Verilen dizide rakamların farkının en az olduğu sayıların farkını bulalım 
		
		
		int[] array2 = {1 , -10 , -4 ,3 } ;
		int mins=Integer.MAX_VALUE;
		for (int i = 0; i < array2.length; i++) {
		     for (int j =i +1; j < array2.length; j++) {
		    	 
		    		int fark2 = Math.abs(array2[i]-array2[j]);
		    	
					if (mins>fark2) {
						mins = fark2 ;
					
					
			}
				
					
				
			
		}}
		System.out.println("farkları : " + mins);

	

}}
