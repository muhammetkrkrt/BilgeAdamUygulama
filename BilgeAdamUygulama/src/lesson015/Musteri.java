package lesson015;

import java.util.ArrayList;

public class Musteri extends Insan {

	private String adress;
	private ArrayList<Hayvan>  hayvanlist ;

	
	
	
	public Musteri(String tcKimlik, String isim, String adress) {
		super(tcKimlik, isim);
		this.adress = adress;
		hayvanlist = new ArrayList<>();
	}
	
    public void hayvanEkle(Hayvan hayvan ) {
		hayvanlist.add(hayvan);
		System.out.println(hayvan.toString() + " " + getIsim() + "eklendi");
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Musteri [adress=" + adress + ", hayvanlist=" + hayvanlist + ", toString()=" + super.toString() + "]";
	}
	

}
