public class ThisDemo1 {
	int a=10;
	ThisDemo1()
	{	
		System.out.println("into constructor");
		System.out.println(this);
		System.out.println(this.a);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("In main method and before constructor");
		ThisDemo1 t1=new ThisDemo1();
		//new ConDemo4();
		//new ConDemo4();
		t1.a=30;
		System.out.println(t1.a);
	}

}
