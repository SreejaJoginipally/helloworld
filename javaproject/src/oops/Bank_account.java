package oops;

public class Bank_account {
	/**
	 * ***Exercise****
	 * 1. Create a Bank_Account class
	 * 2. Create private member variables for Account Number, Account Name and Account Balance
	 * 3. Create methods to deposit and withdraw the amount and to display the current Balance
	 * 4. Create an constructor with arguments for Account Number, Name and Balance
	 * 4. Create a class BankAccount_Main with a main method 
	 * 5. Create an object of Bank_Account
	 * 6. Call the methods to deposit and withdraw the money from Bank Account and Display the current Balance
	 */
	
	private long Accno;
	private String Accname;
	private double Accbal;
	
	//public Bank_account(int i, String string, int j) {
		// TODO Auto-generated constructor stub
	//}

	public void deposit(double Amount) {
		
		if(Amount>0) {
			Accbal=Accbal+Amount;
			System.out.println("successfully deposited "+Amount);
			}
		    else {
				System.out.println("sorry transaction failed");	
			}
	}
		
	public void withdraw(double Amount) {
		if(Amount>Accbal) {
			System.out.println("transaction failed");
		}else if(Amount==0) {
			System.out.println("enter amount");
		}else {
			Accbal=Accbal-Amount;
			System.out.println("remaining amount"+Accbal);
		}
	}
	public void displayBal() {
		//return Accbal;
		System.out.println("balance is"+Accbal);
		}
	public Bank_account(long Acno,String Name,double Bal) {
		this.Accbal=Bal;
		this.Accname=Name;
		this.Accno=Acno;
		
	}
	
}
