package inhert;


class Parent{
	int a=100;
	void m(){
		System.out.println("Parent Class" +a);   //global variable
	}
}
class Child extends Parent{
	int a=10;                  
	void m(){
		int a=-5;              
		System.out.println(a);            //local variable
		System.out.println(this.a);       //same class variable 
		System.out.println(super.a);      //parent class variable
		super.m();                        //to access parent class methods
	}
}

public class Super {

	public static void main(String[] args) {
	Parent obj = new Child();
	obj.m();// 
	}

}

