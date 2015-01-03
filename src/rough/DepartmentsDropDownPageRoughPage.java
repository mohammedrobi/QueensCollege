package rough;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DepartmentsDropDownPageRoughPage {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://www.qc.cuny.edu");
		
		driver.findElement(By.linkText("Departments")).click();
		WebElement box = driver.findElement(By.id("d6"));
		List<WebElement> allLinks = box.findElements(By.tagName("a"));
		for(int i = 0; i < allLinks.size(); i ++){
			System.out.println(allLinks.get(i).getText());
			allLinks.get(i).click();
			driver.navigate().back();
			driver.findElement(By.linkText("Departments")).click();
			box = driver.findElement(By.id("d6"));
			allLinks = box.findElements(By.tagName("a"));			
		}
		
		driver.findElement(By.xpath("//*[@id='findTabs']/a[2]")).click();
		
		
			
		
		
		
		
		
		
	}

}
