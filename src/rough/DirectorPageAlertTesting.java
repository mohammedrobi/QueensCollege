package rough;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DirectorPageAlertTesting {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.qc.cuny.edu/about/administration/AffirmativeAction/Pages/default.aspx");
		/*WebElement relatedLinksBox = driver.findElement(By
				.id("MSOZoneCell_WebPartWPQ3"));
		List<WebElement> relatedLinks = relatedLinksBox.findElements(By
				.tagName("a"));
		for (int i = 0; i < relatedLinks.size(); i++) {
			System.out.println(relatedLinks.get(i).getText());
			relatedLinks.get(i).click();
			System.out.println(driver.getWindowHandles().size());
			if (driver.getWindowHandles().size()>1){			
			Set<String> winId = driver.getWindowHandles();		
			Iterator<String> it = winId.iterator();
			String mainWindow = it.next();
			String popUpWindow = it.next();
			driver.switchTo().window(popUpWindow);
			driver.close();
			driver.switchTo().window(mainWindow);
			}
			
			Alert a = driver.switchTo().alert();			
			System.out.println(a.getText());
			a.accept();
			driver.navigate().back();
			relatedLinksBox = driver.findElement(By
					.id("MSOZoneCell_WebPartWPQ3"));
			relatedLinksBox.findElements(By.tagName("a"));
		}*/
		driver.findElement(By.xpath("//*[@id='WebPartWPQ8']/a[1]/img")).click();
	}
}
