import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nyka {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USRE\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.nykaa.com/auth/verify?ptype=auth");
		driver.findElement(By.xpath("//input[@name='emailMobile']")).sendKeys("7709058244");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}

