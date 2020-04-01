public class ThisDemo3 {
	int a;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println("In main method and before constructor");
		ThisDemo3 t1=new ThisDemo3();

		t1.funA();

	}
	void funB()
	{
		a=30;//here a is global and value updates to 30
	}
	
	void funA()
	{
		funB();
		int a=10;
		System.out.println(a);// here a is local variable and it printts 10
		System.out.println(this.a);//it is already updated to 30 in Fun B
		
	}
	
}
