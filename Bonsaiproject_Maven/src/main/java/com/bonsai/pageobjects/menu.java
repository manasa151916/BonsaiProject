package com.bonsai.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.bonsai.resources.Bonsai_base;

public class menu extends Bonsai_base{
	
	public WebDriver driver;
	
	public  menu(WebDriver driver)
	{
		this.driver=driver;
	}



public void getmenuselection(String menuitem)
{
	WebElement header=Grid.driver().findElement(By.xpath(".//*[@class='visible-desktop']"));
	header.findElement(arg0);
	

}

}