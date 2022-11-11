package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLibrary.Base;
import Pages.Login;
import Pages.Userstab;

public class UserstabTest extends Base
{
	Userstab ob=null;
	
	@BeforeTest
	public void getlaunch() 
	{
		
		try 
		{
			getlaunch("http://10.0.1.33:8086/#/login");
			ob=new Userstab();
			
		
		} 
		catch (Exception e)
		{
			System.out.println("Issue in getlaunch method"+e);
		}
	}
	
	@Test(priority=0,enabled=true)
	public void getSignin() 
	{
		
		try 
		{
			ob.Signin();
		
		} 
		catch (Exception e)
		{
			System.out.println("Issue in getSignin method"+e);
		}
	}
	
	@Test(priority=1,enabled=true)
	public void getUsers() 
	{
		
		try 
		{
			ob.Users();
		
		} 
		catch (Exception e)
		{
			System.out.println("Issue in getUsers method"+e);
		}
	}
}
