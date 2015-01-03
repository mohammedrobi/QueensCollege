package com.queenscollege.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.queenscollege.base.PageBase;

public class TheArtsPage extends PageBase{

	@FindBy(name = "MainAboutQC")
	public WebElement aboutQC;

	@FindBy(name = "ms-sitetitle")
	public WebElement pageTitle;
	
	@FindBy(linkText = "QC at a Glance")
	public WebElement qcAtAGlace;
	
	@FindBy(linkText = "The Arts")
	public WebElement theArts;
	
	@FindBy(xpath = "//*[@id='MSO_ContentTable']/tbody/tr/td/center/table/tbody/tr[3]/td/table[2]/tbody/tr[1]/td[1]")
	public WebElement mianPageBox;
	
	@FindBy(xpath = "//*[@id='MSOZoneCell_WebPartWPQ4']/table/tbody/tr[2]/td")
	public WebElement relatedLinksBox;
	
	@FindBy(xpath = "//*[@id='MSO_ContentTable']/tbody/tr/td/center/table/tbody/tr[3]/td/table[1]/tbody/tr/td[2]/div[1]")
	public WebElement actualHeadingPageName;
	
	String expectedHeadingPageName = "The Arts";
	
	WebElement boxRef;	
	
	public void goToTheArtsPage(){
		aboutQC.click();
		qcAtAGlace.click();
		theArts.click();
		verifyPageText(expectedHeadingPageName, actualHeadingPageName.getText());
		//clicking all links on the main page
		List<WebElement> mainPageLinks = mianPageBox.findElements(By.tagName("a"));		
		for(int i = 0; i < mainPageLinks.size(); i++){
			//System.out.println(mainPageLinks.get(i).getText());
			mainPageLinks.get(i).click();
			goToPreviousPage();
			boxRef = mianPageBox;
			mainPageLinks = mianPageBox.findElements(By.tagName("a"));			
		}
		//clicking RELATED LINKS links on the right side of the page
		List<WebElement> relatedLinks = relatedLinksBox.findElements(By.tagName("a"));
		for(int i = 0; i < relatedLinks.size(); i++){
			//System.out.println(relatedLinks.get(i).getText());
			relatedLinks.get(i).click();
			goToPreviousPage();
			boxRef = relatedLinksBox;
			relatedLinks = relatedLinksBox.findElements(By.tagName("a"));			
		}		
	}
}
