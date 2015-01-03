package com.queenscollege.base;

import java.util.Iterator;
import java.util.Set;

import junit.framework.Assert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

@SuppressWarnings("deprecation")
public class PageBase extends TestBase {

	public void goToPreviousPage() {
		driver.navigate().back();
	}

	public void getCurrentUrl() {
		driver.getCurrentUrl();		
		System.out.println(driver.getCurrentUrl());
	}

	public void hoverOver(WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();
	}

	public void verifyPageText(String expected, String actual) {		
		Assert.assertEquals(expected, actual);	
		System.out.println("Page Heading: "+actual);
	}

	public void getTitle() {
		driver.getTitle();
	}

	public void closePopUpIfPresent() {
		Set<String> winId = driver.getWindowHandles();		
		Iterator<String> it = winId.iterator();
		String mainWindow = it.next();
		String popUpWindow = it.next();
		driver.switchTo().window(popUpWindow);
		driver.close();
		driver.switchTo().window(mainWindow);
		}
	public void closeAlertBoxIfPresent() {
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		//alt.dismiss();
		}
	}
