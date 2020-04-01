package TestNGDemos;

import org.testng.annotations.Test;

public class TestNGDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main method");

	}
	
	@Test(priority=0)
	public void login()
	{
		 System.out.println("Login Method of Class TestNGDemo");
		 System.out.println(0/0);
		 
	}
	
	@Test(priority=1,dependsOnMethods="login")
	public void customerDetails()
	{
		 System.out.println("CustomerDetails Class TestNGDemo");
		 
	}

	
}
