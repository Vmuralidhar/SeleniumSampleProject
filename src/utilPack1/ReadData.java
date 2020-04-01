package utilPack1;

	import java.util.Hashtable;

	//import org.testng.annotations.Test;



	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	

	public class ReadData {

		public static void main(String[] args) {
		//@Test(dataProvider= "getData")
		//public void newcustomer(){
			Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir")+"\\src\\XLdata\\Test Data4 Test cases.xlsx");
		
			//ReadData data = new ReadData();
			getData("NewAccount", xls);
		
		}
		
			public static Object[][] getData(String testCase,Xls_Reader xls){
			 			System.out.println("*************");
				// find the test in xls
				// find number of cols in test
				// number of rows in test
				// put the data in hashtable and put hashtable in object array
				// return object array
				
				int testCaseStartRowNum=0;
				for(int rNum=1;rNum<=xls.getRowCount("Data");rNum++){
					
					if(testCase.equals(xls.getCellData("Data", 0, rNum))){
						testCaseStartRowNum = rNum;
						break;
					}
				}
				System.out.println("Test Starts from row -> "+ testCaseStartRowNum);
				
				
				// total cols
				int colStartRowNum=testCaseStartRowNum+1;
				int cols=0;
				while(!xls.getCellData("Data", cols, colStartRowNum).equals("")){
					cols++;
				}
				System.out.println("Total cols in test -> "+ cols);
				

				// rows
				int rowStartRowNum=testCaseStartRowNum+2;
				int rows=0;
				while(!xls.getCellData("Data", 0, (rowStartRowNum+rows)).equals("")){
					rows++;
				}
				System.out.println("Total rows in test -> "+ rows);
				Object[][] data = new Object[rows][1];
				Hashtable<String,String> table=null;
				
				// print the test data
				for(int rNum=rowStartRowNum;rNum<(rows+rowStartRowNum);rNum++){
				table=new Hashtable<String,String>();
					for(int cNum=0;cNum<cols;cNum++){
						table.put(xls.getCellData("Data", cNum, colStartRowNum),xls.getCellData("Data", cNum, rNum));
						System.out.print(xls.getCellData("Data", cNum, rNum)+" - ");
					}
					data[rNum-rowStartRowNum][0]=table;
					System.out.println();
				}

				return data;// dummy
				
				
				
				
			}

		}


