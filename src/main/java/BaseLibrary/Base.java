package BaseLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;



public class Base 
{

	public static SoftAssert softassertion=new SoftAssert();
	public static WebDriver driver=null;
	
	public static void getlaunch(String url) 
	{
	
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	
	}
	
}
