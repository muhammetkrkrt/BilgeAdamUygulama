package lesson017;

import java.util.Stack;

public class StackOrnek2 {
	static Stack<Character> stack = new Stack<>();

	public static boolean isPalindrom(String name) {

		for (int i = 0; i < name.length(); i++) {
			if(name.charAt(i) != stack.pop()) {
				return false;
			}
		}
		return true ;
	}

	public static void plaindrom(String name) {

		for (int i = 0; i < name.length(); i++) {
			stack.push(name.charAt(i));
		}

		for (Character na : stack) {
			System.out.println(na);
		}
	}

	public static void main(String[] args) {

		plaindrom("Kayak");

	}

}
