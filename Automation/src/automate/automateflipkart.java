package automate;

import java.io.File;

import java.io.IOException;
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

public class automateflipkart {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"F:\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
        String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//a[@href='/account/login?ret=/']"));
		//WebElement log=driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		//log.sendKeys("7709058244");
		//String text=log.getText();
		//if(text.equals("7709058244"));
		//{
		//	System.out.println("YES");
		//}
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("7709058244");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Anuja123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		//boolean result=log.isEnabled();
		//if(result)
		//{
		//	System.out.println("yes");
			//}
		//else {
			//System.out.println("no");
		//}
		//WebElement t=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
	    //String av=t.getAttribute("class");
	    //if(av.equals("_2KpZ6l _2HKlqd _3AWRsL"));
	    //{
	    	//System.out.println("verified");
	    //}
		Thread.sleep(2000);
		WebElement mobile=driver.findElement(By.xpath("(//img[@alt='Mobiles'])[1]"));
		mobile.click();
		Thread.sleep(2000);
		WebElement poco=driver.findElement(By.xpath("(//p[text()='Shop Now'])[2]"));
		poco.click();
		Thread.sleep(2000);
		WebElement Royalblue=driver.findElement(By.xpath("//div[text()='POCO M4 5G (Cool Blue, 64 GB)']"));
		Royalblue.click();
		Thread.sleep(2000);
		ArrayList<String> al=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(al.get(0));
		Thread.sleep(2000);
	    WebElement cart=driver.findElement(By.xpath("(//span[text()='Cart'])"));
	    cart.click();
	    //Actions i=new Actions(driver);
	    //i.moveToElement(e).perform();
	    //i.doubleClick();
	    Thread.sleep(2000);
	    //driver.findElement(By.xpath("(//span[text()='Place Order'])")).click();
	    //Thread.sleep(2000);
	    //Select s=new Select(w);
	    //s.selectByIndex(2);
	    //Actions a=new 
	    //Thread.sleep(2000);
	    JavascriptExecutor js=(JavascriptExecutor) driver;
	  	js.executeScript("window.scrollBy(0,2000)");
	  	Thread.sleep(2000);
	  	js.executeScript("window.scrollBy(2000,0)");
	  	Thread.sleep(2000);
	  	File l= (( TakesScreenshot )driver).getScreenshotAs(OutputType.FILE);
	  	File d=new File("F:\\New folder\\Automation\\screenshotfolder\\O.jpg");
	  	FileHandler.copy(l, d);
        Thread.sleep(2000);
        WebElement Anuja=driver.findElement(By.xpath("//div[@class='exehdJ']"));
        Actions a=new Actions(driver);
        a.moveToElement(Anuja).perform();
        Thread.sleep(2000);
       // WebElement MyProfile=driver.findElement(By.xpath("//div[text()='My Profile']"));
       // MyProfile.click();
       // WebElement logout=driver.findElement(By.xpath("//span[text()='Logout']"));
        driver.quit();
		
	  	
	   
	    
	    
		
		
	    
}
	

}
