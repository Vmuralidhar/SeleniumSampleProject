
public class Odemo10 {

	A getA(int x)
	{
		A a1= new A();
		//System.out.println(x);
		//System.out.println(a1.i);
		//System.out.println(a1.j);
		a1.i=x;
		a1.j=x+1;
		//System.out.println(a1.i);
		//System.out.println(a1.j);
		return a1;
		
	}
	
	public static void main(String[] args) {
		Odemo10 d1= new Odemo10();
		A x=d1.getA(4);
		System.out.println(x);
		System.out.println(x.i);
		System.out.println(x.j);
		d1.getA(2);//here we did not assign to any reference variable
		//the blow statements still refer to the previous values
		System.out.println(x);
		System.out.println(x.i);
		System.out.println(x.j);
		
		x=d1.getA(2);

		System.out.println(x);
		System.out.println(x.i);
		System.out.println(x.j);
		
		System.out.println(d1.getA(4));//this will have different address bcoz each time new object is created
		System.out.println(d1.getA(5));//this will have different address bcoz each time new object is created
		int i=d1.getA(7).i;
		System.out.println(i);

	}
}