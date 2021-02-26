package com.functions;

import com.basepage.BasePage;

import io.qameta.allure.Step;
import junit.framework.Assert;

public class GoogleFunc extends BasePage {
	
	
	@Step("Login into Google site, Capture the title and verify that Title contains Google")
	public void titleVerify()
	{
		String title = getTitle();
		Assert.assertEquals(title, "Google");
		System.out.println("Title is "+title);
	
	}

}
