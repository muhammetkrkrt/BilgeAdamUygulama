package lesson022;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiOrnek {

	public static void main(String[] args) {
		
		List<Integer> sayilar = new ArrayList<>();
		sayilar.add(61);
		sayilar.add(55);
		sayilar.add(78);
		sayilar.add(42);
		sayilar.add(25);
		List<Integer> sayilar2 = new ArrayList<>();
		sayilar.stream().forEach(sayi -> {
			if(sayi % 5  == 0 ) {
				sayilar2.add(sayi);
			}
		});
		System.out.println(sayilar2);

		List<Integer> mapList = sayilar.stream().map(sayi -> sayi *sayi).collect(Collectors.toList());
		
		mapList.forEach(sayi ->  System.out.println(sayi));
		
	}

}
