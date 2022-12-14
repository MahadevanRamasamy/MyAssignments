 package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		WebElement mens = driver.findElement(By.xpath("//span[@class='catText']"));
		Actions builder = new Actions(driver);
		builder.moveToElement(mens).perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Shirts']")).click();
		Thread.sleep(4000);
		WebElement findElement2 = driver.findElement(By.xpath("//img[@class='product-image ']"));
		builder.moveToElement(findElement2).perform();
		driver.findElement(By.xpath("//div[contains(text(),'Quick View')]")).click();
		System.out.println("Over");
		
		
	}

}
