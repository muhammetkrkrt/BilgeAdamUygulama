package lesson025;

public class OgretmenTest {

	public static void main(String[] args) {
		
		Ogretmen ogretmen1 = new Ogretmen("Ahmet");
		Ogretmen ogretmen2 = new Ogretmen("Ali");
		
		Thread t1 = new Thread(ogretmen1);
		Thread t2 = new Thread(ogretmen2);
		
		
		t1.start();
		t2.start();

	}

}
