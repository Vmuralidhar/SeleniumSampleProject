package otherpack1;
import localpack1.ProtectedDemo1;

public class ProtectedOtherTest1 {

	public static void main(String[] args) {
		ProtectedDemo1 p1=new ProtectedDemo1();
		//p1.funA();///this is not visible as this method is not in same local pack1

	}

}
