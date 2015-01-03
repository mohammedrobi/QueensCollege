package rough;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AboutQCXpath {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("http://www.qc.cuny.edu/about/Pages/default.aspx");
		WebElement box = driver.findElement(By.xpath("//*[@id='MSO_ContentTable']/tbody/tr/td/center/table/tbody/tr[3]/td/table[2]/tbody/tr[1]/td[1]/div"));
		List<WebElement> allLinks = box.findElements(By.tagName("a"));
		int count = 0;
		for(int i = 1; i < allLinks.size(); i++){
			System.out.println(allLinks.get(i).getText());	
			
			System.out.println(count);
			count+=1;
			/*allLinks.get(i).click();
		    driver.navigate().back();			 
		    box = driver.findElement(By.xpath("//*[@id='MSOZoneCell_WebPartWPQ4']/table/tbody/tr[2]/td"));
			allLinks = box.findElements(By.tagName("a"));*/
			
		}
	}

}
