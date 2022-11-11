package automate;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class titan {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"F:\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.titaneyeplus.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
        String title=driver.getTitle();
		System.out.println(title);
		WebElement log=driver.findElement(By.xpath("(//a[@href='https://www.titaneyeplus.com/customer/account/login/'])[1]"));
		log.click();
		WebElement user=driver.findElement(By.xpath("(//input[@class='input-text'])[3]"));
		user.click();
		user.sendKeys("anujakamble37@gmail.com");
		Thread.sleep(2000);
	}

}
