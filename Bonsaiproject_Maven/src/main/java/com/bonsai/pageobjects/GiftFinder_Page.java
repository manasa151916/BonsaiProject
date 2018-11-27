package com.bonsai.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.bonsai.resources.Bonsai_base;

public class GiftFinder_Page extends Bonsai_base{
	
	
		public WebDriver driver;
		
		public GiftFinder_Page(WebDriver driver)
		{
			this.driver=driver;
		}
	
public void getcategory(String item)
{
	Select category=new Select(driver.findElement(By.xpath(".//*[@id='category_id']")));
	category.selectByVisibleText(item);
}
 public void getagegroups(String age)
 {
	 Select agegroup=new Select(driver.findElement(By.xpath(".//*[@id='age_group']")));
	 agegroup.selectByVisibleText(age); 
 }
public WebElement getfindnowbutton()
{
	return driver.findElement(By.xpath("//input[@class=\"button\"][@name=\"submit\"][@value=\"Find it Now\"]"));
	
}
 
}
