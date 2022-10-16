package com.etisalat.automation.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DriverUtiltity {

	public static void clickButtonByXpath(WebDriver driver, String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		element.click();
	}

	public static void clickButtonByCssSelector(WebDriver driver, String cssSelector) {
		WebElement element = driver.findElement(By.cssSelector(cssSelector));
		element.click();
	}

	public static void sendKeysById(WebDriver driver, String id, String value) {
		WebElement element = driver.findElement(By.id(id));
		element.click();
	}

	public static void sendKeysByXpath(WebDriver driver, String xpath, String value) {
		WebElement valuefilter = driver.findElement(By.xpath(xpath));
		valuefilter.sendKeys(value);

	}

	public static String getElementValueByXpath(WebDriver driver, String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		return element.getText();
	}
}
