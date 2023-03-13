package lesson011;
import lesson011.helper.RandomGenererateld;

public class Product {

	private String id ;
	private String name ;
	private int stock ;
	private int price;
	private boolean isActive;
	private String urunKodu;
	
	public Product( String name, int stock, int price ) {
		
		this.setName(name);
		this.setStock(stock);
		this.setPrice(price);
		this.id = RandomGenererateld.Random();
		this.urunKodu = name.substring(0,3)+RandomGenererateld.urunKodu(name);
	}
	public Product() {
		this.id = RandomGenererateld.Random();
		
	}
	public void gosterimdenKaldir(Product product) {
		if(product.getStock() <1) {
			setActive(false);
			System.out.println(product.getName() + "Gosterimden kaldirildi");
			}
		
	}

	

	public String getUrunKodu() {
		return urunKodu;
	}
	public void setUrunKodu(String urunKodu) {
		this.urunKodu = urunKodu;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void bilgileriGoster() {
		System.out.println(toString());
	}
	
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", stock=" + stock + ", price=" + price + "urunKodu" + urunKodu+"]";
	}
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public void urunuGuncelle(String name) {
		
		System.out.println(this.name + " urununuzun ismi "+name+" ile degistirildi");
		setName(name);
	}
	
	public void veriTabaninaKaydet() {
		System.out.println(getName() + "Veri tabanina kaydedildi");
	}
	
	
	
	
}
