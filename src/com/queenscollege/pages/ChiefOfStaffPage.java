package com.queenscollege.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.queenscollege.base.PageBase;

public class ChiefOfStaffPage extends PageBase {
	
	@FindBy(name = "MainAboutQC")
	public WebElement aboutQC;
	
	@FindBy(linkText = "Administration")
	public WebElement administration;
	
	@FindBy(linkText = "Chief of Staff")
	public WebElement chiefOfStaff;
	
	@FindBy(xpath = "//*[@id='WebPartTitleWPQ2']/h3/nobr/span[1]")
	public WebElement actualHeadingPageName;
	
	String expectedHeadingPageName = "Chief of Staff";
	
	public void goToChiefOfStaffPage(){
		aboutQC.click();
		administration.click();
		chiefOfStaff.click();
		verifyPageText(expectedHeadingPageName, actualHeadingPageName.getText());		
	}
}
