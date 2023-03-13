package lesson003;

import java.util.Scanner;

public class Question003 {

	public static void main(String[] args) {
		// girilen sayı için çarpım tablosunu veren program veren programı yazalım
      Scanner scanner= new Scanner(System.in);
      System.out.println("Sayı Giriniz:");
      int sayi=scanner.nextInt();
      for(int i = 1;i<=10;i++) {
    	  System.out.println(sayi + "*" + i);
      }

}

}
