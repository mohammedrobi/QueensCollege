package com.queenscollege.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.queenscollege.base.PageBase;

public class AdministrationPage extends PageBase {
	
	@FindBy(name = "MainAboutQC")
	public WebElement aboutQC;
	
	@FindBy(linkText = "Administration")
	public WebElement administration;
	
	@FindBy(xpath = "//*[@id='MSO_ContentTable']/tbody/tr/td/center/table/tbody/tr[3]/td/table[1]/tbody/tr/td[2]/div[1]")
	public WebElement actualHeadingPageName;
	
	@FindBy(xpath = "//*[@id='MSO_ContentTable']/tbody/tr/td/center/table/tbody/tr[3]/td/table[2]/tbody/tr[1]/td[1]")
	public WebElement linksInBox;
	
	WebElement refBox;
	
	String expectedHeadingPageName = "Administration";
	

	
	public void goToAdministrationPage(){
		aboutQC.click();
		administration.click();
		verifyPageText(expectedHeadingPageName, actualHeadingPageName.getText());
		// clicking all links on the page
		List<WebElement> links = linksInBox.findElements(By.tagName("a"));		
		for(int i = 0; i < links.size(); i++){
			//System.out.println(links.get(i).getText());
			links.get(i).click();
			goToPreviousPage();
			refBox = linksInBox;
			links = linksInBox.findElements(By.tagName("a"));			
		}	
	}
}
