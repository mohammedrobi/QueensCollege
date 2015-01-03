package rough;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VideoArchives {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://www.qc.cuny.edu/about/Glance/QCVideos/Pages/Default.aspx");
		driver.findElement(By.xpath("//*[@id='WebPartWPQ7']/a/span")).click();
		driver.navigate().back();
		WebElement box = driver.findElement(By.xpath("//*[@id='MSO_ContentTable']/tbody/tr/td/center/table/tbody/tr[3]/td/table[2]/tbody/tr/td[1]"));
													  
		List<WebElement> linksInBox = box.findElements(By.tagName("a"));
		System.out.println(linksInBox.size());
		int count = 0;
		for(int i = 3; i <=10; i++){
			System.out.println(linksInBox.get(i).getText());
			count+=1;
			System.out.println(count);
			/*linksInBox.get(i).click();
			driver.navigate().back();
			box = driver.findElement(By.xpath("//*[@id='MSO_ContentTable']/tbody/tr/td/center/table/tbody/tr[3]/td/table[2]/tbody/tr/td[1]"));
			linksInBox = box.findElements(By.tagName("a"));
			*/
		}
		
	}
	
	
}
