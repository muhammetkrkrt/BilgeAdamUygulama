package lesson015;

public class Insan {

	private String tcKimlik;
	private String isim;

	
	
	public Insan(String tcKimlik, String isim) {
		super();
		this.tcKimlik = tcKimlik;
		this.isim = isim;
	}

	public String getTcKimlik() {
		return tcKimlik;
	}

	public void setTcKimlik(String tcKimlik) {
		this.tcKimlik = tcKimlik;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	@Override
	public String toString() {
		return "Insan [tcKimlik=" + tcKimlik + ", isim=" + isim + "]";
	}

}
