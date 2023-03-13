package lesson007;

public class Question003 {

	public static void main(String[] args) {
		// Verilen arraydeki en büyük ve en küçük değerleri bulan program
		String[] array = { "5", "2", "3", "4", "99", "85" };

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 1; i < array.length; i++) {
			int sayi = Integer.parseInt(array[i]);
			if (sayi < min)
				min = sayi;
			if (sayi > max)
				max = sayi;

		}

		System.out.println("Min : " + min + " , Max : " + max);
	}

}
