import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class calender {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USRE\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.nykaa.com/");
        driver.manage().window().maximize();
		Thread.sleep(2000);
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Dest=new File("F:\\New folder\\Automation\\screenshotfolder\\E.jpg");
		FileHandler.copy(source, Dest);
		Thread.sleep(2000);
		Calender Cal=Calender.getInstance();
		Date Time=Cal.getTime();
		System.out.println("TimeStamp");
		String Sc=Time.toString().replace(":","").replace(" ","");
		File Dest1=new File("F:\\\\New folder\\\\Automation\\\\screenshotfolder\\\\E.jpg");
	}

}
