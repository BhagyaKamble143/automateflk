import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"F:\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://practice.cybertekschool.com/dropdown");
		Thread.sleep(2000);
		WebElement lan=driver.findElement(By.xpath("//select[@name='Languages']"));
		Select s=new Select(lan);
		Thread.sleep(1000);
		s.selectByIndex(0);
		Thread.sleep(1000);
        s.selectByValue("js");
		Thread.sleep(1000);
        s.selectByValue("c#");
		Thread.sleep(1000);
        
        }
       
        
        }
        
        
     
        
        
        
        
        
        
		
		
	


