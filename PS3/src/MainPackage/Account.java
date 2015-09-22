package MainPackage;

import java.util.Date;

import MainPackage.InsufficientFundsException;

public class Account {
	
	public static void main(String[] args) {}
	
	// Encapsulation for the variables in Account
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	// No-Arg Constructor Default Account
	public Account() {
		int id = 0;
		double balance = 0;
		double annualInterestRate = 0;
		Date dateCreated = this.dateCreated;		
	}
	
	// Constructor for Specified id, balance, rate, and date
	public Account(int id, double balance, double annualInterestRate) {
		
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		this.dateCreated = dateCreated;		
	}
	// Getters for the variables in Account 
	public int getID() {
		return this.id;
	}
	public double getBalance() {
		return this.balance;
	}
	public Date getDateCreated() {
		return this.dateCreated;
	}
	
	// The monthly interest rate return method
	public double getMonthlyInterestRate() {
		return this.annualInterestRate;
	}
	
	// The withdraw method with testing of whether it can happen or not
	public void withdraw(double amount) throws
    InsufficientFundsException
	{
		if(amount <= balance) {
			balance -= amount;
		} else {
			double needs = amount - balance;
			throw new InsufficientFundsException(needs);
		}
	}
	
	// The deposit method
	public void deposit(double amount) {
		balance += amount;
	}
}
