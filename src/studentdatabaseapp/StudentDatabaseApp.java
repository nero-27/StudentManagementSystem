package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
		// ask how many users we want to add
		System.out.print("\n Enter number of new students to enroll: ");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];
		
		// create n number of new students
		for (int n=0; n<numOfStudents; n++) {
			System.out.print("\n\n STUDENT " + (n+1));
			students[n] = new Student();
			students[n].enroll();
			students[n].payTuition();
			System.out.print(students[n].showInfo());
		}
		

	}

}
