package basic;

import java.util.*;

public class Atm {
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		AtmProcess process=new AtmProcess();
        display();	
		int choice;
		do{
			choice=s.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Your Current Balance:"+process.balance());
				break;
			case 2:
				System.out.println("Enter the amount to Deposite:");
				double deposite=s.nextInt();
				process.Deposite(deposite);
				break;
			case 3:
				System.out.println("Enter the amount to Withdraw:");
				double draw=s.nextInt();
				process.withdraw(draw);
				break;
			case 4:
				System.out.println("Your Transaction as been terminated");
				System.exit(0);
				break;
			}
		}while(choice!=4);	
				
	}

	private static void display() {
		System.out.println("\t\t>>>>ATM<<<<\n1. Balance");
		System.out.println("2. Deposite");
		System.out.println("3. Withdraw");
		System.out.println("4. Exit");
		System.out.println("Enter your Choice:");	
	}

	

}
