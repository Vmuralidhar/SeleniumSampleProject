package HybridFramework;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilPack1.ReadData;
import utilPack1.Xls_Reader;

public class ExecuteTest {
	
	@Test(dataProvider="setData")
	public void loginTest(Hashtable<String, String> h1) throws Exception
	{
		DriverScript d1= new DriverScript();	
		d1.ExecuteKeywords(h1);		 
	}
	@DataProvider
	 public Object[][] setData()
	 {
		 Xls_Reader r1= new Xls_Reader("C:\\Users\\computer\\Desktop\\IOPack\\HybridWorkBook.xlsx");		 		 		 
		 return ReadData.getData("Login",r1);
		 		 
	 }

}

