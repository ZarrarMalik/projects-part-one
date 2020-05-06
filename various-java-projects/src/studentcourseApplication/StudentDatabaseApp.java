package studentcourseApplication;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		System.out.println("Enter the number of new students ?");
		Scanner sc = new Scanner(System.in);
		int numberOfStudents= sc.nextInt();
		Student [] student = new Student[numberOfStudents];
		
		for(int i=0; i <numberOfStudents; i++) {
		student [i] = new Student();
		student [i].enrollStudent();
		student [i].payTuition();
		System.out.println(student[i].toString());
	}
	}

}
