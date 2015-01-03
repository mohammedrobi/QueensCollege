package com.queenscollege.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Office365Page {

	@FindBy(xpath = "//*[@id='WebPartWPQ2']/div[2]/div[46]/span/a/img")
	public WebElement goToStuEmailPage;
	
	
	public void goToStudentMailPage(){
		goToStuEmailPage.click();
	}
}
