//Calling Non static Method In Static
//Non static calling--->in static

public class MethodDemo1 {
	int i=10;
	static int j=20;
	public static void main(String[] args) {
		System.out.println("Main Method");
		funC();// calling static method in static main
		//funB();//we cant call non static method in static.so need to create an object
		MethodDemo1 m1=new MethodDemo1();
		m1.funA();
		m1.funB();
		m1.funC();//m1 is not static object variable but still calling non static..no error
	}
	
	void funA()
	{
		funC();//we can call static method in non static as well
		 System.out.println("Fun A Method");
	}
	
	void funB()
	{
		 System.out.println("Fun B Method");
	}
	
	static void funC()
	{
		 System.out.println("Fun C Method");
	}
}
