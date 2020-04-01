package TestNGDemos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesDemo1 {
	
	public static void main(String[] args) {
		Properties p1= new Properties();
		
		try {
			FileInputStream f1=new FileInputStream("C:\\Users\\computer\\Desktop\\IOPack\\ObjectsLocators.properties");
			p1.load(f1);
			System.out.println(p1.getProperty("username"));
			System.out.println(p1.getProperty("password"));
			System.out.println(p1.getProperty("signon"));

			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
