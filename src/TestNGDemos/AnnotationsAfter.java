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

public class AnnotationsAfter {


  @Test
  public void funA() {
	  System.out.println("This is @Test in FunA Demo3");
  }
  
  @Test
  public void funB() {
	  System.out.println("This is @Test in FunB Demo3");
  }


  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is  @AfterMethod Demo3");  
  }



  @AfterClass
  public void afterClass() {
	  System.out.println("This is  @AfterClass Demo3");
  }


  @AfterTest
  public void afterTest() {
	  System.out.println("This is  @AfterTest Demo3");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is  @AfterSuite Demo3");
  }

}
