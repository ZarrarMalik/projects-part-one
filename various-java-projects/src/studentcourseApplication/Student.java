package studentcourseApplication;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentId;
	private String courses = null;
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;

	public Student() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name: ");
		this.firstName = sc.nextLine();

		System.out.println("Enter Last name: ");
		this.lastName = sc.nextLine();

		System.out.println("1- freshman\n2- sophmore\n3- junior\n4- senior\n Enter Grade year: ");
		this.gradeYear = sc.nextInt();

		setStudentId();
		System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentId);

	}

	public void setStudentId() {
		// Grade level + ID
		id++;
		this.studentId = gradeYear + "" + id;

	}

	// enrol a student

	public void enrollStudent() {
		do {
			System.out.println("Enter a course id or press 'Q' to quit");
			Scanner sc = new Scanner(System.in);
			String course = sc.nextLine();
			if (!course.equals("Q")) {
				courses = courses + "\n" + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			} else {
				System.out.println("Break");
				break;
			}
		} while (1 != 0);
		System.out.println("Enrolled in  " + courses);
		System.out.println("Tuition fees  " + tuitionBalance);

	}

	public void viewBalance() {
		System.out.println("The Balance is " + tuitionBalance);
	}

	public void payTuition() {
		viewBalance();
		System.out.println("Enter the amount to pay ");
		Scanner sc = new Scanner(System.in);
		int payment = sc.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("ThankA you for your payment --");
		viewBalance();
	}
	
	public String toString() {
		return "Name : " + firstName + " " + lastName +
				"\nGrade level : "+ gradeYear +
				"\nStudentID : " + studentId +
				"\nCourses Enrolled : " + courses +
				"\nBalance :" + tuitionBalance;
	}

}
