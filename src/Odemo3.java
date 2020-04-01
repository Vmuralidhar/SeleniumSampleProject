
public class Odemo3 {
	int x=3;//Global variables
	A a1 = new A();////Global variables
	
	public static void main(String[] args) {
		Odemo3 d1= new Odemo3();
		System.out.println(d1);
		System.out.println(d1.x);//here the d1 reference variable is again created
		System.out.println(d1.a1);
		System.out.println(d1.a1.i);
		d1.a1.funA();
		
	}

}