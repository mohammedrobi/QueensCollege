package rough;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class QuickLinksDropDownRoughPage {
	// First box path : //*[@id='d3']/ul
	// Second box path : //*[@id='d4']/ul
	
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://www.qc.cuny.edu");
		driver.findElement(By.linkText("Quick Links")).click();
		// WebElement for 1st box & printing & Clicking 1st box links
		WebElement box = driver.findElement(By.xpath("//*[@id='d3']/ul"));
		List<WebElement> allLinks = box.findElements(By.tagName("a"));
		for (int i = 0; i < allLinks.size(); i++) {
			System.out.println(allLinks.get(i).getText());
			allLinks.get(i).click();
			driver.navigate().back();
			driver.findElement(By.linkText("Quick Links")).click();
			box = driver.findElement(By.xpath("//*[@id='d3']/ul"));
			allLinks = box.findElements(By.tagName("a"));			
		}
		// WebElement for 2nd box & printing & Clicking 2nd box links
		WebElement box2 = driver.findElement(By.xpath("//*[@id='d4']/ul"));
		List<WebElement> allLinks2 = box2.findElements(By.tagName("a"));
		
		for (int i = 0; i < allLinks2.size(); i++) {
			System.out.println(allLinks2.get(i).getText());
			allLinks2.get(i).click();
			driver.navigate().back();
			driver.findElement(By.linkText("Quick Links")).click();
			box2 = driver.findElement(By.xpath("//*[@id='d4']/ul"));
			allLinks2 = box2.findElements(By.tagName("a"));			
		}
		driver.close();		
	}
}



