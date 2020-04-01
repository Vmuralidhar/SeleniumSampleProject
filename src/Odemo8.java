
public class Odemo8 {
	int x=4;//Global variables
	A a1= new A();////Global variables
	Odemo8 d1;

	public static void main(String[] args) {
		System.out.println("main start");
		Odemo8 d1= new Odemo8();
		System.out.println(d1.x);
		System.out.println(d1.d1);
		d1.d1=new Odemo8();
		d1.d1.d1=new Odemo8();
		int x=6;
		d1.d1.d1.x=x;
		d1.d1.d1.d1=d1;//the last object is being assign o the first object reference
		System.out.println(x);//here it is 6//local variable
		System.out.println(d1.d1.d1.x);//here it is also 6
		d1.d1.d1.d1.x=13;
		System.out.println(x);//here it is 6//local variable
		System.out.println(d1.d1.d1.d1.x);//here it is global
		System.out.println(d1.d1.d1.d1.d1.x);
		System.out.println(d1.d1.d1.d1.d1.d1.x);
		System.out.println(d1.d1.d1.d1.d1.d1.d1.x);
		System.out.println(d1.d1.d1.d1);//same address
		System.out.println(d1);//same address
	}

}