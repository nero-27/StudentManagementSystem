package studentdatabaseapp;

import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private String gradeYear;
	private String studentID;
	private String courses = "";
	private int tuitionBalance = 0;
	private static int costOfCourse = 600; // static: true for class not just for its instance
	private static int id = 1000;
	
	// constructor: prompt user to ask students name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("\n Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("\n Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.print("\n Enter student grade level in number \n1 - freshman \n2 - sophomore"
				+ "\n3 - junior \n4 - senior : ");
		this.gradeYear = in.nextLine();
		
		setStudentID();
		
		System.out.print("\n Student: " + this.firstName + " " + this.lastName
				+ " " + this.gradeYear + " " + this.studentID);
		
		
	}
	
	// generate ID
	private void setStudentID() {
		// gradeyear + static ID
		id++;
		this.studentID = gradeYear + "" + id;
	}
	
	
	// enroll in courses
	public void enroll() {
		// get inside for loop, Q for quit
		do {
			System.out.print("\n Enter course to enroll (Q for quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equals("Q")) {
				courses = courses + "\n   " + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			}
			else {
				break;
			}
		} while (1 != 0);
		
//		System.out.print("\n ENROLLED COURSE: " + courses);
//		System.out.print("\n TUITION BALANCE: " + tuitionBalance);
	}
	
	// view balance
	public void viewBalance() {
		System.out.print("\n Your balance is : $" + tuitionBalance);
	}
	
	// pay tuition
	public void payTuition() {
		viewBalance();
		System.out.print("\n Enter your payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.print("\n Thankyou for your payment of $" + payment);
		viewBalance();
	}
	
	// show info
	public String showInfo() {
		return "\nName: " + firstName + " " + lastName +
				"\nGrade level: " + gradeYear +
				"\nStudentID: " + studentID + 
				"\nCourses Enrolled: " + courses +
				"\nBalance: $" + tuitionBalance;
	}
}
