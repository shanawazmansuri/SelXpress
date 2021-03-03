package com.functions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.basepage.BasePage;
import com.utilities.ExtentReportConf;

import io.qameta.allure.Step;
import junit.framework.Assert;

public class GoogleFunc extends BasePage {
	
	
	@Step("Login into Google site, Capture the title and verify that Title contains Google")
	public void titleVerify()
	{
		String title = getTitle();
		ExtentReportConf.reportPassLog("Captured title as: "+title);
		Assert.assertEquals(title, "Google");
		System.out.println("Title is "+title);
		ExtentReportConf.reportPassLog("Asserted title as: "+title);
	
	}
	
	@Step("Searching Text as Automation in Google")
	public void searchTest()
	{
		driver.findElement(By.name("q")).sendKeys("Automation");
		ExtentReportConf.reportPassLog("Entered text as Automation");
		driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
		ExtentReportConf.reportPassLog("Clicked on Enter button");
		
	}

}
