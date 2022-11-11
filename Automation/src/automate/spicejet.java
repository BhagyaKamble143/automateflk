package automate;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class spicejet {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"F:\\\\New folder\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement log=driver.findElement(By.xpath("//div[text()='Login']"));
		log.click();
		Thread.sleep(2000);
		WebElement username=driver.findElement(By.xpath("//input[@type='number']"));
		username.click();
		username.sendKeys("7709058244");
		WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
		pass.click();
		pass.sendKeys("Anuja@123");
		WebElement login=driver.findElement(By.xpath("//div[@data-testid='login-cta']"));
		login.click();
		WebElement from=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		from.click();
		from.sendKeys("Mumbai");
		WebElement to=driver.findElement(By.xpath("//div[text()='To']"));
		to.click();
		to.sendKeys("Kolkata");
		WebElement nov=driver.findElement(By.xpath("(//div[text()='14'])[2]"));
	    nov.click();
		WebElement srch=driver.findElement(By.xpath("//div[text()='Search Flight']"));
		srch.click();
		WebElement hold=driver.findElement(By.xpath("//div[text()='Hold Fare Now']"));
		hold.click();
		WebElement name=driver.findElement(By.xpath("//div[text()='Hold my fare without name']"));
		name.click();
		Thread.sleep(2000);
		WebElement Anuja=driver.findElement(By.xpath("//div[text()='Hi Anuja']"));
		Anuja.click();
		Thread.sleep(2000);
		WebElement trip=driver.findElement(By.xpath("//div[text()='My Trips']"));
		trip.click();
		WebElement book=driver.findElement(By.xpath("(//button[text()='BOOK NOW'])[1]"));
		book.click();
		WebElement add=driver.findElement(By.xpath("//div[text()='Add-ons']"));
		Actions on=new Actions(driver);
		on.moveToElement(add).perform();
		WebElement gift=driver.findElement(By.xpath("//div[text()='Gift Card']"));
		gift.click();
		WebElement journey=driver.findElement(By.xpath("//span[text()='Happy Journey Gift Card']"));
		journey.click();
		Thread.sleep(2000);
		WebElement select=driver.findElement(By.xpath("//select[@id='quantity']"));
		Select s=new Select(select);
		s.selectByIndex(1);
		ArrayList<String> al=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(al.get(0));
		Thread.sleep(2000);
		//WebElement journey=driver.findElement(By.xpath("//span[text()='Happy Journey Gift Card']"));
		//journey.click();
		//WebElement journey=driver.findElement(By.xpath("//span[text()='Happy Journey Gift Card']"));
		//journey.click();
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
