import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childpop {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\USRE\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/js/js_popup.asp");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_alert']"));
	Thread.sleep(2000);
	String mainWindowId=driver.getWindowHandle();
	String expUrl="https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert";
	String expID="";
	Set<String> Alladd=driver.getWindowHandles();
	for(String s:Alladd) {
		System.out.println(s);
		driver.switchTo().window(s);
		String actURL=driver.getCurrentUrl();
		if(expUrl.equals(actURL)) {
			System.out.println("correct window");
			expID=s;
		}
		else {
			System.out.println("Wrong window");
		}
	}
	driver.switchTo().window(expID);
	}
	
    
	}

