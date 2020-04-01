package otherpack1;
import localpack1.DefaultDemo1;

public class DefaultTest2 extends DefaultDemo1  {

	public static void main(String[] args) {
		DefaultTest2 d1= new DefaultTest2();
		
		//d1.funA();//this is not visible as this method is not in same local pack1

		DefaultDemo1 d2= new DefaultDemo1();
		//d2.funA(); //this is not visible as this method is not in same local pack1
	}

}
