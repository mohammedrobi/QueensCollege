package com.queenscollege.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.queenscollege.base.PageBase;

public class PhotoGalleryPage extends PageBase {
	
	@FindBy(name = "MainAboutQC")
	public WebElement aboutQC;
	
	@FindBy(linkText = "Photo Gallery")
	public WebElement photoGallery;
	
	@FindBy(linkText = "QC at a Glance")
	public WebElement qcAtAGlace;
	
	@FindBy(xpath = "//*[@id='MSO_ContentTable']/tbody/tr/td/center/table/tbody/tr[3]/td/table[1]/tbody/tr/td[2]/div[1]")
	public WebElement actualPageHeadingName;
	
	String expectedPageHeadingName ="Photo Gallery";
	
	public void goToPhotoGalleryPage(){
		aboutQC.click();
		qcAtAGlace.click();
		photoGallery.click();
		verifyPageText(expectedPageHeadingName, actualPageHeadingName.getText());
		
	}
}
