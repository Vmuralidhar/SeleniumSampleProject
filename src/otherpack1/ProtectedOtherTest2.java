package otherpack1;
import localpack1.ProtectedDemo1;

public class ProtectedOtherTest2 extends ProtectedDemo1 {

	public static void main(String[] args) {
		ProtectedOtherTest2 p2=new ProtectedOtherTest2();
		p2.funA();///child class can use protected method of parent even if it is other package
		System.out.println(p2.i);
	}

}
