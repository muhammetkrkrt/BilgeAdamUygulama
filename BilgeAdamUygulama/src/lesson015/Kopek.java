package lesson015;

public class Kopek extends Hayvan {

	private int asiSayisi;
	private String cins;
	private String tur;
	private String karne;

	public Kopek(String name, boolean kayitliMi, String dogumTarihi, String cins) {
		super(name, kayitliMi, dogumTarihi);
		this.cins = cins;
		this.tur = "Kopek";
	}
	
	public void bilgileriGoster() {
		System.out.println(toString());
	}
	
	public void karneOlustur() {
		System.out.println(getName() +"--> karnesi olusturuldu");
		setKarne("Cinsi: " + this.getCins() + "  Turu: " +this.getTur());
		System.out.println( this.getKarne());
	}

	public int getAsiSayisi() {
		return asiSayisi;
	}

	public void setAsiSayisi(int asiSayisi) {
		this.asiSayisi = asiSayisi;
	}

	public String getCins() {
		return cins;
	}

	public void setCins(String cins) {
		this.cins = cins;
	}

	public String getTur() {
		return tur;
	}

	

	public String getKarne() {
		return karne;
	}

	public void setKarne(String karne) {
		this.karne = karne;
	}

	@Override
	public String toString() {
		return "Kopek [asiSayisi=" + asiSayisi + ", cins=" + cins + ", tur=" + tur + ", karne=" + karne
				+ ", toString()=" + super.toString() + "]";
	}

	

}
