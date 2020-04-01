
public class Odemo6 {
	int x=1;//Global variables
	A a1;////Global variables
	void fun1()
	{
		x=x+1;
		a1.i=a1.i+x;
	}
	
	public static void main(String[] args) {
		Odemo6 d1= new Odemo6();
		d1.x=d1.x+2;
		d1.a1= new A();
		d1.a1.i=d1.a1.i+1;
		d1.fun1();
		System.out.println(d1.a1.i);
		System.out.println(d1.x);
		
	}

}