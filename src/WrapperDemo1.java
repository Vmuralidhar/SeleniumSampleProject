
public class WrapperDemo1 {

	public static void main(String[] args) {
		int i=10;//primitive datatype
		Integer i1= new Integer(i); //boxing--Converting primitive to object
		A a1= new A();
	//	int j=a1+20;
		int j1=i1+20;
		System.out.println(i1);
		System.out.println(j1);
		int k=i1.intValue();//unboxing-converting object to primitive
		System.out.println(k);
		
		Integer i2=50;// new Integer(30);Auto boxing	
		System.out.println(i2);
		int l=i2;// i2.intValue() //auto unboxing
		System.out.println(l);
	}

}
