package automate;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IRCTC {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USRE\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		Thread.sleep(2000);
        String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		//WebElement w=driver.findElement(By.xpath(""));
		//Actions a= new Actions(driver);
		//a.click().perform();
			
		//Alert a=driver.switchTo().alert();
		//a.dismiss();
		driver.findElement(By.xpath("//input[@class='ng-tns-c57-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='KALYAN JN - KYN'])")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='ng-tns-c57-9 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")).click();
		Thread.sleep(2000);		
		driver.findElement(By.xpath("(//span[text()='PUNE JN - PUNE'])")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		WebElement w=driver.findElement(By.xpath("(//a[text()=' LOGIN '])"));
		w.click();
		driver.findElement(By.xpath("//a[@class='fa fa-window-close pull-right loginCloseBtn ng-tns-c19-268']")).click();
		Thread.sleep(2000);
		WebElement more=driver.findElement(By.xpath("(//span[text()='PREMIUM PARTNER'])"));
		Actions a=new Actions(driver);
		a.moveToElement(more);
		driver.findElement(By.xpath("")).click();
        Thread.sleep(2000);
	}

}
