package rough;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClickingForLoopLinksWIthPopUp {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://www.qc.cuny.edu/about/administration/Provost/Pages/Default.aspx");		
		WebElement box = driver.findElement(By.xpath("//*[@id='MSO_ContentTable']/tbody/tr/td/center/table/tbody/tr[3]/td/table[2]/tbody/tr[1]/td[1]/div"));
		List<WebElement>linksInBox = box.findElements(By.tagName("a"));		
		System.out.println("Total Window: "+ driver.getWindowHandles().size());			
		for(int i = 0; i <= 2; i++){
			System.out.println(linksInBox.get(i).getText());
			linksInBox.get(i).click();
			closePopUpIfPresent();
			/*if(driver.getWindowHandles().size()>1){
				Set<String> winId = driver.getWindowHandles();
				Iterator<String> it = winId.iterator();
				String main = it.next();
				String tab = it.next();
				driver.switchTo().window(tab);
				driver.getTitle();
				driver.close();
				Thread.sleep(5000);
				driver.switchTo().window(main);
			}*/
			driver.navigate().back();
			box = driver.findElement(By.xpath("//*[@id='MSO_ContentTable']/tbody/tr/td/center/table/tbody/tr[3]/td/table[2]/tbody/tr[1]/td[1]/div"));
			linksInBox = box.findElements(By.tagName("a"));				
		}
		
		
	}
	public static void closePopUpIfPresent(){
		Set <String> winId = driver.getWindowHandles();
		//System.out.println(windId.size());
		if(winId.size()>1){
			Iterator<String> it = winId.iterator();
			String mainWindow = it.next();
			String popUpWindow = it.next();
			driver.switchTo().window(popUpWindow);
			driver.close();
			driver.switchTo().window(mainWindow);
		}
	}
}

