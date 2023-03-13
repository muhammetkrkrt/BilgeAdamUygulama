package lesson022;

public class User {

	private String isim ;
	private int id ;
	
	
	
	public User(String isim, int id) {
		super();
		this.isim = isim;
		this.id = id;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "User [isim=" + isim + ", id=" + id + "]";
	}
	public void bilgileriGoster() {
		toString();
	}
	
}
