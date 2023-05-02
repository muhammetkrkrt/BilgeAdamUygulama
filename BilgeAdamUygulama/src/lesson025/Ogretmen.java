package lesson025;

import java.util.List;

public class Ogretmen implements Runnable{
	
	private String isim;
	List<Ogrenci> notuOkunanlar;
	
	

	public Ogretmen(String isim) {
		super();
		this.isim = isim;
	}



	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(isim +" "+i + ". Ogrencinin notu okundu.");
		}
		
	}
	
	

	
}
