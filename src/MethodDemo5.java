//Calling Non static Method In Non Static
//Non static calling--->Non static

public class MethodDemo5 {
	int i=10;
	static int j=20;
	public static void main(String[] args) {
		System.out.println(j);
		MethodDemo5 m1=new MethodDemo5();
		System.out.println(m1.i);
		m1.funB();
		
	}
	
	void funA()
	{	
		 System.out.println("Fun A Method");
		 System.out.println(j);//calling static variable in non static
		 System.out.println(i);
		 
	}
	
	void funB()
	{
		 System.out.println("Fun B Method");
		 funA();// calling non static to static
	}
	

}
