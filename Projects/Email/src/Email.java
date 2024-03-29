import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private String department;
	private int mailBoxCapacity = 500; 
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String companySuffix = "aeycompany.com";
	
	//Constructor to receive the first name and last name 
	public Email(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		
		System.out.println("email created: " + this.firstName + " " + this.lastName);
	
		//call a method asking for the department - return the department
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
	
		//Call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password);
		
		//Combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		System.out.println("Your email is: " + email);
	}
	
	//Ask for the department
	private String setDepartment() {
		System.out.print(("Department codes \n 1 for Sales \n 2 for Developement \n 3 for Accounting \n 0 for none \n Enter department code: "));
		Scanner in = new Scanner(System.in);
		int choice = in.nextInt();
		if (choice == 1) {
			return "Sales";
		}else if (choice == 2) {
			return "Development";
		}else if (choice == 3) {
			return "Accounting";
		}
		else {
			return "";
		}
	}
	
	
	//Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTOUWXYZ0123456789!@#$%"; 	
		char[] password = new char[length];
		for (int i = 0;i<length;i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	//Set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailBoxCapacity = capacity;
		
	}
	//Set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	//Change the password
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailboxCapacity() {
		return mailBoxCapacity;
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String showInfo() {
		return "Display Name: " + firstName + " " + lastName +
				"Company Email: " + email + 
				"Mailbox capacity: " + mailBoxCapacity + "mb";
	}
	
}
