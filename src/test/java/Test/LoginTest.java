package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



import BaseLibrary.Base;
import Pages.Login;

public class LoginTest extends Base

{
	

	 Login ob=null;
		
		@BeforeTest
		public void getlaunch() 
		{
			
			try 
			{
				getlaunch("http://10.0.1.33:8086/#/login");
				ob=new Login();
				
			
			} 
			catch (Exception e)
			{
				System.out.println("Issue in getlaunch method"+e);
			}
		}
		
//		@Test(priority=0,enabled=true)
//		public void getVerifyLoginCredentials() 
//		{
//			
//			try 
//			{
//				ob.VerifyLoginCredentials(ob.getdata().toString(),ob.getdata().toString(),ob.getdata().toString());
//			
//			} 
//			catch (Exception e)
//			{
//				System.out.println("Issue in getVerifyLoginCredentials method"+e);
//			}
//		}
		
		
		@Test(priority=0,enabled=true)
		public void getchoosetenant() 
		{
			
			try 
			{
				ob.choosetenant();
			
			} 
			catch (Exception e)
			{
				System.out.println("Issue in getlaunch method"+e);
			}
		}
		
		@Test(priority=1,enabled=true)
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
		

		@Test(priority=2,enabled=true)
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
		
		@Test(priority=5,enabled=true)
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
