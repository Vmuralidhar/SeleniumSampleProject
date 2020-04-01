//Calling Non static Method In Static
//Non static calling--->in static
public class MethodDemo3 {
	int i=10;
	static int j=20;
	public static void main(String[] args) {
		System.out.println("Main Method Start");
		funC();// calling static method in static main
		System.out.println("Main Method End");
	}
	
	static void funA()
	{
		 System.out.println("Fun A Method");
		 funC();
	}
	
	static void funB()
	{
		 System.out.println("Fun B Method");
		 funA();
	}
	
	static void funC()
	{
		 System.out.println("Fun C Method");
		 funB();
	}
}
