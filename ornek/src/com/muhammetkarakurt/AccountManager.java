package com.muhammetkarakurt;

import java.util.Scanner;

public class AccountManager {
	static Scanner sc = new Scanner(System.in);
	public void paraYatir(Account account ) {
		
		System.out.println("Yatirmak istediginiz tutari giriniz");
		int yatirilanTutar = Integer.valueOf(sc.nextLine());
		if(yatirilanTutar > 0 && yatirilanTutar <= 10000) {
			account.setMoney(account.getMoney()+yatirilanTutar);
			System.out.println("Guncel bakiyeniz: " + account.getMoney());
		}
		else { 
			System.err.println("yuklemek istediginiz tutar 0 ve 10000 Tl arasinda olmalidir");
			
		}
	}
	public void paraCek(Account account ) {
		
		System.out.println("Cekmek istediginiz tutari giriniz");
		int cekilenTutar = Integer.valueOf(sc.nextLine());
		if(cekilenTutar > account.getMoney()) {
			System.err.println("Hesap bakiyeniz yetersiz");
		}
		else {
			account.setMoney(account.getMoney()- cekilenTutar);
			System.out.println("Guncel bakiyeniz: " + account.getMoney());
		}
	
	
}
	public void accountDetails (Account account) {
		
		System.out.println("Hesap No : " + account.getAccountNo() + "  Guncel bakiyeniz: " + account.getMoney());
		
	}
	
	public void menu(Account account) {
		
		boolean check = true ;
		while (check) {
			System.out.println("---- Menu ---");
			System.out.println("1 - Para Yatir");
			System.out.println("2 - Para cek");
			System.out.println("3 - Bilgileri goster");
			System.out.println("4 - cikis");
			int secim1 = Integer.valueOf(sc.nextLine());
			
			switch (secim1) {
			
			case 1:
				paraYatir(account);
				
				break;
			case 2 :
				paraCek(account);
				break;
			case 3 :
				accountDetails(account);
				break;
			case 4 :
				check = false ;
				break;
			default:
				System.out.println("Lutfen gecerli bir aralik girin");
				break;
			}
		}
		
		
	}
	

}
