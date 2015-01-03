package com.queenscollege.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.queenscollege.base.PageBase;

public class GeneralCounselAndSpecialCounselForLaborManagementRelationsPage extends PageBase {

	@FindBy(name = "MainAboutQC")
	public WebElement aboutQC;
	
	@FindBy(linkText = "Administration")
	public WebElement administration;
	
	@FindBy(linkText = "General Counsel and Special Counsel for Labor/Management Relations")
	public WebElement generalCounselAndSpecialCounselForLaborManagementRelationsPage;
	
	@FindBy(xpath = "//*[@id='MSO_ContentTable']/tbody/tr/td/center/table/tbody/tr[3]/td/table[2]")
	                 
	public WebElement linksInBox;
	
	WebElement refBox;
	
	@FindBy(xpath = "//*[@id='MSO_ContentTable']/tbody/tr/td/center/table/tbody/tr[3]/td/table[1]/tbody/tr/td[2]/div[1]")
	public WebElement actualHeadingPageName;
	
	String expectedHeadingPageName = "General Counsel and Special Counsel for Labor/Management Relations";
	
	public void goToGeneralCounselAndSpecialCounselForLaborManagementRelationsPage(){
		aboutQC.click();
		administration.click();
		generalCounselAndSpecialCounselForLaborManagementRelationsPage.click();
		verifyPageText(expectedHeadingPageName, actualHeadingPageName.getText());		
			
		// Clicking links on this page
		List <WebElement> links = linksInBox.findElements(By.tagName("a"));
		// need to fix PopUp for clicking inside forloop
		for(int i = 5; i < links.size(); i++){
			System.out.println(links.get(i).getText());
			links.get(i).click();			
			goToPreviousPage();
			refBox = linksInBox; 
			links = linksInBox.findElements(By.tagName("a"));			
		}
	}
}
