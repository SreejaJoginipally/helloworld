package oops;

public class Employee {
	/*
	 *   ****class and object example****
	 *   1.create an Employee class
	 *   2.create class variables for Employee name ,Employee ID, Employee Salary
	 *   3.create a method to calculate and display employee bonus(20% of emp salary)
	 *   4.create a Employee_main class with main method
	 *   5.create 2 objects of Employee class in Employee_main
	 *   6.assign values to variables and call the method from Employee class by using the objects
	 *        created in step 5
	 */
	String Name;
	int Empid;
	long Empsal;
	long Bonus;
	
	public void displayDetails() {
		Bonus=Empsal*20/100;
		System.out.println("bonus of "+Name+" with ID:-"+Empid+" is "+Bonus  );
		
	}
}
