package com.queenscollege.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.queenscollege.base.PageBase;

public class HomePage extends PageBase{
	@FindBy(linkText ="Quick Links")
	public WebElement quickLinks;
	
	@FindBy(linkText ="Departments")
	public WebElement departments;
	
	@FindBy(linkText ="Adult Education")
	public WebElement adultEducation;
	
	@FindBy(linkText ="Arts")
	public WebElement arts;
	
	@FindBy(linkText ="Athletics")
	public WebElement athletics;
	
	@FindBy(linkText ="ESL")
	public WebElement esl;
	
	@FindBy(linkText ="Libraries")
	public WebElement libraries;
	
	@FindBy(linkText ="Directory")
	public WebElement directory;
	
	@FindBy(linkText ="Login to...")
	public WebElement loginTo;
	
	@FindBy(xpath = "//*[@id='hide-button']/img")
	public WebElement loginToX;
	
	@FindBy(name = "FutureStudents")
	public WebElement futureStudents;
	
	@FindBy(name = "CurrentStudents")
	public WebElement currentStudents;
	
	@FindBy(name = "Alumni")
	public WebElement alumni;
	
	@FindBy(name = "FacultyStaff")
	public WebElement facultyStaff;
	
	@FindBy(name = "InputKeywords")
	public WebElement searchBox;
	
	public void goToHomePage(){
		quickLinks.click();
		departments.click();
		adultEducation.click();
		adultEducation.click();
		arts.click();
		arts.click();
		athletics.click();
		goToPreviousPage();
		esl.click();
		libraries.click();
		goToPreviousPage();
		directory.click();
		loginTo.click();
		loginToX.click();		
		futureStudents.click();
		currentStudents.click();
		alumni.click();
		facultyStaff.click();
		closePopUpIfPresent();
		searchBox.sendKeys("Email");
		searchBox.sendKeys(Keys.ENTER);		
		goToPreviousPage();
	}	
}

