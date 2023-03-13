package lesson018;

public class Musteri implements Comparable<Musteri>{

	private String name;
	private int yas ;
	
	
	
	public Musteri(String name, int yas) {
		super();
		this.name = name;
		this.yas = yas;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}

	@Override
	public int compareTo(Musteri musteri) {
		if(this.yas < musteri.yas) {
			return 1 ;
		}
		else if (this.yas > musteri.yas) {
			return -1 ;
		}
		return 0;
	}
	
	
	
}
