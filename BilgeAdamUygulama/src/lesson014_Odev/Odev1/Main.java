package lesson014_Odev.Odev1;

public class Main {

	public static void main(String[] args) {
		
		
		//Employee employee1 = new Employee("Muhammet", 10000, 65, 1999);
		
		EmployeeMenager employee = new EmployeeMenager(new Employee("Muhammet", 5000, 65, 1999));
		
		employee.employeeBilgileriGoster();
		
		

	}

}
