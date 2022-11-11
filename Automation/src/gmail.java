import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USRE\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Anuja");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Kamble");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("anujakamble37");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password'][1]")).sendKeys("anuja+*1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password'][2]")).sendKeys("anuja+*1234");
		Thread.sleep(2000);
		driver.close();
	}

}
