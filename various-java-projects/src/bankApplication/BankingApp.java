package bankApplication;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BankingApp {

	public static void main(String[] args) throws IOException {
		Csv csv = new Csv();

		List <Account> accounts = new ArrayList<Account>();
		
		
		String file = ("C:\\zarrar\\java\\NewBankAccounts.csv");

		// Savings savg = new Savings("Owen", "123456789", 1500);
		// Checking chek = new Checking("Wilson", "987654321", 17000);
		// chek.compoundInterest();
		//
		// savg.showInfo();
		// System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^");
		// chek.showInfo();
		//
		// savg.deposit(5000);
		// chek.withdraw(4000);
		// chek.transfer("Barry", 5000);
		List<String[]> newAccountHolder = csv.read(file);
		for (String[] accountHolder : newAccountHolder) {
//			System.out.println("********NEW Account has been created********");
			String name = accountHolder[0];
			String nationalInsuranceNumber = accountHolder[1];
			String accountType = accountHolder[2];
			double deposit = Double.parseDouble(accountHolder[3]);
//			System.out.println("Name : " + name + "National Insurance Number : " + nationalInsuranceNumber
//					+ "Account Type : " + accountType + "Initial Deposit : " + deposit);
			if (accountType.equals("Savings")) {
				accounts.add(new Savings(name, nationalInsuranceNumber, deposit));

			} else if (accountType.equals("Checking")) {
				accounts.add(new Checking(name, nationalInsuranceNumber, deposit));


			} else {
				System.out.println("There is an error creating your account ");

			}

		}
		
		for (Account ac: accounts) {
			System.out.println("*****************");
			ac.showInfo();
		}
	
		
	}
}
