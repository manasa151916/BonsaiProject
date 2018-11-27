package com.bonsai.resources;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.bonsai.pageobjects.Login_Page;
import com.bonsai.pageobjects.AccountCreation_Page;
import com.bonsai.pageobjects.GiftFinder_Page;
import com.bonsai.pageobjects.Home_Page;

public class Bonsai_base {
	
	public WebDriver driver;
	public Properties prop;
	
public WebDriver invokebrowser() throws IOException
{
	prop=new Properties();
	FileInputStream fis=new FileInputStream("C:\\Users\\v-manasv\\Bonsaiproject\\src\\main\\java\\com\\bonsai\\resources\\data.properties");
	prop.load(fis);
	String BrowserName=prop.getProperty("browser");
	
	if(BrowserName.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","C:/BrowserDrivers/chromedriver.exe");
		 driver=new ChromeDriver();
	}
	else if (BrowserName.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver","C:/BrowserDrivers/geckodriver.exe");
		 driver = new FirefoxDriver();
	}
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	return driver;

}

public Home_Page hp;
public Login_Page lp;
public AccountCreation_Page ac;
public utilities ut;
public GiftFinder_Page gp;

public WebDriver initializepages()
{
	lp =new Login_Page(driver);
	hp = new Home_Page(driver);
	ac=new AccountCreation_Page(driver);
	ut=new utilities(driver);
	gp=new GiftFinder_Page(driver);
	
	return driver;


}
}
