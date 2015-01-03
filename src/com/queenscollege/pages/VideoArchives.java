package com.queenscollege.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.queenscollege.base.PageBase;

public class VideoArchives extends PageBase{
	@FindBy(name = "MainAboutQC")
	public WebElement aboutQC;

	@FindBy(linkText = "QC at a Glance")
	public WebElement qcAtAGlace;

	@FindBy(linkText = "QC Videos")
	public WebElement qcVideos;
	
	@FindBy(xpath= "//*[@id='group0']/td")
	public WebElement videoArchives;
	
	@FindBy(xpath= "//*[@id='MSOZoneCell_WebPartWPQ3']/table")
	public WebElement videosBox;	
	
	@FindBy(xpath = "//*[@id='MSO_ContentTable']/tbody/tr/td/center/table/tbody/tr[3]/td/table[1]/tbody/tr/td[2]/div[1]")
	public WebElement actualPageHeadingName;
	
	String expectedPageheadingName = "Video Archives";
	
	public void goToVideoArchivesPage(){
		aboutQC.click();
		qcAtAGlace.click();
		qcVideos.click();
		hoverOver(qcVideos);
		videoArchives.click();
		verifyPageText(expectedPageheadingName, actualPageHeadingName.getText());
		// need to work on video part on the right side of the page
		
		List<WebElement> videos = videosBox.findElements(By.tagName("a"));
		for(int i = 0; i < videos.size(); i++){
			System.out.println(videos.get(i).getText());
			//videos.get(i).click();
		}
	}
}
