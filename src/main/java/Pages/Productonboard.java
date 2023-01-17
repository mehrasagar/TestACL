package Pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLibrary.Base;

public class Productonboard extends Base
{

	public Productonboard()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@class='tooltip expnd']")
	private WebElement tooltip ;
	
	@FindBy(xpath="//*[@id='tenType']")
	private WebElement svvp ;
	
	@FindBy(xpath="//*[contains(text(),'CUSTOMER MANAGEMENT CONSOLE')]")
	private WebElement NN ;
	
	
	
	public void customer() 
	
	{
		try 
		{
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);			

			 WebElement PP=driver.findElement(By.xpath("//*[@class='companyText']"));
	            String S=PP.getText();
	            String E="CUSTOMER MANAGEMENT CONSOLE";
	            if(S.contains("E")) 
				{
					System.out.println("Text: " +E+	" is present.");
				}
				
				else
				{
					System.out.println("Text: " +E+	" is not present.");
				}
	           
		}
			
		catch (Exception e) 
		{
			System.out.println("Issue in customer method"+e); 

		}
	}
	
	
      public void productonboard()
	
	{
		try 
		{
            	
			tooltip.click();
			Thread.sleep(2000);
			List<WebElement> list=driver.findElements(By.xpath("//*[@class='grid']/div"));
			System.out.println("Total number of products in list::" +list.size());
			
			for(int i=0;i<list.size();i++)
			{
				System.out.println(list.get(i).getText());
				if(list.get(i).getText().contains("ProWatch"))
				{
					list.get(i).click();
					break;
				}
			}
			
			svvp.click();			
		}
			
		catch (Exception e) 
		{
			System.out.println("Issue in productonboard method"+e); 

		}
	}
	
	
	
	
}

