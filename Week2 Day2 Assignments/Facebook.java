package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Mahadevan");
		driver.findElement(By.name("lastname")).sendKeys("Ramasamy");
		driver.findElement(By.xpath("//div[text()='Mobile number or email address']/following-sibling::input")).sendKeys("9976466140");
		driver.findElement(By.xpath("//div[text()='New password']/following-sibling::input")).sendKeys("Welcome@123");
		//Find the select tag element
		WebElement day = driver.findElement(By.name("birthday_day"));
		//Create object for select class
		Select dropDown1 = new Select(day);
		//Choose the option(index,visibleText or value)
		dropDown1.selectByVisibleText("24");		
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select dropDown2 = new Select(month);
		dropDown2.selectByIndex(0);
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select dropDown3 = new Select(year);
		dropDown3.selectByValue("1989");
		driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input")).click();
		
	}

}
