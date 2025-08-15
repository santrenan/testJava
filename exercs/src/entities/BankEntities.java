package entities;

public class BankEntities {
	private int account_number;
	private String account_holder;
	private double balance;
	private static final double TAX = 5.0;
	
	
	public BankEntities(int account_number, String account_holder, double initial_deposit) {
		super();
		this.account_number = account_number;
		this.account_holder = account_holder;
		this.balance = initial_deposit;
	}


	public int getAccount_number() {
		return account_number;
	}


	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}


	public String getAccount_holder() {
		return account_holder;
	}

	public double getBalance() {
		return balance;
	}


	public void setBalance(double initial_deposit) {
		this.balance = initial_deposit;
	}
	
	
	public double deposit(double value) {
		return balance += value;
	}
	
	public double withdraw(double value) {
		return balance -= (value - TAX);
	}
	
	@Override
	public String toString() {
	    return String.format("Account %d, Holder: %s, Balance: $%.2f", 
	                         getAccount_number(), 
	                         getAccount_holder(), 
	                         getBalance());
	}
	
	
}
