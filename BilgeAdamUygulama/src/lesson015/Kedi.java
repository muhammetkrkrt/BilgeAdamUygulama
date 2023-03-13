package lesson015;

public class Kedi extends Hayvan {

	private String tur;
	private String cins;
	private String karne;

	public Kedi(String name, boolean kayitliMi, String dogumTarihi, String cins) {
		super(name, kayitliMi, dogumTarihi);
		this.cins = cins;
		this.tur = "Kedi";
	}
	public void bilgileriGoster() {
		System.out.println(toString());
	}
	public void karneOlustur() {
		System.out.println(getName() +"--> karnesi olusturuldu");
		setKarne("Cinsi: " + this.getCins() + "  Turu: " +this.getTur());
		System.out.println( this.getKarne());
	}

	public String getTur() {
		return tur;
	}

	public String getCins() {
		return cins;
	}

	public void setCins(String cins) {
		this.cins = cins;
	}

	public String getKarne() {
		return karne;
	}

	public void setKarne(String karne) {
		this.karne = karne;
	}
	@Override
	public String toString() {
		return "Kedi [tur=" + tur + ", cins=" + cins + ", karne=" + karne + ", toString()=" + super.toString() + "]";
	}
	

}
