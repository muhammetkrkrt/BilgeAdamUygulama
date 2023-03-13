package lesson018;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class AcilServis {

	public static void main(String[] args) {
		
		Queue<Hasta> acilServis = new PriorityQueue<>();
		
		acilServis.offer(new Hasta("Mustafa", ESikayet.APANDIST));
		acilServis.offer(new Hasta("Oguz",ESikayet.APANDIST));
		 acilServis.offer(new Hasta("Kemal", ESikayet.AGRI));
		acilServis.offer(new Hasta("Ayşe", ESikayet.YANIK));
		 acilServis.offer(new Hasta("Zeliha", ESikayet.YANIK));
		 acilServis.offer(new Hasta("Okan",ESikayet.APANDIST));
		acilServis.offer(new Hasta("Orhan", ESikayet.YANIK));
		 acilServis.offer(new Hasta("Merve", ESikayet.YANIK));
		 acilServis.offer(new Hasta("Gizem",ESikayet.AGRI));
		 acilServis.offer(new Hasta("Muharrem", ESikayet.APANDIST));
		 
		 while (!acilServis.isEmpty()) {
			System.out.println(acilServis.peek().getIsim() + " " + acilServis.poll().getOncelik());
		}
		

		 
		
	}

}
