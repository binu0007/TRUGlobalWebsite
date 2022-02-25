package com.TRUGlobal.genericUtility;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class BaseClass 
{
	public static WebDriver driver;
//	public javaUtility JLib=new javaUtility();
	public webDriverUtility wLib=new webDriverUtility();
	public void configBC()
	{
		System.out.println("*************Launch The Browser************");
		driver=new ChromeDriver();
	//	wLib.waitUntilPageLoad();
	}
	
	@AfterClass
	public void configAC()
	{
		System.out.println("***********Close The Browser********************");
	}
	@AfterSuite
	public void configAS()
	{
		System.out.println("**************Close The DB**********************");
	}
	
	

}
