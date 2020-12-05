package oops;

public class Employee_main {

	public static void main(String[] args) {
		
		Employee E1=new Employee();
		Employee E2=new Employee();
		
		E1.Name="sreeja";
		E1.Empid=1001;
		E1.Empsal=50000;
		
		E2.Name="Bharath";
		E2.Empid=1002;
		E2.Empsal=80000;
		
		E1.displayDetails();
		E2.displayDetails();
	
	}

}
