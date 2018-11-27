package com.bonsai.resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class utilities {
	public WebDriver driver;
	
	public utilities(WebDriver driver)
	{
		this.driver=driver;
	}

	public WebElement Homebutton()
	{
		return driver.findElement(By.xpath("//a[@href=\"http://www.bonsaii.in/index.php?route=common/home\"]"));
	}
}
