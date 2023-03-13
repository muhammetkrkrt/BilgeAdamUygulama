package lesson018;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue3Ornek {

	public static void main(String[] args) {
		
		Queue<Musteri> musteriQueue = new PriorityQueue<>();
		
		musteriQueue.offer(new Musteri("mustafa", 20));
		musteriQueue.offer(new Musteri("ali", 30));
		musteriQueue.offer(new Musteri("mehmet", 40));
		musteriQueue.offer(new Musteri("asli", 90));
		musteriQueue.offer(new Musteri("zeynep", 25));
		musteriQueue.offer(new Musteri("bugra", 100));
		
		
	     while(!musteriQueue.isEmpty()) {
	    	 System.out.println("Kuyruktan Cikmistir: " + musteriQueue.poll().getName());
	     }

	}

}
