public class ThisDemo2 {
	int a;
	ThisDemo2()
	{	
		System.out.println("into constructor");
		System.out.println(this);
		System.out.println(this.a);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println("In main method and before constructor");
		ThisDemo2 t1=new ThisDemo2();
		//new ConDemo4();
		//new ConDemo4();
		ThisDemo2 t2=new ThisDemo2();
		ThisDemo2 t3=new ThisDemo2();
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		//t1.a=30;
		//System.out.println(t1.a);
	}

}
