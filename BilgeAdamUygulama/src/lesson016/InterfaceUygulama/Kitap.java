package lesson016.InterfaceUygulama;

public class Kitap {

	private String name;
	private String yazar;
	private int fiyat;
    private boolean indirimdeMi;
	
	
	
	
	public Kitap(String name, String yazar, int fiyat) {
		super();
		this.name = name;
		this.yazar = yazar;
		this.fiyat = fiyat;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getYazar() {
		return yazar;
	}
	public void setYazar(String yazar) {
		this.yazar = yazar;
	}
	public int getFiyat() {
		return fiyat;
	}
	public void setFiyat(int fiyat) {
		this.fiyat = fiyat;
	}
	public boolean isIndirimdeMi() {
		return indirimdeMi;
	}
	public void setIndirimdeMi(boolean indirimdeMi) {
		this.indirimdeMi = indirimdeMi;
	}
	
	
	
	
}
