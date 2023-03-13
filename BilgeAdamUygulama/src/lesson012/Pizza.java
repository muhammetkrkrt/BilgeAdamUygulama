package lesson012;

public class Pizza {
	private int price;
	private boolean isVegie;
	private static final int SOS_FIYATI = 50 ;
	private static final int PEYNIR_FIYATI = 50 ;
	private static final int KURYE_FIYATI = 50 ;
	

	public Pizza(boolean isVegie) {
		this.isVegie = isVegie;
		if(isVegie) {
			this.price = 300 ;
		}else {
			this.price = 200 ;
		}
	}
	public void sosCikar () {
		
		setPrice(getPrice()-SOS_FIYATI);
		System.out.println("Sos cikartildi..");
}
public void peynirCikar () {
		
		setPrice(getPrice()-PEYNIR_FIYATI);
		System.out.println("Peynir cikartildi..");
}
	public void sosEkle () {
		
			setPrice(getPrice()+SOS_FIYATI);
			System.out.println("Sos eklenmistir..");
	}
	public void peynirEkle () {
		
		setPrice(getPrice()+PEYNIR_FIYATI);
		System.out.println("Peynir eklenmistir..");
}
	
	public void eveSparisVer () {
		
		setPrice(getPrice()+KURYE_FIYATI);
	
}
	
	public void fisAl() {
		System.out.println("Toplam tutariniz: " + this.price);
	}

	@Override
	public String toString() {
		return "Pizza [price=" + price + ", vejeteryanMi=" + isVegie + "]";
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isVejeteryanMi() {
		return isVegie;
	}

	public void setVejeteryanMi(boolean vejeteryanMi) {
		this.isVegie = vejeteryanMi;
	}

}
