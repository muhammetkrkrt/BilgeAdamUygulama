package lesson022;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		Kisi kisi1 = new Kisi("Ahmet", 51, ECinsiyet.ERKEK,10000);
		Kisi kisi2 = new Kisi("Ali", 18, ECinsiyet.ERKEK,12000);
		Kisi kisi3 = new Kisi("Zeynep", 25, ECinsiyet.KADIN,14000);
		Kisi kisi4 = new Kisi("Defne", 35, ECinsiyet.KADIN,10000);
		Kisi kisi5 = new Kisi("Asli", 54, ECinsiyet.KADIN,14000);
		
		
		List<Kisi> kisiler = new ArrayList<>();
		kisiler.add(kisi1);
		kisiler.add(kisi2);
		kisiler.add(kisi3);
		kisiler.add(kisi4);
		kisiler.add(kisi5);
		
		System.out.println("Kadilar");
		
		List<Kisi> kadinlar = kisiler.stream().filter( kisi -> kisi.getCinsiyet().equals(ECinsiyet.KADIN)).collect(Collectors.toList());
		
		System.out.println(kadinlar);

		List<Kisi> yasSiralasi = kisiler.stream().sorted(Comparator.comparing(Kisi :: getAge).reversed()).collect(Collectors.toList());
		
		yasSiralasi.forEach(System.out :: println);
		
		Map<String, Integer> map = kisiler.stream().collect(Collectors.toMap(kisi -> kisi.getName(), kisi -> kisi.getAge()));
		
		map.forEach((key,value) -> System.out.println(key + " "+value));
}}
