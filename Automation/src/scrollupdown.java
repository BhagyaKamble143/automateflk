import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollupdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"F:\\\\New folder\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement tryIt=driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)",tryIt);
		js.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(1000,0)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(-3000,0)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(1000,2000)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(-3000,0)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(1000,-2000)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(-3000,-3000)");
		Thread.sleep(2000);
		driver.close();
		
		
		
		
	}

}
