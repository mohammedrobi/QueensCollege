package rough;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Videos {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://www.qc.cuny.edu/about/Glance/QCVideos/Archives/Pages/Welcome.aspx");
		
		//driver.findElement(By.name("collapse")).click();
		//driver.findElement(By.xpath("//*[@id='WebPartWPQ3']/table/tbody/tr[2]/td/a"));
		
		WebElement box = driver.findElement(By.xpath("//*[@id='MSOZoneCell_WebPartWPQ3']/table"));
		List<WebElement> link = box.findElements(By.name("collapse"));
		for(int i = 0; i < link.size();i++){			
			System.out.println(link.get(i).getText());
		}	

	}

}
