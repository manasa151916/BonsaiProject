package com.bonsai.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Home_Page {

//WebDriver driver;
	public WebDriver driver;

public Home_Page(WebDriver driver)
{
this.driver=driver;
}

By MyAccount=By.xpath("//a[@href='http://www.bonsaii.in/index.php?route=account/account']");
By Login=By.xpath("//a[@href='http://www.bonsaii.in/index.php?route=account/login']");
By CreateAccount=By.xpath("//a[@href='http://www.bonsaii.in/index.php?route=account/register']");

public WebElement Selectmyaccount()
{
	return driver.findElement(MyAccount);

}

public WebElement Selectlogin()
{
	return driver.findElement(Login);

}

public WebElement Selectcreateaccount()
{
	return driver.findElement(CreateAccount);

}


	
}
