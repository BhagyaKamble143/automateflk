import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class synchronization {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\USRE\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/js/js_popup.asp");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	WebDriverWait wait=new WebDriverWait(driver,20);
	WebElement textbox=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(null)));
	
	
	WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(20));
	WebElement ele=wait.until(ExpectedConditions.visibilityOfAllElementLocatedBy(n))
	}

}
