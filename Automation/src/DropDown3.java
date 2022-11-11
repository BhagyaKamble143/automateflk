import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USRE\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(2000);
		WebElement lan=driver.findElement(By.xpath("//select[@id='multiselect1']"));
		Select s=new Select(lan);
		Thread.sleep(3000);
		s.selectByIndex(0);
		Thread.sleep(2000);
        s.selectByIndex(1);
		Thread.sleep(2000);
        s.selectByIndex(2);
		Thread.sleep(1000);
		WebElement firstselected=s.getFirstSelectedOption();
		System.out.println(s.getFirstSelectedOption().getText());
		System.out.println(s.isMultiple());//result will in boolean
		List<WebElement>l=s.getAllSelectedOptions();
		System.out.println(l.size());
		List<WebElement>l1=s.getOptions();
		System.out.println(l1.size());
		for (int i=0;i<l1.size();i++) {
			System.out.println(l1.get(i).getText());
		}
		driver.close();
		
		
	}

}
