package com.queenscollege.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.queenscollege.base.PageBase;

public class WebCamPage extends PageBase{

	@FindBy(name = "MainAboutQC")
	public WebElement aboutQC;
	
	@FindBy(linkText = "QC at a Glance")
	public WebElement qcAtAGlace;
	
	@FindBy(linkText = "Web Cam")
	public WebElement webCam;
	
	@FindBy(xpath = "//*[@id='MSO_ContentTable']/tbody/tr/td/center/table/tbody/tr[3]/td/table[2]")
	public WebElement box;
	
	WebElement boxRef;
	
	@FindBy(xpath = "//*[@id='MSO_ContentTable']/tbody/tr/td/center/table/tbody/tr[3]/td/table[1]/tbody/tr/td[2]/div[1]")
	public WebElement actualPageHeadingName;	
	
	String expectedPageHeadingName = "Web Cam";
	
	
	public void goToWebCamPage() throws InterruptedException{
		aboutQC.click();
		qcAtAGlace.click();
		webCam.click();
		verifyPageText(expectedPageHeadingName, actualPageHeadingName.getText());
		
		List <WebElement> linksInBox = box.findElements(By.tagName("a"));
		
		for(int i = 0; i < linksInBox.size(); i++){
			System.out.println(linksInBox.get(i).getText());
			linksInBox.get(i).click();
			Thread.sleep(3000);
			goToPreviousPage();
			boxRef = box;
			linksInBox = box.findElements(By.tagName("a"));
		}			
	}
}
