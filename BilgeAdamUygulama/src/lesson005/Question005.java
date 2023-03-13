package lesson005;

public class Question005 {

	public static void main(String[] args) {
		// 
      int[] sayilar = {2,4,10,5};
      int sayac=0;
      int toplam = 0;
      int[] ciftler = new int[sayac];
      for(int i = 0;i<sayilar.length;i++) {
    	  toplam=toplam+sayilar[i];
    	  if(sayilar[i]%2==0) {
    		  
    		  sayac++;
    		  System.out.println(sayilar[i] + "Çifttir.");
    		  }else {
    			  System.out.println(sayilar[i] + "Tektir.");
    		  }
      
      
      }
      System.out.println(toplam);
      
      
      
      
      
      
      
      
	}

}
