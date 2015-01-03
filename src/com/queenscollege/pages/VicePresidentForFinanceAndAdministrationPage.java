package com.queenscollege.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.queenscollege.base.PageBase;

public class VicePresidentForFinanceAndAdministrationPage extends PageBase{

	@FindBy(name = "MainAboutQC")
	public WebElement aboutQC;
	
	@FindBy(linkText = "Administration")
	public WebElement administration;
	
	@FindBy(linkText = "Vice President for Finance and Administration")
	public WebElement vicePresidentForFinanceAndAdministrationPage;
	
	@FindBy(xpath = "//*[@id='ctl00_PlaceHolderMain_RichHtmlField1__ControlWrapper_RichHtmlField']/span/p")
	public WebElement box;
	
	WebElement refBox;
	
	@FindBy(xpath = "//*[@id='MSO_ContentTable']/tbody/tr/td/center/table/tbody/tr[3]/td/table[1]/tbody/tr/td[2]/div[1]")
	public WebElement actualHeadingPageName;
	
	String expectedHeadingPageName = "Vice President for Finance and Administration";
	
	public void goToVicePresidentForFinanceAndAdministrationPage(){
		aboutQC.click();
		administration.click();
		vicePresidentForFinanceAndAdministrationPage.click();
		verifyPageText(expectedHeadingPageName, actualHeadingPageName.getText());
		// clicking links on the main page
		List <WebElement> linksInBox = box.findElements(By.tagName("a"));		
		for(int i = 0; i < linksInBox.size(); i++){
			//System.out.println(linksInBox.get(i).getText());
			linksInBox.get(i).click();
			goToPreviousPage();
			refBox = box;
			linksInBox = box.findElements(By.tagName("a"));
			
			
		}
	}
}
