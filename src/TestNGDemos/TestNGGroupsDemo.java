package TestNGDemos;

import org.testng.annotations.Test;

public class TestNGGroupsDemo {
	
	
	@Test(groups="Regression")
	public void funA()
	{
		 System.out.println("Fun A Method of Class TestNGGroupsDemo for Regression");
		 
	}

	@Test(groups="Regression")
	public void funB()
	{
		 System.out.println("Fun B Method of Class TestNGGroupsDemo for Regression");
		 
	}
	
	@Test(groups="Sanity")
	public void funC()
	{
		 System.out.println("Fun C Method of Class TestNGGroupsDemo for Sanity");
		 
	}
	
	@Test(groups="Sanity")
	public void funD()
	{
		 System.out.println("Fun C Method of Class TestNGGroupsDemo for Sanity");
		 
	}



}
