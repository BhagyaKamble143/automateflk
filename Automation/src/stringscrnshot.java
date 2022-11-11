import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class stringscrnshot {
	public static void Screenshot(String s) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USRE\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/default.asp");
        driver.manage().window().maximize();
		Thread.sleep(2000);
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Dest=new File("F:\\New folder\\Automation\\screenshotfolder\\JS.jpg");
		FileHandler.copy(source, Dest);
		Thread.sleep(2000);
		driver.close();
        
	}

}
