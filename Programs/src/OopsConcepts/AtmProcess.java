package basic;

public class AtmProcess {
	
	double balance=5000;
	
	public double balance(){
		return balance;		
	}
	
	public void withdraw(double draw){
		if(balance>draw){
			balance= balance-draw;
			System.out.println("Sucessfully WithDrawed....");
		}else{
			System.out.println("Your Balance is too Low");
		}
	}
	
	public void Deposite(double deposite){
		balance += deposite;
		System.out.println("Sucessfully Deposited....");
	}
}
