package com.bonsai.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AccountCreation_Page {

	public WebDriver driver;
	
	public AccountCreation_Page(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
	
	By firstname=By.xpath("//input[@name='firstname']");
	By lastname =By.xpath("//input[@name='lastname']");
	By email=By.xpath("//input[@name='email']");
	By telephone=By.xpath("//input[@name='telephone']");
	By address1 =By.xpath("//input[@name='address_1']");
	By city=By.xpath("//input[@name='city']");
	By password=By.xpath("//input[@name='password']");
	By passwordconfirm=By.xpath("//input[@name='confirm']");
	By checkbox=By.xpath("//input[@type='checkbox'][@name='agree']");
	By continuebutton=By.xpath("//input[@class='button'][@value='Continue']");
	
	public WebElement getfirstname()
	{
		return driver.findElement(firstname);
	}
	
	public WebElement getlastname()
	{
		return driver.findElement(lastname);
	}
	public WebElement getemail()
	{
		return driver.findElement(email);
	}
	public WebElement gettelephone()
	{
		return driver.findElement(telephone);
	}
	public WebElement getaddress1()
	{
		return driver.findElement(address1);
	}
	public WebElement getcity()
	{
		return driver.findElement(city);
	}
	
	
	public void getcountry(String country)
	{
		
		Select s=new Select(driver.findElement(By.xpath(".//*[@id='content']/form/div[2]/table/tbody/tr[9]/td[2]/select")));
		s.selectByVisibleText(country);
		
	}
	public WebElement getpostalcode()
	{
		return driver.findElement(By.xpath("//input[@name='postcode']"));
	}
	
	public void getstate(String State)
	{
		Select s2=new Select(driver.findElement(By.xpath(".//*[@id='content']/form/div[2]/table/tbody/tr[10]/td[2]/select")));
		s2.selectByVisibleText(State);
	}
	public WebElement getpassword()
	{
		return driver.findElement(password);
	}
	public WebElement getpasswordconfirm()
	{
		return driver.findElement(passwordconfirm);
	}
	public WebElement getcheckbox()
	{
		return driver.findElement(checkbox);
	}
	public WebElement getcontinuebutton()
	{
		return driver.findElement(continuebutton);
	}
}
	

