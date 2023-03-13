package lesson018;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QuequeOrnek {

	public static void main(String[] args) {
		

		//Bir tane String que olusturalim 
		//kuyrugun icine isimler atalim 
		//kuyrukta elemanlari yazdiralim
		
	
		Queue<String> queue = new LinkedList<>();
		
		queue.offer("ahmet");
		queue.offer("mehmet");
		queue.offer("ayse");
		queue.offer("fatma");
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}

}
