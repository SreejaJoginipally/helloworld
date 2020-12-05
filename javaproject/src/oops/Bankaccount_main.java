package oops;

public class Bankaccount_main {

	public static void main(String[] args) {
		Bank_account b1=new Bank_account(123456,"sreeja",200000);
		
		b1.displayBal();
		b1.deposit(3000);
		
		b1.displayBal();
		b1.withdraw(50000);
		
		b1.displayBal();
	
	}

}
