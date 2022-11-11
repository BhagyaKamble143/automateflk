import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USRE\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		WebElement change=driver.findElement(By.xpath("//a[@aria-label='Choose a language for shopping.']"));
		Actions a=new Actions(driver);
		a.moveToElement(change).perform();//move on the webelement
		//a.contextClick();//right click
		//a.contextClick(change).perform();
		//a.click().perform();//regular click
		//a.click(change).perform();
		//a.doubleClick().perform();//double click
		//a.doubleClick(change).perform();
		a.moveToElement(change).click().perform();//to perform all actions at once
		Thread.sleep(2000);
		driver.close();
		
	}

}
