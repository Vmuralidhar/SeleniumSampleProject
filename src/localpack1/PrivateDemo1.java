package localpack1;

public class PrivateDemo1 {
	private int i=10;

	public static void main(String[] args) {
	
		PrivateDemo1 p1= new PrivateDemo1();
		p1.funB();

	}
	private void funA()
	{
		System.out.println("funA method of PrivateDemo1");
		
	}

	void funB()
	{
		System.out.println("funB method PrivateDemo1");
		System.out.println(i);
		funA();		
		
	}
}
