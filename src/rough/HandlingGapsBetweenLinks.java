package rough;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingGapsBetweenLinks {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://www.qc.cuny.edu/about/Glance/Pages/default.aspx");
		WebElement box = driver.findElement(By.xpath("//*[@id='MSO_ContentTable']/tbody/tr/td/center/table/tbody/tr[3]/td/table[2]/tbody/tr[1]/td[1]/div"));
		List<WebElement> links = box.findElements(By.tagName("a"));
		System.out.println("Total Links :"+links.size());
		
		for(int i = 0; i < links.size(); i++){
			if(links.get(i).getText().length()>1){
				System.out.println(links.get(i).getText());
				links.get(i).click();
				driver.navigate().back();
				box = driver.findElement(By.xpath("//*[@id='MSO_ContentTable']/tbody/tr/td/center/table/tbody/tr[3]/td/table[2]/tbody/tr[1]/td[1]/div"));
				links = box.findElements(By.tagName("a"));
			}
		}
	
	
	
	
	
	
	
	}

}
