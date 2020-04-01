public class ThisDemo4 {
	int a=5;
	ThisDemo4()
	{	
		System.out.println("zero args constructor");

	}

	ThisDemo4(int i)
	{	this();
		System.out.println("int args constructor");
		a=i;

	}
	public static void main(String[] args) {
		
		//System.out.println("In main method and before constructor");
		ThisDemo4 t1=new ThisDemo4(10);
		System.out.println(t1.a);

	}

}
