package lesson008;

public class Question005 {
	public static String harfDegistir (String kelime) {
		if(kelime.length()<2) {
			return kelime ;
		}
		if(kelime.length()>100  || kelime.length()<0 ){
			System.out.println("yanlış");
		}
//		char[] ch = kelime.toCharArray();
//		char gecici = ch[0];
//		ch[0] = ch[ch.length-1];
//		ch[ch.length-1] = gecici ;
//		return String.valueOf(ch);
		StringBuilder stringBuilder = new StringBuilder(kelime);
		char first = kelime.charAt(0);
		char last = kelime.charAt(kelime.length()-1);
		stringBuilder.setCharAt(0, last);
		stringBuilder.setCharAt(kelime.length()-1, first);
		return stringBuilder.toString();
	}
        public static boolean isPalindrome(String kelime) {
        	
        	String str = new StringBuilder(kelime).reverse().toString();
        	boolean kontrol = kelime.equals(str) ;
        	return kontrol ;
			
}
	public static void main(String[] args) {
		// Cosenio 
		// girilen kelimenin ilk ve son harfini değiştirelim
       System.out.println(harfDegistir("consio"));
       System.err.println(isPalindrome("kayak"));
	}

}
