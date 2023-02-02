package ApplicationUtilities;
 
import java.awt.AWTException;    
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLibrary.Base;

public class Application extends Base
{

static Actions act;




	
	public static void ScrollByxpath(WebElement ele)
	{
		try
		{
			
		JavascriptExecutor js= (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true)",ele);
		} 
		catch (Exception e) 
		{
			System.out.println("Issue in ScrollByxpath method");
		}
	}
	
	public static void Doubleclick(WebElement ele)
	{
	
		try
		{
     	act= new Actions(driver);
	    act.doubleClick(ele).build().perform();

	   } catch (Exception e)
	  {
	  System.out.println("Issue in Doubleclick method "+e);
	  }
    }

	public static void Rightclick(WebElement ele)
	{
	   try
	  {
	  act=new Actions(driver);
	  act.contextClick(ele).build().perform();

	  } catch (Exception e)
	 {
	 System.out.println("Issue in RIght click method "+e);
	 }
	}


	public static void Changewindow(int index)
	{
	try
	{
	ArrayList<String>tab= new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(tab.get(index));

	} catch (Exception e)
	{
	System.out.println("Issue in ChangeWindow method "+e);
	}
	}
	
	public static void SelectDropdown(WebElement ele,String value)
	  {
		  try 
		  {
			Select sel=new Select(ele);
			sel.selectByValue(value);
			
			
		  }
		  catch (Exception e) 
		  {
			  System.out.println("SelectDropdown");
		  }
	  }

	  public static void dragAndDropBy(WebElement slider)
		{
		   try
		  {
		  act=new Actions(driver);
		  act.dragAndDropBy(slider,50,0).perform();

		  } catch (Exception e)
		 {
		 System.out.println("Issue in Slider method "+e);
		 }
		 
		}	   
		   
	  
	  public static void Alertpopups(WebElement alertMessage )
		{
		   try
		  {
			   

		  } 
		 catch (Exception e)
		 {
		 System.out.println("Issue in Alertpopups method "+e);
		 }
		 
		}	   
		   
	  
	  
	  
	  public static void uploadFileWithRobot(String imagePath)
		
		   {
			StringSelection stringSelection = new StringSelection(imagePath);
			Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
			clipboard.setContents(stringSelection, null);
			Robot robot = null;
			try
			{
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.delay(150);
			robot.keyRelease(KeyEvent.VK_ENTER);
			} catch (AWTException e)
			{
			System.out.println("Issue in RobotUpload file");
			}

			robot.delay(250);
			}		
		
	  public static void waitforanelement(WebElement element)
	    {
	        try 
	        {
				WebDriverWait wait = new WebDriverWait(driver,20);
				 wait.until(ExpectedConditions.presenceOfElementLocated((By) element));
			}
	        catch (Exception e)
	        {
				System.out.println("Issue in waitforanelement file");
			}
	    }

	  
	  
	  
	  
	  
	  
}
