package com.bonsai.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.bonsai.resources.Bonsai_base;

public class Login_Page extends Bonsai_base{

	WebDriver driver;
	
	public Login_Page(WebDriver driver)
	{
		this.driver=driver;
	} 
	
	//By Email=By.xpath("//input[@name='email']");
	//By Password=By.xpath("//input[@name='password']");
	//By Loginbutton=By.xpath("//input[@class='button'][@value='Login']");
	
	public WebElement getemail()
	{
		return driver.findElement(By.xpath("//input[@name='email']"));
	}
	
	public WebElement getpassword()
	{
		return driver.findElement(By.xpath("//input[@name='password']"));
	}
	public WebElement getloginbutton()
	{
		return driver.findElement(By.xpath("//input[@class='button'][@value='Login']"));
	}
	
	
}
