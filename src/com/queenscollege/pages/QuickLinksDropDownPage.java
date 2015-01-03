package com.queenscollege.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.queenscollege.base.PageBase;

public class QuickLinksDropDownPage extends PageBase {

	@FindBy(xpath = "//*[@id='findTabs']/a[1]")	
	public WebElement quickLinks;	

	@FindBy(xpath = "//*[@id='d3']/ul")
	public WebElement leftSideLinksBox;	

	@FindBy(xpath = "//*[@id='d4']/ul")
	public WebElement rightSideLinksBox;
	
	WebElement refBox;
	
	public void goToQuickLinks() {
		quickLinks.click();
		// Clicking all left box links
		List<WebElement> leftBoxLinks = leftSideLinksBox.findElements(By.tagName("a"));		
		for (int i = 0; i < leftBoxLinks.size(); i++) {
			//System.out.println(leftBoxLinks.get(i).getText());
			leftBoxLinks.get(i).click();
			goToPreviousPage();
			quickLinks.click();
			refBox = leftSideLinksBox;
			leftBoxLinks = leftSideLinksBox.findElements(By.tagName("a"));
		}
		
		// Clicking all right box links
		List<WebElement> rightBoxLinks = rightSideLinksBox.findElements(By.tagName("a"));		
		for (int i = 0; i < rightBoxLinks.size(); i++) {
			//System.out.println(rightBoxLinks.get(i).getText());
			rightBoxLinks.get(i).click();
			goToPreviousPage();
			quickLinks.click();
			refBox = rightSideLinksBox;
			rightBoxLinks = rightSideLinksBox.findElements(By.tagName("a"));
		}
		quickLinks.click();
	}
}