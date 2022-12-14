package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HTML1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Number of rows in table
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='attributes-list']/tbody/tr/td[1]"));
		System.out.println("Number of rows: " +rows.size());
		//Number of columns in table
		List<WebElement> column = driver.findElements(By.xpath("//table[@class='attributes-list']/tbody/tr[2]/td"));
		System.out.println("Number of coloumns: " +column.size());
	}

}
