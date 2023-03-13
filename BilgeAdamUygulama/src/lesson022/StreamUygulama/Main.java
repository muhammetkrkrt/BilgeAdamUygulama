package lesson022.StreamUygulama;

public class Main {

	public static void main(String[] args) {
		
		Market market = new Market();
		
		market.urunlerListele();
		market.fiyatListesi();

		market.buyuklerinOrtalamasi();
		market.sepeteUrunEkle();
		market.sepetiGoster();
	}

}
