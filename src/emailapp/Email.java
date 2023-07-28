package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private String companySuffix = "company.com";
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String alternateEmail;

	// constructor to receive first and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		// call method that asks for department
		this.department = setDepartment();
		
		// call method that asks for password
		this.password = randomPassword(defaultPasswordLength);
		
		email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + 
				"@" + this.department + "." + companySuffix;
		
	}
	
	// ask for department
	private String setDepartment() {
		System.out.print("\nEnter department \n> Sales\n> Development "
				+ "\n> Accounting \n> None");
				
		Scanner in = new Scanner(System.in);
		String dept = in.nextLine();
		
		if (dept.toLowerCase() == "none") {
			return "";
		}
		return dept.toLowerCase();
		
	}
	
	// generate random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"
				+ "0123456789!@#$%&";
		char[] password = new char[length];
		
		for (int i=0; i<length; i++) {
			int rand = (int) (Math.random() * passwordSet.length()); //get random number bet 0-passwordSet length
			password[i] = passwordSet.charAt(rand);
		}
		
		return new String(password);
	}
	
	// set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	// set alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	// change the password
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getMailboxCapacity() {return mailboxCapacity;}
	public String getAlternateEmail() {return alternateEmail;}
	public String getPassword() {return password;}
	
	public String showInfo() {
		return "Display Name: " + firstName + " " + lastName + "\n" +
				"Company Email: " + email + "\n" +
				"Mailbox Capacity: " + mailboxCapacity + " mb";
	}
	
}
