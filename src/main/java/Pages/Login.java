package Pages;

import static org.testng.Assert.assertTrue; 

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.util.Assert;

import ApplicationUtilities.Application;
import BaseLibrary.Base;
import ExcelUti.Excel;

public class Login extends Base
{

	String path="D:\\eclipse-workspace\\ACL\\ExcelRead\\ENTR TENNT DETILS.xlsx";
	
	String pathh="D:\\Documents\\logo.png";
	
	
	public Login()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@formcontrolname='userID']")
	private WebElement username;
	
	@FindBy(xpath="//*[@formcontrolname='password']")
	private WebElement password;
	
	@FindBy(xpath="//*[@class='mb-15px']")
	private WebElement signin;
	
	@FindBy(xpath="//*[@routerlink='tenent']")
	private WebElement ADD;
	
	
	@FindBy(xpath="(//*[@class='organization'])[1]")
	private WebElement choosetenant;
	
	@FindBy(xpath="//*[@id='tenType']")
	private WebElement sv;
	
	@FindBy(xpath="//*[@formcontrolname='organizationName']")
	private WebElement organizationname;
	
	@FindBy(xpath="//*[@formcontrolname='UATUrl']")
	private WebElement UATURL;
	
	@FindBy(xpath="//*[@formcontrolname='DevelopmentUrl']")
	private WebElement DEVURL;
	
	@FindBy(xpath="//*[@formcontrolname='TestUrl']")
	private WebElement TESTURL;
	
	
	@FindBy(xpath="//*[@class='mr-2']")
	private WebElement logo;
		
	@FindBy(xpath="(//*[@data-on='Yes'])[1]")
	private WebElement toggle;
	
	
	@FindBy(xpath="//*[@formcontrolname='addressLine1']")
	private WebElement address;
	
	@FindBy(xpath="//*[@formcontrolname='zip']")
	private WebElement pincode ;
	
	@FindBy(xpath="//*[@formcontrolname='city']")
	private WebElement city;
	
	@FindBy(xpath="//*[@formcontrolname='state']")
	private WebElement state ;
	
	@FindBy(xpath="//*[@formcontrolname='country']")
	private WebElement country ;
	
	
	@FindBy(xpath="//*[@formcontrolname='orgWebsite']")
	private WebElement website ;
	
	@FindBy(xpath="(//*[@placeholder='Firstname'])[1]")
	private WebElement firstname;
	
	@FindBy(xpath="(//*[@placeholder='Lastname'])[1]")
	private WebElement lastname ;
	
	@FindBy(xpath="//*[@formcontrolname='contactNumber']")
	private WebElement contact ;
	
	@FindBy(xpath="//*[@formcontrolname='email']")
	private WebElement Email ;
	
	@FindBy(xpath="	(//*[@class='btn btn-primary'])[2]")
	private WebElement svv ;
	
	@FindBy(xpath="//*[@class='btn btn-primary small_btn']")
	private WebElement mvno ;
	
	@FindBy(xpath="(//*[@class='toggle'])[2]")
	private WebElement toggle2 ;
	
	@FindBy(xpath="//*[@class='btn small_btn btn-primary']")
	private WebElement GP ;
	
	@FindBy(xpath="(//*[@class='btn btn-primary'])[3]")
	private WebElement svp ;
	
	@FindBy(xpath="//*[@class='self_service']")
	private WebElement servicemodel ;
	
	@FindBy(xpath="(//*[@class='btn btn-primary'])[4]")
	private WebElement svvv ;
	
	@FindBy(xpath="(//*[@class='btn btn-primary'])[5]")
	private WebElement complete ;
	
	
	
	
	
	public void Signme()
	{
		try 
		{
			System.out.println("Launching the browser");
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
           
            
		}
	
		catch (Exception e) 
			{
				System.out.println("Issue in Signme method"+e);
			}
	}
	
	
	
