package lesson015;

public class Veteriner extends Insan {

	private String mezunOduguOkul;
	private String calismaSuresi;
	


	public Veteriner(String tcKimlik, String isim, String mezunOduguOkul, String calismaSuresi) {
		super(tcKimlik, isim);
		this.mezunOduguOkul = mezunOduguOkul;
		this.calismaSuresi = calismaSuresi;
	}

	public String getMezunOduguOkul() {
		return mezunOduguOkul;
	}

	public void setMezunOduguOkul(String mezunOduguOkul) {
		this.mezunOduguOkul = mezunOduguOkul;
	}

	public String getCalismaSuresi() {
		return calismaSuresi;
	}

	public void setCalismaSuresi(String calismaSuresi) {
		this.calismaSuresi = calismaSuresi;
	}

}
