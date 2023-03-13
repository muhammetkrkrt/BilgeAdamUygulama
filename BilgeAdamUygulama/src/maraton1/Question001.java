package maraton1;

public class Question001 {

	public static void bilgileriYazdır(String str) {

		int index = 1;

		for (int i = 0; i <10 ; i++) {
			for (int j = 0; j < index; j++) {
				System.out.print(str + " ");
			}
			if (index < 7) {
				System.out.println("");
				index++;
			}else {
				System.out.println("");
			}

		}
	}

	public static void main(String[] args) {

		bilgileriYazdır("*");

		// Aşağıdaki şeklidöngülerkullanarakekrana çizdiren staticmetod yazınız ve main
//		 içinden bu metoduçağırarak çalıştırınız:Programınız çalıştırıldığında konsola
//		 aşağıdaki görüntüyü çıkaracaktır
//		* 
//		* * 
//		* * *
//		* * * * 
//		* * * * * 
//		* * * * * * 
//		* * * * * * * 
//		* * * * * * * 
//		* * * * * * * 
//		* * * * * * * 

	}
}
