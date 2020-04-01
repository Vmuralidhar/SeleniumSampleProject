package seleniumDemos;

public class DebugDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 for(int i=0;i<5;i++){
			 
			 //System.out.println("Done1");
			 funA();
			 System.out.println("Value of Link"+ i+"th:"+i);
			
			 System.out.println("Done2");

		 }
		 
	}

	public static void funA()
	 {
		 System.out.println("static funA");
	
	 }
}
