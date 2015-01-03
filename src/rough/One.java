package rough;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class One {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.qc.cuny.edu/about/Glance/Pages/default.aspx");
		WebElement box = driver.findElement(By.xpath("//*[@id='MSO_ContentTable']/tbody/tr/td/center/table/tbody/tr[3]/td/table[2]/tbody/tr[1]/td[1]/div"));
		List<WebElement> allLinks = box.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		//for (WebElement link : allLinks) {
		
		for(int i = 0; i < allLinks.size(); i++){
			//System.out.println(allLinks.get(i).getText());
			if(allLinks.get(i).getText().length()>1){
				System.out.println(allLinks.get(i).getText());
			
			/*allLinks.get(i).click();
			driver.navigate().back();
			box = driver.findElement(By.xpath("//*[@id='MSO_ContentTable']/tbody/tr/td/center/table/tbody/tr[3]/td/table[2]/tbody/tr[1]/td[1]/div"));
			allLinks = box.findElements(By.tagName("a"));*/
			}
			
			Assert.assertEquals("actual", "expected");
			
			
			
			
			/*if (link.getText().length() > 1) {
				System.out.println(link.getText());*/
			}
		driver.quit();
		}
	}

