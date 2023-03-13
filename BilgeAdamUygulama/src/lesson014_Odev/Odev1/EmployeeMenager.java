package lesson014_Odev.Odev1;

public class EmployeeMenager {
	private int tax;
	private int bonus;
	private int raiseSalary;
	private Employee employee ;
	
	
	
	public EmployeeMenager() {
		super();
		
	}
	

	public EmployeeMenager(Employee employee) {
		super();
		this.employee = employee;
	}


	public void employeeBilgileriGoster() {
		System.out.println("Adi : " + employee.getName());
		System.out.println("Maasi : " + employee.getSalary());
		System.out.println("Calisma saati : " + employee.getWorkHours());
		System.out.println("Baslangic yili : " + employee.getHireYear());
		System.out.println("***********");
		bonus();
		tax();
		raiseSalary();
		System.out.println("***********");
		System.out.println("Vergi ve Bonuslar ile birlikte maas : " + (employee.getSalary()+bonus-tax));
		System.out.println("Toplam maas : " +  (employee.getSalary()+raiseSalary + bonus - tax));
		
	}

	public void tax() {
		if (employee.getSalary() <= 2000) {
			System.out.println("Vergi uygulamasindan muafsiniz.");
		} else {
			this.tax = (employee.getSalary() * 5) / 100 ;
			System.out.println("Vergiye tabisiniz.\n Vergi ucretiniz: " + tax + " TL");
	
		}

	}

	public void bonus() {
		if (employee.getWorkHours() > 40) {
			this.bonus = (employee.getWorkHours() - 40) * 30;
			System.out.println("Haftalik fazladan " + (employee.getWorkHours() - 40) + " saat calistiniz.");
			System.out.println("Bonus ucretiniz: " + bonus + " TL");
		}

	}

	public void raiseSalary() {
		int year = 2022 - employee.getHireYear();
		if(year<10) {
			this.raiseSalary = (employee.getSalary() * 5) / 100 ;
			
		}
		else if (year >= 10 && year <= 20) {
			this.raiseSalary = (employee.getSalary() * 10) / 100 ;
		}
		else {
			this.raiseSalary = (employee.getSalary() * 10) / 100 ;
		}
		System.out.println("Uygulanan maas artimi: "+ raiseSalary + " TL" );
	}

	

}
