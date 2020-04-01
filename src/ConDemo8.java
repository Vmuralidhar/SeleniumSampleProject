public class ConDemo8 {
	int a=5;
	int b=10;
	ConDemo8(int a,int b)
	{	//a=40;
		System.out.println("int args Cons Demo6");
		a=a;
		b=b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConDemo8 c1=new ConDemo8(20,30);

		System.out.println(c1.a);// here o/p 5 and 10..becoz int a,int b are local variables in constructor..it give preference to local..so object variables wont changes

		System.out.println(c1.b);
		
		
	}

}
