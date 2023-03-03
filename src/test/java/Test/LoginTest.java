package Test;

import org.testng.annotations.BeforeTest; 
import org.testng.annotations.Test;  

import BaseLibrary.Base;
import Pages.Login;
 

public class LoginTest extends Base

{
		
	 Login ob=new Login();
		
		@BeforeTest
		public void getlaunch() 
		{
			
			try 
			{
				getlaunch("http://10.0.1.104:8084/#/login");

				
	
			} 
			catch (Exception e)
			{
				System.out.println("Issue in getlaunch method"+e);
			}
		}
	
		@Test(priority=1,enabled=true)
		public void getchoosetenant() 
		{
			
			try 
			{
				ob.choosetenant();
			
			} 
			catch (Exception e)
			{
				System.out.println("Issue in getchoosetenant method"+e);
			}
		}
	
		
		@Test(priority=2,enabled=false)
		public void getEntertennatdetails() 
		{
			
			try 
			{
				ob.Entertennatdetails();
			
			} 
			catch (Exception e)
			{
				System.out.println("Issue in getEntertennatdetails method"+e);
			}
		}
		

		@Test(priority=3,enabled=false)
		public void getcreatetenantadmin() 
		{
			
			try 
			{
				ob.createtenantadmin();
			
			} 
			catch (Exception e)
			{
				System.out.println("Issue in getcreatetenantadmin method"+e);
			}
			
		
		}
		
		@Test(priority=4,enabled=false)
		public void getchooseservice() 
		{
			
			try 
			{
				ob.chooseservice();
			
			} 
			catch (Exception e)
			{
				System.out.println("Issue in getchooseservice method"+e);
			}
		}
		
		
		
		
		
		
		
		
		
	
}
