public class ThisDemo5 {
	int a=5;
	ThisDemo5(int i)
	{	
		System.out.println("int args constructor");
		a=i;

	}
	ThisDemo5()
	{	this(20);
		System.out.println("zero args constructor");

	}
	public static void main(String[] args) {
		
		//System.out.println("In main method and before constructor");
		ThisDemo5 t1=new ThisDemo5();
		System.out.println(t1.a);

	}

}
