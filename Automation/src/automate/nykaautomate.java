package automate;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class nykaautomate {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USRE\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement b=driver.findElement(By.xpath("//a[@href='https://www.nykaa.com/sp/festive-makeup-Offers/festive-makeup-offers?transaction_id=1e008a73a4a730e577569356377fb2ed&intcmp=sale%2Ccategory-widget%2C1%2Cmakeup']"));
		Actions a1=new Actions(driver);
		a1.moveToElement(b).perform();
		Thread.sleep(2000);
		a1.click(b).perform();
		Thread.sleep(2000);
		ArrayList<String>s=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(s.get(0));
		Thread.sleep(2000);
		driver.switchTo().window(s.get(1));
		Thread.sleep(2000);
		
		
		
	}

}
