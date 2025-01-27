package seleniumDemos.Guru99;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MercuryTitleDemo {
	    public static void main(String[] args) {
	        // declaration and instantiation of objects/variables
	    	WebDriver driver ;
	    	driver = new FirefoxDriver();
	        String baseUrl = "http://newtours.demoaut.com";
	        String expectedTitle = "Welcome: Mercury Tours";
	        String actualTitle = "";

	        // launch Fire fox and direct it to the Base URL
	        driver.get(baseUrl);

	        // get the actual value of the title
	        actualTitle = driver.getTitle();

	        /*
	         * compare the actual title of the page with the expected one and print
	         * the result as "Passed" or "Failed"
	         */
	       // if (actualTitle.contentEquals(expectedTitle)){
	        	
	       
	       if (actualTitle.contains(expectedTitle)){      	        	
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        }
	       
	        //close Fire fox
	        driver.close();
	       
	        // exit the program explicitly
	        System.exit(0);
	    }

	}
