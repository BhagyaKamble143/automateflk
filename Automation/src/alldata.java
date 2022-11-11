import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alldata {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USRE\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		List<WebElement>rows=driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println(rows.size());
		List<WebElement>headerCells=driver.findElements(By.xpath("//table[@id='customers']//tr/th"));
		List<WebElement>remainingCells=driver.findElements(By.xpath("//table[@id='customers']//tr/td"));
		System.out.println(headerCells.size()+remainingCells.size());
		for(int i=1;i<=rows.size();i++){
			List<WebElement>ana;
			if(i==1) {
				ana=driver.findElements(By.xpath("//table[@id='customers']//tr["+i+"]/th"));
			}
			else {
				ana=driver.findElements(By.xpath("//table[@id='customers']//tr["+i+"]/td"));
			}
			for(int j=0;j<ana.size();j++) {
				System.out.print(ana.get(j).getText()+" ");
			}
			System.out.println();
		}
	}

	}

