package TestNGDemos;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilPack1.ReadData;
import utilPack1.Xls_Reader;

public class HybridTest1 {
	
	@Test(dataProvider="setData")
	public void loginTest(Hashtable<String, String> h1) throws Exception
	{
		HybridDemo1 d1= new HybridDemo1();	
		d1.ExecuteKeywords(h1);
		
		 
	}
	@DataProvider
	 public Object[][] setData()
	 {

		 Xls_Reader r1= new Xls_Reader("C:\\Users\\computer\\Desktop\\IOPack\\HybridWorkBook.xlsx");		 		 		 
		 return ReadData.getData("Login",r1);
		 		 
	 }

}

