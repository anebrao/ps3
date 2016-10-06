package main;

public class Test {
	public static void main(String[] args) {

		Account account1 = new Account();
		account1.setId(1122);
		account1.setBalance(20000);
		account1.setAnnualInterestRate(4.5);

		account1.deposit(2500);
		account1.withdraw(30000);

		System.out.print("The balance is " + "$" + account1.getBalance() + ". " + "The monthly interest rate is" + " "
				+ +account1.getMonthlyInterest() + ". " + "The account was created on" + " "
				+ account1.getDateCreated());
	}
}
