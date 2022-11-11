import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USRE\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
        driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement source=driver.findElement(By.xpath("//li[@data-id='1']"));
		WebElement dest=driver.findElement(By.xpath("//li[@data-id='2']"));
		Actions a=new Actions(driver);
		a.dragAndDrop(source, dest).build().perform();
		Thread.sleep(2000);
		driver.close();
		
	}

}
