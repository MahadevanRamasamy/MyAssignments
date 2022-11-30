package week4.day1;

import java.awt.List;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro ",Keys.ENTER);
		//Checking price compare for second listed option since 1st option is not showing Add to cart option
		String text = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[2]")).getText();
		String replace = text.trim().replace(",", "");
		int mobilePrice = Integer.parseInt(replace);
		System.out.println("First mobile product price is: "+mobilePrice);
		String customerRating = driver.findElement(By.xpath("(//div[@class='a-row a-size-small']//a/span)[2]")).getText();
		System.out.println("Number of customer ratings for the first displayed product: "+customerRating);
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String> windows = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windows.get(1));
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[@id='attach-sidesheet-view-cart-button-announce']/preceding-sibling::input")).click();
		String text2 = driver.findElement(By.xpath("//span/parent::span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap']")).getText();
		String replace2 = text2.trim().replace(",", "");
		System.out.println("price: "+replace2);
		double cartPrice = Double.parseDouble(replace2);
		int cartPricevalue = (int)cartPrice;
		System.out.println("Price is: "+cartPricevalue);
		if(mobilePrice == cartPricevalue)
		{
			System.out.println("It's is correct");
		}
		else
		{
			System.out.println("Incorrect price");
		}
	}

}
