package lesson003;

public class Question006 {

	public static void main(String[] args) {
		// 1 den 100 e kadar çift / tek 
		double ciftToplam=0;
		double tekToplam=0;
		for (int i = 1 ; i<=100 ; i++) {
			if(i%2==0) {
				ciftToplam=ciftToplam+ i ;
				}
			else {
				tekToplam = tekToplam + i;
			}
		}
		System.out.println("Oranı:" + ciftToplam / tekToplam);

	}

}
