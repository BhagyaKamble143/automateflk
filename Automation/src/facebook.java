import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USRE\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		Select s=new Select(month);
		List<WebElement>l1=s.getOptions();
		Thread.sleep(2000);
		ArrayList<String>al=new ArrayList<String>();
		for(WebElement w:l1) {
			System.out.println(w.getText());
			String data=w.getText();
			al.add(data);
		}
		Collections.sort(al);
		System.out.println("*");
		for(String S1:al){
			System.out.println(S1);
			}
		System.out.println("*");
		for(int i=al.size()-1;i>0;i--) {
			System.out.println(al.get(i));
		}
		driver.close();
		}
}
		