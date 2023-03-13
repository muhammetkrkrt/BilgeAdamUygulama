package lesson014_Odev.Odev2;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class TeamMenager {

	private List<Team> teams = new LinkedList<>();

	
	
	
	public TeamMenager() {
		
	}
	
	public void iflasEtmeDurumu() {
		for (Team team : teams) {
			if(team.getKasa() < 5000) {
				System.out.println(team.getName() + " takimi iflas etmistir..!");
			}
		}
	}
	
	public void ligSonu() {
		
	}
	
	
	public void teamAdd(Team team ) {
		this.teams.add(team);
	 }
	 
	 public void puanDurumu() {                      
		 System.out.println("***** Puan Durumu *****");
		 Collections.sort(teams , new Puan());      //  < --  Puani yuksekten dusuge gore siralamak icin kullandim
		 for (Team team : teams) {
			System.out.println(team.getName() + " Puani --> " + team.getPuan());
		}
		 
	 }


	public void macYap(Team team, Team team1) {
		Random rd = new Random();
		int secim = rd.nextInt(1, 4);
		if (secim == 1) {
			System.out.println(team.getName() + " vs " + team1.getName() + " --> Macinin galibi: " + team.getName());
			team.setPuan(team.getPuan() + 3);
			team.setKasa(team.getKasa() + 10000);
		} else if (secim == 2) {
			System.out.println(team.getName() + " vs " + team1.getName() + " --> Macinin galibi: " + team1.getName());
			team1.setPuan(team1.getPuan() + 3);
			team1.setKasa(team1.getKasa() + 10000);
		} else {
			System.out.println(team.getName() + " vs " + team1.getName() + " --> Maci beraberlikle sonuclandi. ");
			team1.setPuan(team1.getPuan() + 1);
			team1.setKasa(team1.getKasa() + 5000);
			team.setPuan(team.getPuan() + 1);
			team.setKasa(team.getKasa() + 5000);
		}

	}

	public void kasaGoster() {
		Collections.sort(teams , new Kasa());  //  < -- kasadaki miktarlari siralamak icin 
		for (Team team : teams) {
			System.out.println(team.getName() + " Kasasi --> " + team.getKasa() );
		}
	}
	public void sampiyonuGoster() {
		System.out.println("Sampiyonn --> " + teams.get(0).getName());
	}

}
