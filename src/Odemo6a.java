
public class Odemo6a {
	int x=1;//Global variables
	A a1= new A();////Global variables
	Odemo6a d1= new Odemo6a();
	void fun1()
	{
		x=x+1;
		a1.i=a1.i+x;
	}
	
	public static void main(String[] args) {
		Odemo6a d1= new Odemo6a();
		System.out.println(d1.x);
		
	}

}