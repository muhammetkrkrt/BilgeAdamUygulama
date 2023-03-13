package lesson018;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

import javax.management.Query;

public class QueueOrnek2 {

	
	
	public static void main(String[] args) throws InterruptedException {
	

		Queue<String> kuyruk = new LinkedList<String>();
		
		kuyruk.offer("Ahmet");
		kuyruk.offer("ayse");
		kuyruk.offer("ali");
		kuyruk.offer("veli");
		kuyruk.offer("mehmet");
		kuyruk.offer("kasim");
		kuyruk.offer("yusuf");
		kuyruk.offer("yunus");
		kuyruk.offer("cemre");
		kuyruk.offer("elif");
		
		Random rd = new Random();
		int pideSayisi = rd.nextInt(0,10);
		
		while(pideSayisi>0) {
			pideSayisi--;
			System.out.println(kuyruk.poll()+" pidesini aldi");
			Thread.sleep(500);
		}
		if(pideSayisi <= 0 ) {
			System.out.println("Pidelerimiz bitmistir");
		}
		System.out.println(kuyruk);
	
	
	}
	
	
}
