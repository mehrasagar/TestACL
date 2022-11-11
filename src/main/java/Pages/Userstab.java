package Pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLibrary.Base;

public class Userstab extends Base
{
	public Userstab()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@formcontrolname='userID']")
	private WebElement username ;
	
	@FindBy(xpath="//*[@formcontrolname='password']")
	private WebElement password ;
	
	@FindBy(xpath="//*[@class='mb-15px']")
	private WebElement signin ;
	
	
	@FindBy(xpath="//*[@class='icon-col']")
	private WebElement prowatchproduct ;
	
	@FindBy(xpath="(//*[@class='menu-submenu ng-tns-c76-10 ng-star-inserted']/div)[1]")
	private WebElement tabs ;
	
	@FindBy(xpath="")
	private WebElement b ;
	
	

	
	
	
	public void loginacltenant()
	{
		try 
		{
			System.out.println("Launching the browser");
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		}
		
		catch (Exception e) 
			{
				System.out.println("Issue in loginacltenant method"+e);
			}
	}

	public void Signin()
	
	{
		try 
		{
			 username.sendKeys("TA_9_9 ");
	            Thread.sleep(2000);
	            password.sendKeys("GJuh66An"); 
	            Thread.sleep(2000);
	            signin.click();
	            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	            
	            WebElement P=driver.findElement(By.xpath("//*[@class='companyText']"));
	            String S=P.getText();
	            String E="CUSTOMER MANAGEMENT CONSOLE";
	            if(S.contains("E")) 
				{
					System.out.println("Text: " +S+	"  is present.");
				}
				
				else
				{
					System.out.println("Text: " +S+	"  is not present.");
				}
			

			
		}
			
		catch (Exception e) 
		{
			System.out.println("Issue in clickonproduct method"+e); 

		}
	
	}
	

	public void Users()
	
	{
		try 
		{
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			prowatchproduct.click();
			Thread.sleep(2000);
			List<WebElement> options=driver.findElements(By.xpath("//*[@class='menu-submenu ng-tns-c76-2 ng-star-inserted']/div"));
			System.out.println(" CLASS  Elements size " + options.size());
		
		System.out.println(options.get(1));
		options.get(1).click();
		
        List<WebElement>allColumns=driver.findElements(By.xpath("//*[@class='ag-header-viewport']//div/div[contains(@role,'columnheader')]"));
        System.out.println(" Columns " + allColumns.size());
        
        for(WebElement ele:allColumns)
        {
        	String value=ele.getText();
        	System.out.println(ele);
        }
		
		}
				
		
		catch (Exception e) 
		{
			System.out.println("Issue in clickonproduct method"+e); 

		}
	}	
}
	
	