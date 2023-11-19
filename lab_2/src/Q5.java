import java.util.Scanner;

public class Q5 {
	
	static int id;
	static Scanner scan=new Scanner(System.in);
	static double[] accounts = new double[10];
	static boolean controlId=false;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < accounts.length; i++) 
		{
			accounts[i]=100;
		}
		atmLoop();

	}
	public static void atmLoop()
	{
		while(!controlId)
		{
			System.out.print("Enter an id: ");
			id = scan.nextInt();
			if (id < 0 || id > 9) {
				System.out.println("Please enter a correct id");
			}
			else {
				controlId=true;
			}

		}

		while(controlId)
		{
			int choice = getAMenu();

			switch (choice) {
			case 1:
				checkBalance(id);
				break;
			case 2:
				withdraw(id);
				break;
			case 3:
				deposit(id);
				break;
			case 4:
				exit();	        
			}
		}
	}
	public static void withdraw(int id) {
		System.out.print("Enter an amount to withdraw: ");
		double amount = scan.nextDouble();
		if (amount <= accounts[id]) {
			accounts[id]-=amount;
		}
		else {
			System.out.print("The amount is too large, ignored");
		}
	}
	public static void deposit(int id) {
		System.out.print("Enter an amount to deposit: ");
		double amount = scan.nextDouble();
		if (amount >= 0) {
			accounts[id]+=amount;
		}
		else {
			System.out.print("The amount is negative, ignored");
		}
	}
	public static void checkBalance(int id) {
		System.out.println("The balance is " + accounts[id]);

	}
	public static void exit() {
		controlId=false;
		atmLoop();	

	}

	public static int getAMenu() {
		int choice;

		while (true) {
			System.out.println("\nMain menu");
			System.out.println("1: check balance");
			System.out.println("2: withdraw");
			System.out.println("3: deposit");
			System.out.println("4: exit");
			System.out.print("Enter a choice: ");
			choice = scan.nextInt();
			if (choice < 1 || choice > 4) 
			{
				System.out.println("Wrong choice, try again: ");
			}
			else 
			{
				break;
			}
		}

		return choice;
	}


}