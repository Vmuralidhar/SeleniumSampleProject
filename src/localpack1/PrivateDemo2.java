package localpack1;

public class PrivateDemo2 {
	
	private PrivateDemo2()
	{
		System.out.println("cons of PrivateDemo2");
		
	}

	void funB()
	{
		System.out.println("funB method of PrivateDemo2");		
	}
	static void funA()
	{
		System.out.println("static funB method of PrivateDemo2");
		PrivateDemo2 p2= new PrivateDemo2();
		p2.funB();
	}
	
}
