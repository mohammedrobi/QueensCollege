package com.queenscollege.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.queenscollege.base.PageBase;

public class DepartmentsDropDownPage extends PageBase{
	
	@FindBy(linkText = "Departments")
	public WebElement departments;
	
	@FindBy(id = "d6")
	public WebElement departmentDropDownLinksBox;
	 
	@FindBy(xpath = "//*[@id='findTabs']/a[2]")
	public WebElement xIcon;	
	
	WebElement refBox;
		
	public void goToDepartments(){
		departments.click();
		//Clicking  all links under DEPARTMENTS links drop down
		List<WebElement> departmentDropDownLinks = departmentDropDownLinksBox.findElements(By.tagName("a"));		
		for(int i = 0; i < departmentDropDownLinks.size(); i ++){
			//System.out.println(departmentDropDownLinks.get(i).getText());
			departmentDropDownLinks.get(i).click();
			goToPreviousPage();
			departments.click();
			refBox = departmentDropDownLinksBox;
			departmentDropDownLinks = departmentDropDownLinksBox.findElements(By.tagName("a"));			
		}
		xIcon.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
