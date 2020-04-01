package TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;


public class DataProviderDemo1 {
	
	 @Test(dataProvider="setData")
	  public void funA(int i) {
		  System.out.println("The value of i is: "+i);
	  }
	 
	 @Test(dataProvider="setData1")
	  public void funB(int i,int j) {
		  System.out.println("The value of i is:"+i+" and j is: "+j);
	  }
	 
	 @DataProvider
	 public Object[][] setData()
	 {
		 Object[][] o1= new Object[3][1];
		 
		 o1[0][0]=10;
		 o1[1][0]=20;
		 o1[2][0]=30;
		 
		 return o1;
		 
	 }
	 
	 @DataProvider
	 public Object[][] setData1()
	 {
		 Object[][] o1= new Object[3][2];
		 
		 for(int i=0;i<o1.length;i++)
		 for(int j=0;j<2;j++)	 
		 
		 o1[i][j]=i+10;
		 
		 return o1;
		 
	 }

}
