package lesson014_Odev.Odev2;



public class Team  {
	private String name;
	private int puan;
	private int kasa;
	
	
    public int compare(Team puan, Team puan1)
	    {
	        return puan1.getPuan() - puan.getPuan();
	    }

	public Team(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPuan() {
		return puan;
	}

	public void setPuan(int puan) {
		this.puan = puan;
	}

	public int getKasa() {
		return kasa;
	}

	public void setKasa(int kasa) {
		this.kasa = kasa;
	}

	




	

}
