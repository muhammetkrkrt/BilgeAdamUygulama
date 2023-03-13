package maraton1;

public class Question003 {
	public static int karakterSayici(String kelime , char harf) {
		int sayac = 0;
		for(int i = 0; i < kelime.length(); i++) {
            if(harf == kelime.charAt(i)) {
                sayac++;
            }
        }
			
	return sayac;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("g harfi için :  ");
		System.out.println(karakterSayici("Bugün güzel bir gün", 'g'));
		System.out.print("x harfi için :  ");
		System.out.println(karakterSayici("Bugün güzel bir gün", 'x'));
		
	}

}
