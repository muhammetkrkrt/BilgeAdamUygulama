package lesson016.InterfaceUygulama;

import java.util.Scanner;

public class Util {
	
	static Scanner sc = new Scanner(System.in);

	public static int intDegerAl(String sorgu) {
		System.out.println(sorgu);
	int	deger = Integer.valueOf(sc.nextLine());
	
	return deger ;
	}
	
	public static String stringDegerAl(String sorgu) {
		
		System.out.println(sorgu);
		String	deger = sc.nextLine();
		return deger ;
	}
}
