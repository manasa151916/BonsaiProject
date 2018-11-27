package com.bonsai.app;

import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.bonsai.resources.Bonsai_base;

public class test_createaccount extends Bonsai_base{
	

	@BeforeTest
	
	public void setup() throws IOException
	{
		driver=invokebrowser();
		driver.get(prop.getProperty("url"));
		System.out.println("url launched");
	}
	@Test
	
	public void homepagenavigation() throws IOException
	{
	driver = initializepages();
	hp.Selectcreateaccount().click();
	System.out.println("create account link is clicked");
	ac.getfirstname().sendKeys("test");
	ac.getlastname().sendKeys("test");
	ac.getemail().sendKeys("addintesting@gmail.com");
	ac.gettelephone().sendKeys("4657898134");
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("scroll(0,800)");
	ac.getaddress1().sendKeys("hno125");
	ac.getcity().sendKeys("Banglore");
	ac.getpostalcode().sendKeys("4857854");
	ac.getcountry("India");
	ac.getstate("Karnataka");
	ac.getpassword().sendKeys("Cognizant");
	ac.getpasswordconfirm().sendKeys("Cognizant");
	jse.executeScript("scroll(900,1200)");
	ac.getcheckbox().click();
	ac.getcontinuebutton().click();
	
	}
	
@AfterTest
public void teardown()
{
driver.quit();	
}
	
	
}
