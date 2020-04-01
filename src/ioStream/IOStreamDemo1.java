package ioStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.stream.FileImageInputStream;

public class IOStreamDemo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileOutputStream f1=new FileOutputStream("C:\\Users\\computer\\Desktop\\IOPack\\Test1.txt");
		
		//FileInputStream f2=new FileInputStream("C:\\Users\\computer\\Desktop\\IOPack\\Test2.txt");
		
		File f3= new File("C:\\Users\\computer\\Desktop\\IOPack\\Test3.txt");
		f3.createNewFile();
		
		File f4=new File("C:\\Users\\computer\\Desktop\\IOPack\\Folder1");
		f4.mkdir();//folder

		File f5=new File("C:\\Users\\computer\\Desktop\\IOPack\\A\\B\\C");
		f5.mkdirs();//it will create all the folders even if the parent folder does not exist
		
		

	}

}
