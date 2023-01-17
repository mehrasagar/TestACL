package Test;

import org.testng.annotations.Test;

import BaseLibrary.Base;
import Pages.Productonboard;   
public class ProductonboardTest extends Base
{

	Productonboard obb = new Productonboard();
	
	
	@Test(priority=0,enabled=true)
	public void getcustomer()
	{
		
		try 
		{
	
			obb.customer();
	
		} 
		catch (Exception e)
		{
			System.out.println("Issue in getcustomer method"+e);
		}
	}
	
	@Test(priority=1,enabled=true)
	public void getproductonboard()
	{
		
		try 
		{
	
			obb.productonboard();
	
		} 
		catch (Exception e)
		{
			System.out.println("Issue in getproductonboard method"+e);
		}
	}
	
	

}


