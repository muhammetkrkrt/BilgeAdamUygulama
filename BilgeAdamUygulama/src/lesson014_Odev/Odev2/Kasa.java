package lesson014_Odev.Odev2;

import java.util.Comparator;



 // ****** Kasa siralamak icin olusturulmustur... ****** /////

public class Kasa implements Comparator<Team> {
	
	    // Used for sorting in ascending order of
	    // roll number
	    public int compare(Team kasa, Team kasa1)
	    {
	        return kasa1.getKasa() - kasa.getKasa();
	    }
	}
