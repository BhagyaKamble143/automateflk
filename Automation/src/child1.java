import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class child1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USRE\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/js_intro.asp");
		driver.manage().window().maximize();
		Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_intro_inner_html']")).click();
        Thread.sleep(2000);
        String expUrl="https://www.w3schools.com/js/tryit.asp?filename=tryjs_intro_inner_html";
        Thread.sleep(2000);
        String main=driver.getWindowHandle();//return main window
        Thread.sleep(2000);
        ArrayList<String> al=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(al.get(1));
        driver.findElement(By.xpath("//a[@title='Save code']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Sign up for free']")).click();
        Thread.sleep(2000);
        driver.close();
        Thread.sleep(2000);
        driver.switchTo().window(al.get(0));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_intro_lightbulb']")).click();
        Thread.sleep(3000);
        driver.close();
        
        
        
       
        
        
	}

}
