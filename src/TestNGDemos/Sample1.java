package TestNGDemos;
import org.testng.annotations.Test;
public class Sample1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main method");

	}

	@Test(priority=0)
	public void login()
	{
		 System.out.println("Login Method of Class TestNGDemo");
		 //System.out.println(0/0);
		 
	}
	
}
