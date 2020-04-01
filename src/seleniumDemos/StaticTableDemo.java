package seleniumDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class StaticTableDemo {
	//column counts are same for all rows
	
	public static void main(String[] args) {
	
    String baseUrl = "http://only-testing-blog.blogspot.in/2013/09/test.html";
    WebDriver driver = new FirefoxDriver();
    driver.get(baseUrl);
    
    //.//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr[1]/td[1]
    /*
    String xpathvalue="//table/tbody/tr[1]/td[1]";
    
    String xpathvalue1="//table/tbody/tr[1]/td[1]";
    

String xpathvalue2="//table/tbody/tr[1]/td[2]";

String xpathvalue3="//table/tbody/tr[2]/td[1]";

String Value1=driver.findElement(By.xpath(xpathvalue1)).getText();
String Value2=driver.findElement(By.xpath(xpathvalue2)).getText();
String Value3=driver.findElement(By.xpath(xpathvalue3)).getText();


System.out.println(" Value1 "+Value1);
System.out.println(" Value2 "+Value2);
System.out.println("Value3"+Value3);.*/


String rowxpath="//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr";
String colxpath="//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr[1]/td";   

	List<WebElement> oRows = driver.findElements(By.xpath(rowxpath));
	List<WebElement> oCols = driver.findElements(By.xpath(colxpath)); 
	 int rowSize = oRows.size();
	 int colSize = oCols.size();
	 System.out.println("Total rows:"+rowSize);
	 System.out.println("Total rows:"+colSize);
	 
	 // Start the loop from first checkbox to last checkboxe
	 
	 for(int i=1;i<=rowSize;i++){
		 for(int j=1;j<=colSize;j++){
		 // Store the checkbox name to the string variable, using 'Value' attribute			 
		 //String sValue = oLinks.get(i).getAttribute("span");
		 String rowcolxpath ="//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr["+i+"]/td["+j+"]";		 		 
		 //System.out.println("Value of" +i+" th row"+" and" +j+"th col is:"+driver.findElement(By.xpath(rowcolxpath)).getText());
		 System.out.print(driver.findElement(By.xpath(rowcolxpath)).getText()+" ");
		 
		 }
		 System.out.println("");
	 }
    
    
	}
}

