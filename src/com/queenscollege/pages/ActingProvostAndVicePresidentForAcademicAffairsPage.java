package com.queenscollege.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.queenscollege.base.PageBase;

public class ActingProvostAndVicePresidentForAcademicAffairsPage extends
		PageBase {

	@FindBy(name = "MainAboutQC")
	public WebElement aboutQC;

	@FindBy(linkText = "Administration")
	public WebElement administration;

	@FindBy(xpath = "//*[@id='MSO_ContentTable']/tbody/tr/td/center/table/tbody/tr[3]/td/table[2]/tbody/tr[1]/td[1]/div")
	public WebElement mainPagelinksBox;

	@FindBy(xpath = "//*[@id='MSO_ContentTable']/tbody/tr/td/center/table/tbody/tr[3]/td/table[2]/tbody/tr[1]/td[3]")
	public WebElement linksOnRightBox;

	WebElement refBox1;
	WebElement refBox2;

	@FindBy(linkText = "Acting Provost and Vice President for Academic Affairs")
	public WebElement actingProvostAndVicePresidentForAcademicAffairs;

	@FindBy(xpath = "//*[@id='MSO_ContentTable']/tbody/tr/td/center/table/tbody/tr[3]/td/table[1]/tbody/tr/td[2]/div[1]")
	public WebElement actualHeadingPageName;

	String expectedHeadingPageName = "Provost and VP for Academic Affairs";

	public void goToActingProvostAndVicePresidentForAcademicAffairs() {
		aboutQC.click();
		administration.click();
		actingProvostAndVicePresidentForAcademicAffairs.click();

		verifyPageText(expectedHeadingPageName, actualHeadingPageName.getText());
		// clicking all links in the MAIN PAGE
		List<WebElement> mainPagelinks = mainPagelinksBox.findElements(By.tagName("a"));
		for (int i = 0; i < mainPagelinks.size(); i++) {
			//System.out.println(mainPagelinks.get(i).getText());
			mainPagelinks.get(i).click();
			if (driver.getWindowHandles().size() > 1) {
				closePopUpIfPresent();
			} else {
				goToPreviousPage();
				refBox1 = mainPagelinksBox;
				mainPagelinks = mainPagelinksBox.findElements(By.tagName("a"));
			}
		}
		// clicking all LINKS on the right side
		List<WebElement> linksOnRight = linksOnRightBox.findElements(By.tagName("a"));
		for (int i = 1; i < linksOnRight.size(); i++) {
			//System.out.println(linksOnRight.get(i).getText());
			linksOnRight.get(i).click();
			goToPreviousPage();
			refBox2 = linksOnRightBox;
			linksOnRight = linksOnRightBox.findElements(By.tagName("a"));
		}
	}
}
