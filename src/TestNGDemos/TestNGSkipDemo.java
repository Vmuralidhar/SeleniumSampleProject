package TestNGDemos;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNGSkipDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main method");

	}
	
	@Test(dependsOnMethods="funB")
	public void funA()
	{	//skipping dependsOnMethods
		 System.out.println("Fun A Method of Class TestNGDemo");
		 
	}

	@Test
	public void funB()
	{
		 System.out.println("Fun B Method of Class TestNGDemo");
		 System.out.println(0/0);
		 
	}
	@Test(enabled=false)
	public void funC()
	{  //skipping when enabled false
		 System.out.println("Fun C Method of Class TestNGDemo");
		 
	}
	@Test
	public void funD() throws Exception
	{	//skipping the exception....SkipException is TestNG 
		 System.out.println("Fun D Method of Class TestNGDemo");
		 //throw new Exception ("throwing exception");
		 throw new SkipException ("throwing exception");
		 
	}
	
		
}
