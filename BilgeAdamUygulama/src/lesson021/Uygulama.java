package lesson021;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

//1 - yuk yeri secme metodumuz olsun
// bu method limandan yukler arrayinde bir yer belirlesin kendine
//eger mevcut sinirindan fazla ise hata firlatsin

public class Uygulama {

	Liman liman;
	static Scanner sc = new Scanner(System.in);

	public Uygulama() {
		this.liman = new Liman();
	}

	public double agirlikBelirle() {
		
		double agirlik = Util.doubleDegerAlma("Yukunuzun agirligi giriniz: ");
		if (agirlik < 100) {
			throw new LimanAppException(EErrorType.WEIGHT_MISMATCH);
		}
		return agirlik;
	}

	public void yukYeriSec() {
		System.out.println("Lutfen bir yuk yeri secin : ");
		int index = sc.nextInt();
		try {
			Yuk yuk = liman.getYukler()[index];
		} catch (Exception e) {
			System.out.println("Lutfen sinrilar dahilinde bir yer seciniz..");
		}
	}

	public int yukYeriSec2() {
		liman.getYukler()[0] = new Yuk("1 palet kiyafet", 150, LocalDate.now());

		int index = Util.intDegerAlma("Lutfen bir yuk yeri secin : ");
		if (index < 0 || index >= liman.getYukler().length) {
			throw new LimanAppException(EErrorType.OUT_OF_BOUNDS);
		} else if (liman.getYukler()[index] != null) {
			throw new LimanAppException(EErrorType.SEAT_ALREADY_OCCUPIED);
		}
		return index;
	}

	public void yukOlustur() {
		Yuk yuk = null ;
		int index = 0 ;
		try {
			 index = yukYeriSec2();
			String name = Util.stringDegerAl("Yuk ismi: ");
			double agirlik = agirlikBelirle();
			LocalDate date = kabulTarihiKontrol();
			 yuk = new Yuk(name, agirlik, date);
			liman.getYukler()[index] = yuk ;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if( yuk == null ) {
				System.out.println("Yukunuz kabul edilmedi");
			}else {
				System.out.println("Yukunuz kabul oldu" + index + "nolu yere yerlestirildi.");
			}
		}
		
	}
	public LocalDate kabulTarihiKontrol() {
		LocalDate date = Util.stringTarih();
		if (date.getDayOfWeek().equals(DayOfWeek.FRIDAY)) {
			throw new LimanAppException(EErrorType.OUT_OF_SHIFT_DAY);
		}
		else if(date.isBefore(LocalDate.now())) {
			throw new LimanAppException(EErrorType.EXPIRED_DATE);
		}
		return date;
	}

	public static void main(String[] args) {
		Uygulama uygulama = new Uygulama();
		
		
		
		
	}

}
