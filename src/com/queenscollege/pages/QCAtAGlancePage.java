package com.queenscollege.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.queenscollege.base.PageBase;

public class QCAtAGlancePage extends PageBase{
	
	@FindBy(name = "MainAboutQC")
	public WebElement aboutQC;
	
	@FindBy(linkText = "QC at a Glance")
	public WebElement qcAtAGlace;	
	
	@FindBy(xpath = "//*[@id='MSO_ContentTable']/tbody/tr/td/center/table/tbody/tr[3]/td/table[2]/tbody/tr[1]/td[1]/div")						
	public WebElement box;
	
	WebElement refBox;
		
	@FindBy(xpath = "//*[@id='MSO_ContentTable']/tbody/tr/td/center/table/tbody/tr[3]/td/table[1]/tbody/tr/td[2]/div[1]")
	public WebElement actuaPageHeadingName;
	
	String expectedPageHeadingName = "QC at a Glance";
	
	public void goToQCAtAGlancePage(){
		aboutQC.click();
		qcAtAGlace.click();	
		verifyPageText(expectedPageHeadingName, actuaPageHeadingName.getText());		
		List<WebElement> linksInsideBox = box.findElements(By.tagName("a"));
		// Clicking all links on the page	
		for(int i = 0; i < linksInsideBox.size(); i++){	
			if(linksInsideBox.get(i).getText().length()>1){			
			//System.out.println(linksInsideBox.get(i).getText());
			linksInsideBox.get(i).click();	
			goToPreviousPage();
			refBox = box;
			linksInsideBox = box.findElements(By.tagName("a"));			
			}
		}
	}
	
	
	
	
	
	
	

}
