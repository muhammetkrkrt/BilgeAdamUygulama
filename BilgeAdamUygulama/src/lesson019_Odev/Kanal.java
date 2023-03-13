package lesson019_Odev;

public class Kanal {

	private String kanalAdi;
	private int kanalNo;
	private String kanalTuru;

	

	public Kanal(String kanalAdi, int kanalNo, String kanalTuru) {
		this.kanalAdi = kanalAdi;
		this.kanalNo = kanalNo;
		this.kanalTuru = kanalTuru;
	}

	public String getKanalAdi() {
		return kanalAdi;
	}

	public void setKanalAdi(String kanalAdi) {
		this.kanalAdi = kanalAdi;
	}

	public int getKanalNo() {
		return kanalNo;
	}

	public void setKanalNo(int kanalNo) {
		this.kanalNo = kanalNo;
	}

	public String getKanalTuru() {
		return kanalTuru;
	}

	public void setKanalTuru(String kanalTuru) {
		this.kanalTuru = kanalTuru;
	}

}
