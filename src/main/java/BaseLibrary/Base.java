package BaseLibrary;

import org.openqa.selenium.WebDriver;         
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.asserts.SoftAssert;
 


public class Base 
{

	public static SoftAssert softassertion=new SoftAssert();
	public static WebDriver driver=new ChromeDriver();
	
	public static void getlaunch(String url) 
	{
	
		
		 driver.get(url);
		 driver.manage().window().maximize();
	
	}
}