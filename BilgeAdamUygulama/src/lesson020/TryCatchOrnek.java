



	package lesson020;

	import java.util.InputMismatchException;
	import java.util.Scanner;

	public class TryCatchOrnek {
		public static void main(String[] args) {
			int bolum1 = bolme();
			System.out.println(bolum1);
		}

		// bir tane bölme methodu yazalım kullanıcıdan 2 tane sayı alcaz
		// ve bölümü return dicez bunu yaparken gerekli hataları karşı önlem alalım

		// kulanıcıdı doğru sonuc girene kadar kullanıcdan girdi alalım

		public static int bolme() {
			boolean kontrol = true;
			int bolum = 0;
			while (kontrol) {
				try {
					Scanner scanner = new Scanner(System.in);
					System.out.println("1. Sayi");
					int sayi1 = scanner.nextInt();
					System.out.println("2. Sayi");
					int sayi2 = scanner.nextInt();
					bolum = sayi1 / sayi2;
					kontrol = false;
				} catch (ArithmeticException e) {
					System.out.println("Sayi 0 a bölünemez");
				}  catch (InputMismatchException e) {
					System.out.println("lütfen sayi giriniz");
				}catch (Exception e) {
					System.out.println("Beklenmedik bir hata meydana geldi");
				}
			}
			return bolum;
		}
	}

