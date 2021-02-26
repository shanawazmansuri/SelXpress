package com.tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.basepage.BasePage;
import com.functions.GoogleFunc;
import com.utilities.AllureReportListener;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Listeners(AllureReportListener.class)
public class GoogleTest extends BasePage {
	GoogleFunc gf = new GoogleFunc();

	@Test
	@Severity(SeverityLevel.NORMAL)
	@Description("TC Description: To verify google title")
	@Story("User Story 1")
	@Feature("Title Test")
	@Epic("001")
	public void test1()
	{
		gf.titleVerify();
	}

}
