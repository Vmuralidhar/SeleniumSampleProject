package TestNGDemos;

public class KeywordTest1 {
	
	public static void main(String[] args) {
		KeywordsDemo1 t1=new KeywordsDemo1();
		t1.openBrowser("Firefox");
		t1.openUrl("http://newtours.demoaut.com/");
		t1.enterData("xpath", "//input[@name='userName']", "mercury");
		t1.enterData("xpath", "//input[@name='password']", "mercury");
		//click sign on
		t1.click("xpath", "//input[@name='login']");
		//click sign off
		t1.click("xpath", "//a[@href='mercurysignoff.php']");
		t1.closeBrowser();
		
	}

}
