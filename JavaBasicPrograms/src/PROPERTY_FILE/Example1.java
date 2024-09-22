package PROPERTY_FILE;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Writer;
import java.util.Properties;

public class Example1 {

	public static void main(String[] args, Writer fos) throws IOException {
		/*
		 * 
		   1. First find the location where you have stored property file
		   2. Create an instance of FileInputStream class and pass the property file location to its constructor.
		   3. Create an instance of Properties class
		   4. With the help of properties reference variable call load() properties class and pass
     	   	  FileInputStream class reference to this method
		   5. Call getProperty(key) of Properties class to read data from property file
		 */
		/*
		 * File path:
		 * 		absolute path: root till the target element
		 * 
		 * 		example:
		 * 		F:\Workplaces\CoreJava_Workspace\15thJunCoreJavaSession\AppData\TestData.properties //payal
		 * 
		 * D:\automation session\WORKSPACE\JavaBasicPrograms\appData\testData.properties // payal
		 * 
		 * 		relative path: starting from middle 
		 * 
		 * 		example:
		 * 		.\AppData\TestData.properties
		 * 
		 * 		where:
		 * 			'.'dot  indicates current working dir
		 * 				//or
		 * 		String currentDir=System.getProperty("user.dir");
		 * 		String filePath=currentDir+"\AppData\TestData.properties";
		
		*/
		
		// FileInputStream fis=new FileInputStream("F:\\Workplaces\\CoreJava_Workspace\\15thJunCoreJavaSession\\AppData\\TestData.properties");
		FileInputStream fis=new FileInputStream (" D:\\automation session\\WORKSPACE\\JavaBasicPrograms\\appData\\testData.properties")	;
		Properties prop=new Properties();
		
		prop.load(fis);
		
		String name=prop.getProperty("username");
		System.out.println(name);
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("mobile"));
		System.out.println(prop.getProperty("emailid"));
		
	prop.setProperty ( " location", "pune");	
	prop.setProperty ( " Company", "google");
	
	
	FileOutputStream fis1 = new FileOutputStream (name);
	prop.store(fos, "added location in to  the file");
	fos.close();
	
	}

}
