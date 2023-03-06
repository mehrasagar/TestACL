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
	
		  ChromeOptions o= new ChromeOptions();
	      // add Incognito parameter
	      o.addArguments("--incognito");
	      // DesiredCapabilities object
	      DesiredCapabilities c = DesiredCapabilities.chrome();
	      //set capability to browser
	      c.setCapability(ChromeOptions.CAPABILITY, o);
	     WebDriver driver = new ChromeDriver(o);
		 driver.get(url);
		 driver.manage().window().maximize();
	
	}
}