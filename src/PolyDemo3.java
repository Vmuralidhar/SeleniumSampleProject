
public class PolyDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolyDemo3 p1= new PolyDemo3();
		p1.funA();
		A a1=new A();		
		p1.funA(a1);
		p1.funA(new A());

		//p1.funA(null);//we get ambiguity as null is default value for object.it does not which object reference to take
		B b1=new B();		
		p1.funA(b1);
		
		C c1=new C();		
		p1.funA(c1);			
	}
	
	void funA()
	{
		System.out.println("zero args funA"); 
	}
	void funA(A a1)
	{
		System.out.println("A class args funA");
		System.out.println(a1); 
	}
	
	void funA(B a1)
	{
		System.out.println("B class args funA");
		System.out.println(a1); 
	}
	void funA(C a1)
	{
		System.out.println("C class args funA");
		System.out.println(a1); 
	}
}

