
public class Odemo2 {
	int x,y; //Global variables
	
	void fun1()
	{
		x=x+1;
		Odemo2 d1= new Odemo2();//here another object is created in heap area with d1 as reference varaiable
		d1.x=x+2;
		//System.out.println(d1.x); 
	}
	public static void main(String[] args) {
		Odemo2 d1= new Odemo2();
		d1.fun1();
		//System.out.println(a1.i);
		System.out.println(d1.x);//here the d1 reference variable is again created and loaded with i and j with
		
	}

}