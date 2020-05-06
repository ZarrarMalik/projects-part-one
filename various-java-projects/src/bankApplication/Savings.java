package bankApplication;

public class Savings extends Account {
	private int safetyDepositBoxId;   // 3 digit id
	private int safetyDepositBoxKey;  // 4 digit key

	public Savings(String name, String natInsNo, double initialDeposit) {
		super(name, natInsNo, initialDeposit);
		accountNumber = "1" + accountNumber;    // all savings account will have int 1
		setSafetyDepositBox();
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() - 0.25;

	}
	public void setSafetyDepositBox() {
		safetyDepositBoxId = (int) (Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey = (int) (Math.random() * Math.pow(10,4));
	}
	
	
public void showInfo() {
	System.out.println("SAVINGS account has been created");
	super.showInfo();
	System.out.println(" YOur Safety Deposit details are as follows: " +
						"\n Safety Deposit Box id " + safetyDepositBoxId +
						"\n Safety Deposit Box key " + safetyDepositBoxKey);
	
}


}
