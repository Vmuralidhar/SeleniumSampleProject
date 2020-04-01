//Calling Non static Method In Static
//Non static calling--->in static
public class MethodDemo2 {
	int i=10;
	static int j=20;
	public static void main(String[] args) {
		System.out.println("Main Method");
		funC();// calling static method in static main
		//funB();//we cant call non static method in static.so need to create an object
		MethodDemo2 m1=new MethodDemo2();
		m1.funA();
	}
	
	void funA()
	{
		 System.out.println("Fun A Method");
	}
	
	void funB()
	{
		 System.out.println("Fun B Method");
	}
	
	static void funC()
	{
		 System.out.println("Fun C Method");
		//funB();//we cant call non static method in static.so need to create an object
			MethodDemo2 m1=new MethodDemo2();
			m1.funB();
		 
	}
}
