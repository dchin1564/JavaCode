
import java.util.Scanner;


public class Account {
	
	//Class variable
	int balance;
	int previousTransaction;
	String customerName;
	String customerID;
	
	
	
	public Account(String customerName, String customerID) {
		super();
		this.customerName = customerName;
		this.customerID = customerID;
	}
	
	

	//deposits money into account
	void deposit(int amount) {
		if (amount != 0) {
			balance = balance + amount;
			previousTransaction = amount;
		}
	}
	
	//withdraws money from account
	void withdrawal(int amount) {
		if (amount != 0) {
			balance = balance - amount;
			previousTransaction = -amount;
		}
	}
	
	//get transaction type and amount
	void getPreviousTransaction() {
		if (previousTransaction > 0) {
			System.out.println("Deposited: " + previousTransaction);
		} else if (previousTransaction < 0) {
			System.out.println("Withdrawal: " + Math.abs(previousTransaction));
		}else {
			System.out.println("No transaction has occurred");
		}
	}
	
	//calculates interest
	void calculateInterest(int years) {
		double interestRate = 0.0185;
		double newBalance = (balance * interestRate * years) + balance;
		System.out.println("The current interest rate is " + (100 * interestRate) + "%");
		System.out.println("After " + years + " years, your balance will be: " + newBalance);
	}
	
	void showMenu() {
		char option = '\0';
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome " + customerName);
		System.out.println("ID: " + customerID);
		System.out.println("What would you like to do?");
		System.out.println("A. Check your balance");
		System.out.println("B. Make a deposit");
		System.out.println("C. Make a withdrawal");
		System.out.println("D. View previous transaction");
		System.out.println("E. Calculate interest");
		System.out.println("F. Exit");
		
		do {
			System.out.println();
			System.out.println("Enter an option: ");
			char option1 = scanner.next().charAt(0);
			option = Character.toUpperCase(option1);
			System.out.println();
			
			switch(option) {
			
			//allows user to check the account balance
			case 'A':
				System.out.println("---------------");
				System.out.println("Balance = $" + balance);
				System.out.println("---------------");
				System.out.println();
				break; 
				
			//allows user to deposit money
			case 'B':
				System.out.println("Please enter an amount to deposit: ");
				int amount = scanner.nextInt();
				deposit(amount);
				System.out.println();
				break;
			
			//allows user to withdraw money from their account
			case 'C':
				System.out.println("Please enter an amount to withdraw: ");
				int amount2 = scanner.nextInt();
				withdrawal(amount2);
				System.out.println();
				break;
				
			//shows the most recent transaction that was made
			case 'D':
				System.out.println("Previous transaction");
				getPreviousTransaction();
				System.out.println();
				break;
				
			case 'E':
				System.out.println("Please enter the number of years for the accrued interest: ");
				int yearNum = scanner.nextInt();
				calculateInterest(yearNum);
				break;
				
			case 'F':
				System.out.println("You are now exiting the banking system");
				break;
				
			//in case an input is not A B C D E or F 
			default:
				System.out.println("Please enter an option A B C D E or F");
				break;
			}
			}while (option != 'F');
			System.out.println("Thank you for banking with us");
			
		}
	}
	
	
	

