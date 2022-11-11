import java.io.File;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class shoppers {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"F:\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shoppersstop.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
        String title=driver.getTitle();
		System.out.println(title);
		WebElement log=driver.findElement(By.xpath("//a[@class='user']"));
		log.click();
		Thread.sleep(2000);
		WebElement mail=driver.findElement(By.xpath("(//a[@title='Login with Email'])[2]"));
		mail.click();
		Thread.sleep(2000);
		WebElement user=driver.findElement(By.xpath("(//input[@id='emailId'])[1]"));
		user.click();
		user.sendKeys("anujakamble37@gmail.com");
		Thread.sleep(2000);
		WebElement pass=driver.findElement(By.xpath("(//input[@type='password'])[3]"));
		pass.click();
		Thread.sleep(2000);
		WebElement select=driver.findElement(By.xpath("(//button[@type='submit'])[9]"));
		select.click();
		Thread.sleep(2000);
		WebElement T=driver.findElement(By.xpath("//span[text()='ADRO Mens Graphic Printed T-Shirts']"));
		T.click();
		Thread.sleep(2000);
		WebElement add=driver.findElement(By.xpath("//span[text()='Add to cart']"));
		add.click();
		Thread.sleep(4000);
		WebElement close=driver.findElement(By.xpath(""));
		close.click();
        WebElement cart=driver.findElement(By.xpath(""));
        cart.click();
         Thread.sleep(2000);
         driver.quit();
	
	}


	}


