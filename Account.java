/**
* created by @ann_icel on 9/14/16
*/


public class Account{
	private int accountNumber;
	private double balance;

	public Account(int accountNumber) {
		this.accountNumber = accountNumber;
		this.balance = 0.0;
	}

	public Account(int accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void getBalance(double balance) {
		this.balance = balance;
	}

	public void credit(double amount) {
		balance = balance + amount;
	}

	public void debit(double amount) {
		if (balance >= amount) {
			balance = balance - amount;
		} else {
			throw new IllegalArgumentException("amount withdrawn exceeds the current balance!");
		}
	}

	public String toString() {
		String formattedBalance = String.format("%.2f", balance);
		return ("A/C no: " + accountNumber + ",Balance=" + formattedBalance);
	}
}