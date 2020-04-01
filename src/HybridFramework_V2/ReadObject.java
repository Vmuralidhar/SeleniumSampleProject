package HybridFramework_V2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadObject {

	Properties p;
	//File Input stream should be in constructor
	public ReadObject()
	{	
		try {
			p= new Properties();
			FileInputStream f;
			f = new FileInputStream("C:\\Users\\computer\\Desktop\\IOPack\\ObjectsLocators.properties");
			p.load(f);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	
}