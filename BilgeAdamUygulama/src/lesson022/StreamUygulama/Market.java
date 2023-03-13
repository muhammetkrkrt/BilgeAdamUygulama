package lesson022.StreamUygulama;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Market {

	EUrun[] product = EUrun.values();
	List<Urun> urunler = new ArrayList<>();
	Map<String, Integer> sepetMap = new HashMap<>();
	Map<String, Double> urunMap = new HashMap<>();
	
	
	
	
	public Market() {
		urunOlustur();
		urunFiyatMapOlustur();
	}


	public void urunOlustur() {
		
		urunler = Arrays.asList(product).stream().map(urun -> new Urun(urun.name(),urun.getFiyat())).collect(Collectors.toList());
	}

	public void urunlerListele() {
		urunler.forEach(urun -> System.out.println(urun.getName()));
	}
	
	public void urunFiyatMapOlustur() {
		
		urunMap = urunler.stream().collect(Collectors.toMap(urun -> urun.getName(), urun -> urun.getPrice()));
		
	}
	public void fiyatListesi() {
		//urunMap.forEach((key,value) -> System.out.println(key +" -> " + value));
		urunMap.entrySet().forEach(System.out :: println);
	}
	public void fiyatiBuyukOlaniListele () {
		List<Entry<String, Double>> ellidanBuyukler = urunMap.entrySet().stream().filter(x -> x.getValue() > 50).collect(Collectors.toList());
		
	}
	
	public void buyuklerinOrtalamasi() {
		
		List<Urun> ellidenBuyukler = urunler.stream().filter(x -> x.getPrice() > 50).collect(Collectors.toList());
		
		ellidenBuyukler.stream().mapToDouble( i -> i.getPrice()).average().ifPresent(avg -> System.out.println("Average found is " + avg));
		
	}
	
	public void sepeteUrunEkle() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Eklemek istediginiz urun: ");
		String urun = sc.nextLine();
		if (urunMap.containsKey(urun)) {
		if(sepetMap.containsKey(urun)) {
			sepetMap.put(urun, sepetMap.get(urun)+1);
		}else {
			sepetMap.put(urun, 1);
			System.out.println("Urun sepete eklendi..");
		}}else {
			System.out.println("Boyle bir urun bulunamadi");
		}
	}
	public void sepetiGoster() {
		sepetMap.forEach((key,value) -> System.out.println(key + " -> " + value));
	}
	
}
