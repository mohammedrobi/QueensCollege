package com.queenscollege.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.queenscollege.base.PageBase;

public class StudentWebMailAccessPage extends PageBase {
	
	@FindBy(linkText ="Login to...")
	public WebElement loginToLink;
	
	@FindBy(linkText = "Student - Lotus Notes")
	public WebElement emailStudentNotesLink;
	
	@FindBy(xpath = "//*[@id='WebPartWPQ2']/div[2]/div[22]/span/a/img")
	                 
	public WebElement lotusNotes;
	
	@FindBy(name = "Username")
	public WebElement usernameTextBoxField;
	
	@FindBy(name = "Password")
	public WebElement passwordTextBoxField;

	@FindBy(xpath = "html/body/form/table/tbody/tr[2]/td/div/table/tbody/tr[5]/td[3]/input")
	public WebElement signinButton;
	
	public void doLogin(String username, String password){
		loginToLink.click();
		emailStudentNotesLink.click();
		lotusNotes.click();
		
		Set<String> winId = driver.getWindowHandles();
		Iterator<String> it = winId.iterator();
		String mainWin = it.next();
		String popUpWin = it.next();
		// navigating to student email page and entering data
		driver.switchTo().window(popUpWin);		
		usernameTextBoxField.sendKeys(username);
		passwordTextBoxField.sendKeys(password);
		signinButton.click();
		driver.close();
		driver.switchTo().window(mainWin);
	}



}
