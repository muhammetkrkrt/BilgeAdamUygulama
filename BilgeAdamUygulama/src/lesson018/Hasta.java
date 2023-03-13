package lesson018;

public class Hasta implements Comparable<Hasta>{

	private String isim ;
	private ESikayet sikayet;
	private int oncelik;
	
	
	public Hasta(String isim, ESikayet sikayet) {
		super();
		this.isim = isim;
		this.setSikayet(sikayet);
		oncelikBelirle(sikayet);
	
	}
	
	public void oncelikBelirle(ESikayet sikayet) {
		switch (sikayet) {
		case APANDIST:
			this.oncelik = 1 ;
			break;
		case YANIK:
			this.oncelik = 2 ;
			break;
		case AGRI:
			this.oncelik = 3 ;
			break;
		default:
			throw new IllegalArgumentException("Beklenmedik deger girisi oldu");
			
		}
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getOncelik() {
		return oncelik;
	}
	public void setOncelik(int oncelik) {
		this.oncelik = oncelik;
	}
	@Override
	public int compareTo(Hasta o) {
		if(this.oncelik < o.getOncelik()) {
			return -1 ;
		}
		else if(this.oncelik > o.oncelik) {
			return 1 ;
		}return 0;
	}

	public ESikayet getSikayet() {
		return sikayet;
	}

	public void setSikayet(ESikayet sikayet) {
		this.sikayet = sikayet;
	}

	

	
	
	
}
