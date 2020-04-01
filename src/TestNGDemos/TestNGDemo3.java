package TestNGDemos;

import org.testng.annotations.Test;

public class TestNGDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main method");

	}
	
	@Test
	public void funD()
	{
		 System.out.println("Fun D Method of Class TestNGDemo");
		 
	}
	
	@Test(priority=0)
	public void funC()
	{
		 System.out.println("Fun C Method of Class TestNGDemo");
		 
	}

	@Test
	public void funA()
	{
		 System.out.println("Fun A Method of Class TestNGDemo");
		 
	}

	@Test(priority=2)
	public void funB()
	{
		 System.out.println("Fun B Method of Class TestNGDemo");
		 
	}
	

	
}
