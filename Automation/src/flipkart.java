import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USRE\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.flipkartcareers.com/candidate/login");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("anuja@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
