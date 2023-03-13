package lesson022;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamApiOrnek2 {

	public static void main(String[] args) {
		
		
		List<User> users = new ArrayList<>();
		users.add(new User("Ahmet", 1));
		users.add(new User("zeynep", 2));
		users.add(new User("asli", 3));
		users.add(new User("deniz", 4));
		users.add(new User("mehmet", 5));
		
		
		//users.forEach(user -> System.out.println(user.toString()));
		
		List<User> uctenBuyukler = users.stream().filter(user -> user.getId() > 3).collect(Collectors.toList());

		uctenBuyukler.forEach(User :: bilgileriGoster);
	
		Set<User> uctenKucukler = users.stream().filter(user -> user.getId() < 3 ).collect(Collectors.toSet());

		uctenKucukler.forEach(User :: bilgileriGoster);
		
		List<User> ahmetler = users.stream().filter(user -> user.getIsim().equals("Ahmet")).collect(Collectors.toList());
		
		
		List<User> yeniUser = users.stream().map(user -> new User(user.getIsim() + "!! ", user.getId())).collect(Collectors.toList());
		System.out.println(yeniUser);
}}

