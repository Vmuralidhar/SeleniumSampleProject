package ioStream;


import utilPack1.Xls_Reader;

public class IOReadandWriteDemo {
	
	public static void main(String[] args) {
		Xls_Reader r1= new Xls_Reader("C:\\Users\\computer\\Desktop\\IOPack\\TestCase1.xlsx");
		
		int rowcount=r1.getRowCount("Login");
		int colcount=r1.getColumnCount("Login");
	
	    System.out.println("Total rows "+rowcount);
	    System.out.println("Total cols "+colcount);
	    
	    for(int i=2;i<=rowcount;i++)
	    	for(int j=0;j<colcount;j++)
	    	{
	    		//System.out.println("value in username: "+r1.getCellData("Login", "UserName", i));
	    		System.out.println("value : "+r1.getCellData("Login", j, i));
	    			    		
	    		//System.out.println("value in password: "+r1.getCellData("Login", "Password", i));
	    		
	    		
	    	}
	    
	   		  

	}
	
	

}
