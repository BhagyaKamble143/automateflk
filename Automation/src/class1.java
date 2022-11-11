import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USRE\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.get("https://www.nykaa.com/auth/verify?ptype=auth");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("anujakamble37@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath(""));
		driver.findElement(By.xpath(null))
		WebElement month=driver.findElement(null)
		List<WebElement>l2=s.
		driver.close();
	
		
	}

}
