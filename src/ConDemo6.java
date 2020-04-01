public class ConDemo6 {
	int a=10;
	static int b=20;
	ConDemo6(int i)
	{	a=40;
		System.out.println("int args Cons Demo6");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConDemo6 c1=new ConDemo6(10);

		System.out.println(c1.a);
		ConDemo6 c2=new ConDemo6(20);
		System.out.println(c2.a);
		ConDemo6 c3=new ConDemo6(10);
		System.out.println(c3.a);
		
		
	}

}
