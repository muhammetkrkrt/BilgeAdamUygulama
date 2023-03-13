package lesson014_Odev.Odev2;

public class Main {

	public static void main(String[] args) {
		
		Team team1 = new Team("Barcelona");
		Team team2 = new Team("Real Madrid");
		Team team3 = new Team("Atletico");
		Team team4 = new Team("Sevilla");
		
		TeamMenager maneger1 = new TeamMenager();
		
		maneger1.teamAdd(team1);
		maneger1.teamAdd(team3);
		maneger1.teamAdd(team2);
		maneger1.teamAdd(team4);
		
		maneger1.macYap(team1, team2);
		maneger1.macYap(team1, team3);
		maneger1.macYap(team1, team4);
		maneger1.macYap(team2, team3);
		maneger1.macYap(team2, team4);
		maneger1.macYap(team3, team4);
		
		System.out.println();
		maneger1.kasaGoster();
		System.out.println();
		maneger1.iflasEtmeDurumu();
		System.out.println();
		maneger1.puanDurumu();
		System.out.println();
		maneger1.sampiyonuGoster();
	
		
	
		
		
		
		
	

	}

}
