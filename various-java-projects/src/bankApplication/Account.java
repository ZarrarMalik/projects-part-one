package bankApplication;

public abstract class Account implements InterestRate {
	private String name;
	private String nationalInsuranceNumber;
	protected String accountNumber;
	private double balance;
	protected double rate;
	private static int index = 10000;

	public Account(String name, String nationalInsuranceNumber, double initialDeposit) {
		this.name = name;
		this.nationalInsuranceNumber = nationalInsuranceNumber;
		balance = initialDeposit;
		// Set account number
		this.accountNumber = setAccountNumber();
		index++;
		setRate();
	}

	public abstract void setRate();

	private String setAccountNumber() {
		String lastTwoNino = nationalInsuranceNumber.substring(nationalInsuranceNumber.length() - 2,
				nationalInsuranceNumber.length()); // get last two numbers of insurance number
		int uniqueID = index; // need unique five number id
		int randomNumber = (int) (Math.random() * Math.pow(10, 3)); // 3 random numbers
		return lastTwoNino + uniqueID + randomNumber;

	}

	public void compoundInterest() {
		double accuredInterest = balance * (rate / 100);
		balance = balance + accuredInterest;
		System.out.println("Accured Interest is $: " + accuredInterest);
		printBalance();
	}

	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Depositing amount " + amount);
		printBalance();
	}

	public void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Withdrawing amount " + amount);
		printBalance();
	}

	public void transfer(String transferTo, double amount) {
		balance = balance + amount;
		System.out.println("The amount is transfered to : " + transferTo);
	}

	public void printBalance() {
		System.out.println("The balance after Transaction is : " + balance);
	}

	public void showInfo() {
		System.out.println(
				"Name: " + name + "\n Account Number " + accountNumber + "\n Balance " + balance + "\n Rate " + rate);
	}
}
