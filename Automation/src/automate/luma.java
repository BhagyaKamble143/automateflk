package automate;


import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class luma {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"F:\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
        String title=driver.getTitle();
		System.out.println(title);
		WebElement log=driver.findElement(By.xpath("(//li[@class='authorization-link'])[1]"));
		log.click();
		Thread.sleep(2000);
		WebElement user=driver.findElement(By.xpath("//input[@id='email']"));
		user.click();
		user.sendKeys("anujakamble37@gmail.com");
		Thread.sleep(2000);
		WebElement pass=driver.findElement(By.xpath("(//input[@id='pass'])[1]"));
		pass.click();
		pass.sendKeys("Anuja123");
		Thread.sleep(2000);
		WebElement login=driver.findElement(By.xpath("(//span[text()='Sign In'])[1]"));
		login.click();
		Thread.sleep(2000);
		WebElement women=driver.findElement(By.xpath("//span[text()='Women']"));
		Actions w=new Actions(driver);
		w.moveToElement(women).perform();
		WebElement top=driver.findElement(By.xpath("(//span[text()='Tops'])[1]"));
		top.click();
		Thread.sleep(2000);
		WebElement tank=driver.findElement(By.xpath("(//img[@alt='Breathe-Easy Tank'])[3]"));
		tank.click();
		WebElement size=driver.findElement(By.xpath("//div[@option-label='S']"));
		size.click();
		Thread.sleep(2000);
		WebElement clr=driver.findElement(By.xpath("//div[@option-label='Purple']"));
		clr.click();
		Thread.sleep(2000);
		WebElement add=driver.findElement(By.xpath("//span[text()='Add to Cart']"));
		add.click();
		Thread.sleep(2000);
		WebElement add1=driver.findElement(By.xpath("(//a[@href='https://magento.softwaretestingboard.com/checkout/cart/'])[1]"));
		add1.click();
		Thread.sleep(2000);
		WebElement add2=driver.findElement(By.xpath("//span[text()='View and Edit Cart']"));
		add2.click();
		Thread.sleep(2000);
		WebElement anuja=driver.findElement(By.xpath("(//button[@type='button'])[1]"));
		anuja.click();
		Thread.sleep(2000);
		WebElement signout=driver.findElement(By.xpath("(//a[@href='https://magento.softwaretestingboard.com/customer/account/logout/'])[1]"));
		signout.click();
		Thread.sleep(2000);
		driver.quit();
	}
}


