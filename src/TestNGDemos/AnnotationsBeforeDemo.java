package TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationsBeforeDemo {
  @Test
  public void funA() {
	  System.out.println("This is @Test in FunA Demo2");
  }
  
  @Test
  public void funB() {
	  System.out.println("This is @Test in FunB Demo2");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is  @BeforeMethod Demo2");
  }


  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is  @beforeClass Demo2");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is  @BeforeTest Demo2");
  }
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is  @BeforeSuite Demo2");
  }

  

}
