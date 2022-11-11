package automate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class redbus {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USRE\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		WebElement d=driver.findElement(By.xpath("//input[@data-message='Please enter a source city']"));
		d.click();
		d.sendKeys("Ulhasnagar");
		Thread.sleep(2000);
		WebElement w1=driver.findElement(By.xpath("//input[@data-message='Please enter a destination city']"));
		w1.click();
		w1.sendKeys("Kolhapur");
		WebElement d1=driver.findElement(By.xpath("(//li[text()='Bus Stand, Kolhapur(Maharashtra)'])"));
		d1.click();
		WebElement month=driver.findElement(By.xpath("//input[@id='onward_cal']"));
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
		WebElement w2=driver.findElement(By.xpath("//button[@id='search_btn']"));
		w2.click();
		
		
		}

	}


