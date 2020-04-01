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

public class AnnotationsDemo {
  @Test
  public void funA() {
	  System.out.println("This is @Test in FunA Demo1");
  }
  
  @Test
  public void funB() {
	  System.out.println("This is @Test in FunB Demo1");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is  @BeforeMethod Demo1");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is  @AfterMethod of Demo1");  
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is  @beforeClass Demo1");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is  @AfterClass Demo1");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is  @BeforeTest  Demo1");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is  @AfterTest  Demo1");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is  @BeforeSuite Demo1");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is  @AfterSuite Demo1");
  }

}
