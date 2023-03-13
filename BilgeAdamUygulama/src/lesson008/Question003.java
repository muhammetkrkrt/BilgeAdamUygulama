package lesson008;

import java.util.Scanner;

public class Question003 {
	public static boolean mailKontrol() {
		boolean mailKontrol = true ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen mail adresi giriniz:");
		String mail = sc.nextLine();
		mail.trim();
		if( !( mail.endsWith("@hotmail.com") ||  mail.endsWith("@gmail.com"))){
			mailKontrol = false ;
		}
		
			
		return mailKontrol ;		
		
		}
		
		
	public static boolean passwordKontrol () {
		boolean passwordKontrol = true ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen şifre giriniz:");
		String password = sc.nextLine();
		System.out.println("Lütfen mşifre tekrarını giriniz:");
		String rePassword = sc.nextLine();
		if( ! password.equals(rePassword)) {
			passwordKontrol = false ;
		}
		return passwordKontrol ;
		}
	public static void login() {
		boolean passwordCheck = passwordKontrol();
		boolean emailCheck = mailKontrol();
		if (passwordCheck && emailCheck ) {
			System.out.println("Sisteme giriş yaptınız");
		}else {
			System.out.println("Sisteme giriş yapamadınız");
		}
		}
	

	public static void main(String[] args) {
		// 2 method yaz
		//1-kullanıcıdan alıfıgımız email degerini kontrol edelim dogru formatta mı diye
		// @varmı
		// hotmail.com ve ya gmail.com ile mi bitiyor
		// password ve repasswor bunları kontr edecegiz 
       login();
       
	}

}
