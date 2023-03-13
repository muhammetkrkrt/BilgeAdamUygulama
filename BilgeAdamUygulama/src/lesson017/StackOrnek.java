package lesson017;

import java.util.Iterator;
import java.util.Stack;

public class StackOrnek {

	public static void main(String[] args) {
		int toplam = 0;
		Stack<Integer> newStack = new Stack<>();
		Stack<Integer> stack = new Stack<>();
		stack.push(150);
		stack.push(7);
		stack.push(101);
		stack.push(50);
		stack.push(50);
	
//		while (!stack.isEmpty()) {
//			System.out.println(stack.pop());
//		}

	   while(!stack.isEmpty()) {
		   if(stack.peek() <100) {
			   toplam += stack.pop();
					  
		   }else {
			   newStack.push(stack.pop());
		   }
	   }
		System.out.println(newStack.toString() + " * " + toplam);
		
		
		
		

}}