//	//@Test(dataProvider="credentials")
////	public void VerifyLoginCredentials(String scenario,String usernamee,String passwordd)
////	{
////		try 
////		{
////			 username.sendKeys(usernamee);
////	         password.sendKeys(passwordd); 
////	         signin.click();
////	            
////	       if(scenario.equals("bothcorrect"))
////	       {
////	    	   WebElement PPP=driver.findElement(By.xpath("//*[@class='companyText']"));
////	    	   assertTrue(PPP.isDisplayed(),"Login Not Success");
////	       }
////	       else if(scenario.equals("bothwrong"))
////	       {
////	    	   
////	       }
////	       else if(scenario.equals("correctusername"))
////	       {
////	    	   
////	       }
////	       else if(scenario.equals("correctpwd"))
////	       {
////	    	   
////	       }
////
////      driver.close();
////            
////		}
////	
//		
////	
////	
////	@DataProvider(name="credentials")
////	public HashMap<String,HashMap<String, String>> getdata(){
////		
////		HashMap<String,HashMap<String, String>> obj = new HashMap<>();
////		obj.put("bothcorrect", (HashMap<String, String>) new HashMap<>().put("admin", "admin"));
////		obj.put("bothwrong", (HashMap<String, String>) new HashMap<>().put("adminn", "adminnnn"));
////		obj.put("correctusername", (HashMap<String, String>) new HashMap<>().put("admin", "savage"));
////		obj.put("correctpwd", (HashMap<String, String>) new HashMap<>().put("sinnn", "admin"));
////	return obj;
////	}
	
	
	
	
	public void choosetenant()
	{
		try 
		{
			
			 username.sendKeys("sagar.mehra");
	            Thread.sleep(2000);
	            password.sendKeys("admin"); 
	            Thread.sleep(2000);
	            signin.click();
	            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	            
	          //Verify superadmin page
	           WebElement P=driver.findElement(By.xpath("//*[@class='companyText']"));
	            String S=P.getText();
	            String E="CATS CENTRAL MANAGEMENT CONSOLE";
	            if(S.contains("E")) 
				{
					System.out.println("Text: " +S+	"is present.");
				}
				
				else
				{
					System.out.println("Text: " +S+	"is not present.");
				}
	           
	            Thread.sleep(3000);
	            ADD.click();
	            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

	            
	            
	            
			
			
			choosetenant.click();
			Thread.sleep(3000);
			sv.click();
		}
			
			
		
		catch (Exception e) 
		{
			System.out.println("Issue in choosetenant method"+e); 

		}
		
	}
		public void Entertennatdetails()
		{
			try 
			{
				String status=Excel.GetData(path, 1, 0);
				System.out.println(status);
				if(status.contains("YES"))
				{
					organizationname.sendKeys(Excel.GetData(path, 1, 1));	
					Thread.sleep(2000);

					logo.click();
					Application.uploadFileWithRobot(pathh);
					Thread.sleep(2000);
					UATURL.sendKeys("jikji");
					Thread.sleep(2000);
					DEVURL.sendKeys("asa");
					Thread.sleep(2000);
					TESTURL.sendKeys("fdf");
					
					Thread.sleep(2000);
					toggle.click();
					Thread.sleep(2000);
					
					logo.click();
					
					
					address.sendKeys(Excel.GetData(path, 1, 2));	
					Thread.sleep(2000);
					pincode.sendKeys(Excel.GetData(path, 1, 3));	
					Thread.sleep(8000);
					city.sendKeys(Excel.GetData(path, 1, 4));	
					Thread.sleep(2000);
					state.sendKeys(Excel.GetData(path, 1, 5));	
					Thread.sleep(2000);
					
					country.click();
					Application.SelectDropdown(country, "India");
					
					Thread.sleep(2000);
					website.sendKeys(Excel.GetData(path, 1, 6));	
					Thread.sleep(2000);
					firstname.sendKeys(Excel.GetData(path, 1, 7));	
					Thread.sleep(2000);
					lastname.sendKeys(Excel.GetData(path, 1, 8));	
					Thread.sleep(2000);
					contact.sendKeys(Excel.GetData(path, 1, 9));	
					Thread.sleep(8000);
					Email.sendKeys(Excel.GetData(path, 1, 10));	
					Thread.sleep(2000);
					svv.click();
					Thread.sleep(2000);
					mvno.click();
				    Thread.sleep(5000);


				
				}
				
			}
			
			catch (Exception e) 
			{
				System.out.println("Issue in Entertennatdetails method"+e);

			}
		
		}
			
		public void createtenantadmin()
			
			{
				try 
				{
		           // driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

					toggle2.click();
					Thread.sleep(3000);
					GP.click();
					Thread.sleep(3000);
					svp.click();
					Thread.sleep(2000);
					
				}
					
				catch (Exception e) 
				{
					System.out.println("Issue in createtenantadmin method"+e); 

				}
			
		}
		
		public void chooseservice()
		
		{
			try 
			{
				servicemodel.click();
				Thread.sleep(2000);
				svvv.click();
				Thread.sleep(2000);
				complete.click();	
				
				String t=" sagar.mehra@orkut00.com ";
				if(driver.getPageSource().contains(t)) 
				{
					System.out.println("Text: "+t+	"is present.");
				}
				
				else {
					System.out.println("Text: "+t+	"is not present.");

				}
				
			}
				
				
			catch (Exception e) 
			{
				System.out.println("Issue in chooseservice method"+e); 

			}
		
		}
	
	
	
		
}

