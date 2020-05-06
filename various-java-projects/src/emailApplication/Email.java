package emailApplication;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity;
	private int defaultPasswordLength = 10;
	private String alternativeEmail;
	private String suffixCompany = "myself.com";
	private int emailCapacity;
	private String altEmail;

	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = setDepartment();
		System.out.println(department);
		this.password = randomPassword(defaultPasswordLength);
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + suffixCompany;
		
	}

	private String setDepartment() {
		System.out.println("New Worker: " +firstName + " " + lastName+ " "+ "Enter Department Codes : \n 1 for Sales\n 2 for IT\n 3 for HR\n 0 for none\n Enter digit: ");
		Scanner sc = new Scanner(System.in);
		int deptChoice = sc.nextInt();
		if (deptChoice == 1) {
			return "Sales";
		} else if (deptChoice == 2) {
			return "IT";
		} else if (deptChoice == 3) {
			return "HR";
		} else {
			return "Not possible";
		}
	}

	private String randomPassword(int size) {
		String passwdChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ$#&^%";
		char[] password = new char[size];
		for (int i = 0; i < size; i++) {
			int random = (int) (Math.random() * passwdChars.length());
			password[i] = passwdChars.charAt(random);
		}
		return new String(password);
	}

	public void setEmailCapacity(int capacity) {
		this.emailCapacity = capacity;
	}

	public void setAltEmail(String email) {
		this.altEmail = email;
	}

	public void changePassword(String password) {
		this.password = password;
	}

	public int getEmailCapacity() {
		return emailCapacity;
	}

	public String getAltEmail() {
		return altEmail;
	}

	public String getPassword() {
		return password;
	}
	
	public String showDetails() {
		return  "DISPLAY NAME: " + firstName +""+ lastName +
				"\nYOUR Password is: "+ password+
				"\nCompany Email: " + email +
				"\nMailbox Capacity :" + emailCapacity + "mb";
		
	}
}
