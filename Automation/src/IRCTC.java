import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTC {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USRE\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.get("https://www.irctc.co.in/nget/profile/user-registration");
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Anuja_K");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='usrPwd']")).sendKeys("aNUJA+1");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("yes");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(2000);
		driver.close();
	
	}

}
