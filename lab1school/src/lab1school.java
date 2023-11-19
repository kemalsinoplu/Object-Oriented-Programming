import java.util.Random;
import java.util.Scanner;


public class lab1school {
/*	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		while (true) {
			
			System.out.println ("please enter a digit between 1-9: ");
			
			int inputNumber= scan.nextInt();
			if (0<inputNumber && inputNumber<10){
				
				for (int i=0; i<inputNumber; i++) {
				
					for (int j=0; j<i; j++) {
					
						System.out.print(" ");
					
					}
					for (int j=1; j<=3; j++) {
					
						System.out.print(i+1);
					
					}
					System.out.println();
				
				}
				
			}
			else {
					
					System.out.println ("Girdiðiniz Sayý 1-9 arasýndan seçmediniz. Try Again!!! ");
					
				}
			
			
		}
		
	}
	*/
/*
	public static void main (String[] args) {
		
		Scanner scan=new Scanner(System.in);
		Random rnd = new Random();
		int randomNumber = rnd.nextInt(99)+1; // [1 ile 99 arasý demek]
		System.out.println("Enter a number");
		int userNumber= scan.nextInt();
		int attempt=1;
			while (userNumber!=randomNumber){
				
				if (userNumber>randomNumber) {
					
					System.out.println("please enter a lower number");
					
				}
				else if (userNumber<randomNumber){
					
					System.out.println("please enter a higher number");
					
				}
				userNumber = scan.nextInt();
				attempt++;
			}
			
		System.out.println("you guessed the number after"+attempt+"attempts");
		
	}
*/
/*	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter age of employe");
		int age= scan.nextInt();
		System.out.println("Enter salary of employee");
		double salary= scan.nextDouble();
		double tax=0;
		
		if ((age>=18) && (age<=35))
		{
			tax= (0.16*17000)+(0.25*(salary-17000));
		}
		else if(age<=50)
		{
			tax= (0.16*23000)+(0.25*(salary-29000));
		}
		else if(age<=74)
		{
			tax= (0.16*29000)+(0.25*(salary-29000));
		}
		else
		{
			tax= (0.16*14000)+(0.25*(salary-14000));
		}
		System.out.println("Tax is: "+tax);
		
	}*/
/*	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		int harf;
		Random s=new Random();
	for (int i=1; i<=9; i++)
	{
		harf=s.nextInt(26)+65; // --> [65-90] uppercase letters ascii
		System.out.print((char)harf);
	}
	harf=s.nextInt(10); // nextInt(a) = [0, a-1] 
	System.out.print(harf);
		
	}
*/
/*
	public static void main(String[] args){
		// first triangle
		
		for (int i=0; i<10; i++)
		{
			for (int j=0; j<i; j++)// satýr sayýsý kadar
			{
				System.out.print(" ");
			}
			for (int j=10; j>i; j--)// 10dan baþla, satýr no'ya inene kadar yýldýz
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		// Second triangale
		for(int i=0; i<10; i++)
		{
			for(int j=9; j>i; j--) // 9 dan baþla, satýr no'ya inene kadar boþluk
			{
				System.out.print(" ");
			}
			for (int j=0; j<=i; j++)// satýr no'lar +1 kadar yýldýz
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
*/
	public static void main(String[] args){
		
		Scanner scan=new Scanner(System.in); 
		int largest = 0; // largest number
		int input;// user input
		int counter=0;// number of values entered
// write code to get the first int and store it in variable largest
		System.out.println("Enter number: ");
		largest= scan.nextInt();
		counter++;
// write code to loop until 10 numbers are entered
		while(counter<10)
		{
//write code to prompt the user to enter a number and read that number			
			System.out.print("Enter Number: ");
			input=scan.nextInt();
// write code to test whether the number entered is greater than the largest
// if so, replace the value of largest wtih the entered number 
			if(input>largest)
			{
				largest=input;
			}
//write code to increment the number of integers entered
			counter++;
		}
		System.out.println("Largest number is: "+largest);
	}
	
	
	
	


}
