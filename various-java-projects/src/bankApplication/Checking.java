package bankApplication;

public class Checking extends Account {
	
	private int debitCardNumber;      // 12 digit debit card
	private int debitCardPin;         // 4 digit pin

	public Checking(String name, String natInsNo, double initialDeposit) {
		super(name, natInsNo, initialDeposit);
		accountNumber = "2" + accountNumber;     //all checking accounts will have int 2
		setDebitCard();

	}
	
	@Override
	public void setRate() {
		rate = getBaseRate()* 0.15;

		
	}
	private void setDebitCard() {
		debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
		debitCardPin = (int) (Math.random() * Math.pow(10, 4));

	}
	public void showInfo() {
		System.out.println("CHECKING account has been created");
		super.showInfo();  // showing super showInfo
		System.out.println(" YOur Debit Card details are as follows: " +
				"\n Debit Card Number " + debitCardNumber +
				"\n Debit Card Pin " + debitCardPin);

	}




}
