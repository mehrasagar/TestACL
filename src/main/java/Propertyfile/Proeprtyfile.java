package Propertyfile;

import java.io.FileInputStream;  
import java.util.Properties;

public class Proeprtyfile
{
	 static FileInputStream fis;
	    public static final String path="D:\\eclipse-workspace\\TestACL\\TestData.properties";
	    
	    public static String Getpropertyvalue(String Key)
	    {
	    	Properties prop=new Properties();
	    	String out=null;
	    	try 
	    	{
				fis=new FileInputStream(path);
				prop.load(fis);
				out=prop.getProperty(Key);
			} 
	    	catch (Exception e)
	    	{
	    		System.out.println("Issue in Getpropertyvalue "+e);
			}
	    	return out;
	    }
}
