

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Popup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USRE\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	    
	    //driver.findElement(By.xpath("//input[@name='alert']")).click();
	    //driver.findElement(By.xpath("//input[@name='confirmation']")).click();
	    driver.findElement(By.xpath("//input[@name='prompt']")).click();
	    Thread.sleep(1000);
	    Alert alt=driver.switchTo().alert();
	    Thread.sleep(2000);
	    //alt.accept();
	    alt.dismiss();
	    Thread.sleep(2000);
	    alt.sendKeys("anu");
	    driver.close();
	    
	    }
	    
	}


