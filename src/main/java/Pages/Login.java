package Pages;


import java.util.concurrent.TimeUnit; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ApplicationUtilities.Application;
import BaseLibrary.Base;
import ExcelUti.Excel;
import Propertyfile.Proeprtyfile;
 
public class Login extends Base
{

	String path="D:\\eclipse-workspace\\TestACL\\ExcelRead\\enter tenant details.xlsx";
	String path2="D:\\eclipse-workspace\\TestACL\\ExcelRead\\Tenant admin details.xlsx";
	
	String pathh="D:\\Documents\\logo.png";
	
	
	public Login()
	{
		
		PageFactory.initElements(driver, this);
	}	
	
	@FindBy(xpath="//*[@formcontrolname='userID']")
	private WebElement username;
	
	@FindBy(xpath="//*[@formcontrolname='password']")
	private WebElement pwd;
	
	
	
	@FindBy(xpath="//*[contains(text(),'Sign in')]")
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
	
	@FindBy(xpath="(//*[@class='btn btn-primary'])[5]")
	private WebElement sa ;
	
	@FindBy(xpath="//*[@formgroupname='tenantAdminName']/div/div/div/input[@placeholder='Firstname']")
	private WebElement Tenantfirstname ;
	
	@FindBy(xpath="//*[@formgroupname='tenantAdminName']/div/div/div/input[@placeholder='Lastname']")
	private WebElement Tenantlastname ;
	
	@FindBy(xpath="(//*[@formcontrolname='email'])[2]")
	private WebElement Tenantemail ;
	
	@FindBy(xpath="(//*[@class='btn btn-primary'])[3]")
	private WebElement svv3 ;

	@FindBy(xpath="//*[contains(text(),'Sign in')]")
	private WebElement AD ;
	
	@FindBy(xpath="//*[@class='catsLogo ng-star-inserted']")
	private WebElement logoo ;
	
	@FindBy(xpath="//*[contains(text(),'iProcess')]")
	private WebElement eleee ;

	
	
	public void Signme()
	{
		try 
		{
			System.out.println("Launching the browser");
			Application.waitforanelement(AD);
			String Tool=Proeprtyfile.Getpropertyvalue("url");
			getlaunch(Tool);
			
			
		}
	
		catch (Exception e) 
			{
				System.out.println("Issue in Signme method"+e);
				
			}
	}
	
	
	
	
	public void choosetenant()
	{
		try 
		{
			
		
            username.sendKeys("Sagar.Mehra");
			Thread.sleep(2000);
			pwd.sendKeys("Admin@2022");
	        Thread.sleep(2000);
	        signin.click();
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);			

	            
	          //Verify Userconsole page
               Boolean Display =driver.findElement(By.xpath("//*[@class='companyText']")).isDisplayed();
	           System.out.println(Display);
	           driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);			

	            
	           String Selectproduct="iProcess";	            
				driver.findElement(By.xpath("//h4[contains(text(),"+Selectproduct+")]/..//../..//button")).click();
				
			
              
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
	            ADD.click();
	            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);			
		     	choosetenant.click();
		    	Thread.sleep(3000);
	     		sv.click();
	            Thread.sleep(3000);

		
			String status=Excel.GetData(path, 1, 0);
				//System.out.println(status);
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
					
//					WebElement numberField=driver.findElement(By.xpath("//*[@formcontrolname='contactNumber']"));
//					numberField.sendKeys("AASDFGfgf");
//					String typedvalue = numberField.getAttribute("value");
//					int size = typedvalue.length();
//					 
//					if (size == 0)
//					{
//						System.out.println("Alphabets are not allowed");
//					}
//					else
//					{
//						System.out.println("No Restriction");
//						
//					}
			
					
					contact.sendKeys(Excel.GetData(path, 1, 9));	
					Thread.sleep(8000);
					Email.sendKeys(Excel.GetData(path, 1, 10));	
					Thread.sleep(2000);
					svv.click();
					Thread.sleep(2000);
					
				
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
		
					Tenantfirstname.sendKeys("Sagar");
					Thread.sleep(3000);
					Tenantlastname.sendKeys("Mehra");
					Thread.sleep(3000);
					Tenantemail.sendKeys("sagar.mehra@in2ittech.com");
					Thread.sleep(2000);
					GP.click();
		            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);			
					svv3.click();
					
				
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
				
				String t= "Congratulation!"
						+ "The Organization has been successfully created."
						+ "An email has been sent to the tenant admin at"
						+ "sagar.mehra@in2ittech.com";
				if(driver.getPageSource().contains(t)) 
				{
					System.out.println("Text: "+t+	"is present.");
				}
				
				else
				{
					System.out.println("Text: "+t+	" is not present.");

				}
				
			}
				
				
			catch (Exception e) 
			{
				System.out.println("Issue in chooseservice method"+e); 

			}
		
		}
	
	
	
		
}

