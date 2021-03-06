package com.queenscollege.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.queenscollege.base.PageBase;

public class VicePresidentForStudentAffairsPage extends PageBase{

	@FindBy(name = "MainAboutQC")
	public WebElement aboutQC;
	
	@FindBy(linkText = "Administration")
	public WebElement administration;
	
	@FindBy(linkText = "Vice President for Student Affairs")
	public WebElement vicePresidentForStudentAffairs ;
	
	@FindBy(xpath = "//*[@id='MSOZoneCell_WebPartWPQ3']/table/tbody/tr[2]/td")
	public WebElement relatedLinksBox;
	
	WebElement refBox;
	
	@FindBy(xpath = "//*[@id='MSO_ContentTable']/tbody/tr/td/center/table/tbody/tr[3]/td/table[1]/tbody/tr/td[2]/div[1]")
	public WebElement actualHeadingPageName;
	
	String expectedHeadingPageName = "Vice President for Student Affairs";
	
	public void goToVicePresidentForStudentAffairsPage(){
		aboutQC.click();
		administration.click();
		vicePresidentForStudentAffairs.click();
		verifyPageText(expectedHeadingPageName, actualHeadingPageName.getText());
	
		List <WebElement> relatedLinks = relatedLinksBox.findElements(By.tagName("a"));
	
		for(int i = 0; i < relatedLinks.size(); i++){	
			//System.out.println(relatedLinks.get(i).getText());
			relatedLinks.get(i).click();
			goToPreviousPage();
			refBox = relatedLinksBox;
			relatedLinks = relatedLinksBox.findElements(By.tagName("a"));
		}
	}
}
