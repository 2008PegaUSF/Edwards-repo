package BankApp;

public abstract class User {

	//creates username string, and phoneNum and address pulled from current account
	protected String username, phoneNum, address;
	
	//creates the account number currently being worked on
	private int currentActNum;
	
	protected char userType;
	
	protected double curActBalance;
	
	protected void checkBalance() {

	}
	
	protected void depositFunds() {
		
	}
	
	protected void withdrawFunds() {
		
	}
	
	
	//Loads account info using currentActNum
	protected void loadActInfo() {
		
	}
	
	public static void menu(){
	
	}
	
} 
