package com.etisalat.automation.testcases;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.etisalat.automation.model.TableSearchTestingData;
import com.etisalat.automation.services.ExcelFileReader;
import com.etisalat.automation.util.Constants;
import com.etisalat.automation.util.DriverUtiltity;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableSearchTestCase {

	WebDriver driver;

	@Test(dataProvider = "getTestData")
	public void execute(TableSearchTestingData data) {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to(data.getUrl());

		DriverUtiltity.clickButtonByXpath(driver, Constants.COOKIES_XPATH);
		DriverUtiltity.clickButtonByXpath(driver, Constants.MENU_XPATH);
		DriverUtiltity.clickButtonByCssSelector(driver, Constants.FILTER_CSS_SELECTOR);
		DriverUtiltity.clickButtonByXpath(driver, Constants.SEARCH_XPATH);
		DriverUtiltity.sendKeysByXpath(driver, Constants.VALUE_FILTER_XPATH, data.getValueFilter());

		WebElement element = driver.findElement(By.xpath(Constants.SCROLL_XPATH));
		((JavascriptExecutor) driver).executeScript(Constants.script, element);

		String mayValue = DriverUtiltity.getElementValueByXpath(driver, Constants.MAY_XPATH);

		Assert.assertEquals(mayValue, data.getExpectedResult());

	}

	@BeforeMethod
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

	@DataProvider
	public Iterator<TableSearchTestingData> getTestData() throws Exception, IOException {

		ExcelFileReader excelFileReader = new ExcelFileReader();

		return excelFileReader.getData();
	}
}
