package lesson014_Odev.Odev2;

import java.util.Comparator;

// ****** Puan siralamak icin olusturulmustur... ****** /////


public class Puan implements Comparator<Team> {
	
	    // Used for sorting in ascending order of
	    // roll number
	    public int compare(Team puan, Team puan1)
	    {
	        return puan1.getPuan() - puan.getPuan();
	    }
	}


