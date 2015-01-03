package com.queenscollege.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.queenscollege.base.PageBase;

public class QCVideosPage extends PageBase{

	@FindBy(name = "MainAboutQC")
	public WebElement aboutQC;
		
	@FindBy(linkText = "QC at a Glance")
	public WebElement qcAtAGlace;
	
	@FindBy(linkText = "QC Videos")
	public WebElement qcVideos;	
	
	@FindBy(xpath = "//*[@id='zz1_TopNavigationMenun2']/table/tbody/tr/td[1]/a")
	public WebElement qcVideosX;
	
	   
	@FindBy(xpath= "//*[@id='MSO_ContentTable']/tbody/tr/td/center/table/tbody/tr[3]/td/table[2]/tbody/tr/td[1]")
	public WebElement videoArchives;
	
	@FindBy(xpath = "//*[@id='WebPartWPQ7']/a/span")
	public WebElement downloadTheSFreeVersionHereLink;
	
	@FindBy(xpath = "//*[@id='WebPartWPQ5']/table")
	public WebElement box;
	
	@FindBy(linkText = "Video Production")
	public WebElement videoProductoinLink;
	
	@FindBy(linkText = "Queens College Commencement Video")
	public WebElement queensCollegeCommencementVideoLink;
	
	WebElement refBox;
	
	@FindBy(xpath = "//*[@id='MSO_ContentTable']/tbody/tr/td/center/table/tbody/tr[3]/td/table[1]/tbody/tr/td[2]/div[1]")
	public WebElement actualPageHeadingName;	
	
	String expectedPageHeadingName = "QC Videos";
	
	public void goToQCVideosPage(){
		aboutQC.click();
		qcAtAGlace.click();
		qcVideos.click();
		verifyPageText(expectedPageHeadingName, actualPageHeadingName.getText());
		downloadTheSFreeVersionHereLink.click();
		goToPreviousPage();		
		// clicking links under the Video
		List<WebElement> linksUnderVideo = box.findElements(By.tagName("a"));		
		for(int i = 0; i <= 6; i++){
			//System.out.println(linksUnderVideo.get(i).getText());
			linksUnderVideo.get(i).click();			
			goToPreviousPage();
			refBox = box;
			linksUnderVideo = box.findElements(By.tagName("a"));			
		}	
		// clicking RELATED LINKS on the right
		videoProductoinLink.click();
		goToPreviousPage();
		queensCollegeCommencementVideoLink.click();
		goToPreviousPage();
		// mouse over from the top menubar QC VIDEOS to VIDEO ARCHIVES
		hoverOver(qcVideosX);
		videoArchives.click();
	}
}