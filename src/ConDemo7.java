public class ConDemo7 {
	int a=5;
	int b=10;
	ConDemo7(int i,int j)
	{	//a=40;
		System.out.println("int args Cons Demo6");
		a=i;
		b=j;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConDemo7 c1=new ConDemo7(20,30);

		System.out.println(c1.a);

		System.out.println(c1.b);
		
		
	}

}
