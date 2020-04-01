public class ConThisDemo8 {
	int a=5;
	int b=10;
	ConThisDemo8(int a,int b)
	{	//a=40;
		System.out.println("int args Cons Demo6");
		this.a=a;
		this.b=b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConThisDemo8 c1=new ConThisDemo8(20,30);

		System.out.println(c1.a);

		System.out.println(c1.b);
		
		
	}

}
