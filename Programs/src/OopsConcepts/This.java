package inhert;

class A1{
	int a=100;
	void m(){
		System.out.println(a);  
	}
}
class B1 extends A1{
	int a=10;                   //global variable
	void n()
	{
		System.out.println("Inside n()" +a);
	}
	void m(){
		int a=-5;              
		System.out.println("Local " +a);              //local variable
		System.out.println("Global " +this.a);        //global variable
		this.n();              //Can access n() in B1
	}
}


public class This {

	public static void main(String[] args) {
		A1 obj = new B1();
		obj.m();             //Overrides m() method in B1
	}

}


