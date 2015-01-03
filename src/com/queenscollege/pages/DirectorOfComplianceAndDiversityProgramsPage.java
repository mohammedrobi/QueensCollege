package com.queenscollege.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.queenscollege.base.PageBase;

public class DirectorOfComplianceAndDiversityProgramsPage extends PageBase{

	@FindBy(name = "MainAboutQC")
	public WebElement aboutQC;
	
	@FindBy(linkText = "Administration")
	public WebElement administration;
	
	@FindBy(linkText = "Office of Compliance and Diversity Programs")
	public WebElement directorOfComplianceAndDiversityPrograms;
	
	@FindBy(xpath = "//*[@id='WebPartWPQ8']/a[1]/img")					 
	public WebElement beInTheKnow;
	
	@FindBy(xpath = "//*[@id='MSO_ContentTable']/tbody/tr/td/center/table/tbody/tr[3]/td/table[2]/tbody/tr[1]/td[1]")
	public WebElement box;
	
	@FindBy(xpath = "//*[@id='MSO_ContentTable']/tbody/tr/td/center/table/tbody/tr[3]/td/table[2]/tbody/tr[1]/td[3]")
	public WebElement box2;
	
	@FindBy(id = "MSOZoneCell_WebPartWPQ3")
	public WebElement relatedLinksBox;
	WebElement refBox;
	
	@FindBy(xpath = "//*[@id='MSO_ContentTable']/tbody/tr/td/center/table/tbody/tr[3]/td/table[1]/tbody/tr/td[2]/div[1]")
	public WebElement actualHeadingPageName;
	
	String expectedHeadingPageName = "Office of Compliance and Diversity Programs";
	
	public void goToDirectorOfComplianceAndDiversityProgramsPage(){
		aboutQC.click();
		administration.click();
		directorOfComplianceAndDiversityPrograms.click();
		verifyPageText(expectedHeadingPageName, actualHeadingPageName.getText());
		// clicking all links under OFFICE INFORMATION on the right
		List <WebElement> links = box2.findElements(By.tagName("a"));			
		for(int i = 0; i < links.size(); i++){
			System.out.println(links.get(i).getText());			
			links.get(i).click();
			if(driver.getWindowHandles().size()>1){
				closePopUpIfPresent();
			}
			goToPreviousPage();
			refBox = box;
			links = box2.findElements(By.tagName("a"));				
		}
		//unalble to handle pop up under RELATED LINKS links
		/*List<WebElement> relatedLinks = relatedLinksBox.findElements(By.tagName("a"));
		for(int i = 0; i < relatedLinks.size(); i++){
			System.out.println(relatedLinks.get(i).getText());
			relatedLinks.get(i).click();
			closeAlertBoxIfPresent();
			if(driver.getWindowHandles().size()>1){
				closeAlertBoxIfPresent();
			}
			goToPreviousPage();
			refBox = box;
			relatedLinksBox.findElements(By.tagName("a"));
		}*/
		
		//beInTheKnow.click();
		
	}
}
