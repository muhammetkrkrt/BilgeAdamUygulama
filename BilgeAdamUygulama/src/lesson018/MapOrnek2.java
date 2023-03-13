package lesson018;

import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class MapOrnek2 {

	public static void main(String[] args) {
		
		String[] ogrenci = { "Ayşe", "Ece", "Mahmut" };
        int[] notlar = { 60, 80, 70 };
        int[][] notlar2 = { { 50, 50, 60 }, { 80, 90, 70 }, { 25, 75, 80 } };
        HashMap<String, int[]> map = new HashMap<>();
        HashMap<String, List<Integer>> map2 = new HashMap<>();
//        for (int i = 0; i < notlar2.length; i++) {
//        	map.put(ogrenci[i], notlar2[i]);
//			
//		}
        
        
        for (int i = 0; i < notlar2.length; i++) {
			//int sira = i ;
			List<Integer> listNotlar = new ArrayList<>();
			for (int j = 0; j < notlar2.length; j++) {
				listNotlar.add(notlar2[i][j]);
			}
			map2.put(ogrenci[i], listNotlar);
			
		}
        System.out.println(map2);
        
       
		for (Entry<String, int[]> entry : map.entrySet()) {
			
        	System.out.println(entry.getKey());
        	for (int i = 0; i < entry.getValue().length; i++) {
				System.out.println(entry.getValue()[i] + " ");
			}
			
		}
        
      
	}

}
