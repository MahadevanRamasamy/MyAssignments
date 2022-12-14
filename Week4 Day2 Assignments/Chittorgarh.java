package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chittorgarh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.chittorgarh.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("navbtn_stockmarket")).click();
		driver.findElement(By.linkText("NSE Bulk Deals")).click();
		List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr/td[3]"));
		System.out.println("Number of rows: "+rows.size());
		List<String> li = new ArrayList<String>();
		for(int i=1; i<=rows.size(); i++)
		{
			String colText = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
			System.out.println(colText);
			li.add(colText);
		}
		Set<String> uniqueColumnText = new TreeSet<String>(li);
		System.out.println("Size after removal of duplicates: "+uniqueColumnText .size());
		System.out.println("After removal of duplicates "+uniqueColumnText );
		
	}

}
