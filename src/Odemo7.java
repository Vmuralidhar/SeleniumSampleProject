
public class Odemo7 {
	int x=1;//Global variables
	A a1= new A();////Global variables
	Odemo7 d1= new Odemo7();
	void fun1()
	{
		x=x+1;
		a1.i=a1.i+x;
	}
	
	public static void main(String[] args) {
		Odemo7 d1= new Odemo7();
		System.out.println(d1.x);
		
	}

}