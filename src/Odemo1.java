
public class Odemo1 {
	int x,y; //Global variables
	
	void fun1()
	{
		x=x+1;
		//i=x+1;
		A a1=new A();
		a1.i=9;
		//System.out.println(a1.i); here the value is 9
	}
	public static void main(String[] args) {
		Odemo1 d1= new Odemo1();
		d1.fun1();
		//System.out.println(a1.i);
		System.out.println(d1.x);
		A a1=new A();
		System.out.println(a1.i);//here the a1 reference variable is again created and loaded with i and j with
		
	}

}
