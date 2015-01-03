package com.queenscollege.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.queenscollege.base.PageBase;

public class AboutQCPage extends PageBase {
		
	@FindBy(name = "MainAboutQC")
	public WebElement aboutQC;
	
	@FindBy(xpath = "//*[@id='MSO_ContentTable']/tbody/tr/td/center/table/tbody/tr[3]/td/table[1]/tbody/tr/td[2]/div[2]")
	public WebElement menuBarLinksBox;
	
	@FindBy(xpath = "//*[@id='MSOZoneCell_WebPartWPQ4']/table/tbody/tr[2]/td")
	public WebElement relatedLinksBox;
	
	WebElement refBox;

	@FindBy(name = "ms-sitetitle")
	public WebElement actualPageHeadingname;		
	
	String expectedHeadingPageName = "About Queens College";
	
	public void goToAboutQCPage(){
		aboutQC.click();
		// verifying heading of the page
		verifyPageText(expectedHeadingPageName, actualPageHeadingname.getText());	
		
		// clicking all MENU BAR links
		List <WebElement> menuBarLinks = menuBarLinksBox.findElements(By.tagName("a"));
		for(int i = 2; i < 9; i++){	
			//System.out.println(menuBarLinks.get(i).getText());
			menuBarLinks.get(i).click();
			goToPreviousPage();
			refBox = menuBarLinksBox; 
			menuBarLinks = menuBarLinksBox.findElements(By.tagName("a"));
		} 
		// clicking all RELATED LINKS on the right of the page
		List <WebElement> RelatedLinksBox = relatedLinksBox.findElements(By.tagName("a"));
		for(int i = 0; i < RelatedLinksBox.size();i++){
			//System.out.println(RelatedLinksBox.get(i).getText());
			RelatedLinksBox.get(i).click();
			goToPreviousPage();
			refBox = relatedLinksBox;
			RelatedLinksBox = relatedLinksBox.findElements(By.tagName("a"));
		}
	}	
}

