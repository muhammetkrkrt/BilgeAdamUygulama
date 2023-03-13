package lesson001;


public class Question003 {

	public static void main(String[] args) {
		float satisFiyati =80;
		float hamFiyat=0;
		float kar=0.15f;
		float kdv=0.18f;
		hamFiyat=satisFiyati - (satisFiyati*kar)-(satisFiyati*kdv);
		System.out.println("Ham Fiyatı-->"+hamFiyat);
		
		System.out.println();

	}

}
