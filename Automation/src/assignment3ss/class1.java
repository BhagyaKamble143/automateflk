package assignment3ss;

import java.io.File;
import java.io.IOException;
import java.sql.Time;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class class1 {
	public static void ssshot() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USRE\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/default.asp");
        driver.manage().window().maximize();
		Thread.sleep(2000);
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Dest=new File("E:\\ss\\cs.jpg");
		FileHandler.copy(source, Dest);
		Thread.sleep(2000);
		Date dt=new Date();
		Thread.sleep(2000);
		Time tm=new Time(1);
		Thread.sleep(2000);
		String S1="";
	    S1=S1+dt.toString()+""+tm.getTime();
		Thread.sleep(2000);
		FileHandler.copy(source,new File("E:\\ss\\cs.jpg"+""+S1));
		Thread.sleep(2000);
		driver.close();
		
	}

}
