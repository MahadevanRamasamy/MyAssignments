package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement brands = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions builder = new Actions(driver);
		//Mouseover on Brands and Search L'Oreal Paris
		builder.moveToElement(brands).perform();
		driver.findElement(By.xpath("//input[@placeholder='search brands']")).sendKeys("L'Oreal Paris", Keys.ENTER);
		//Click L'Oreal Paris
		driver.findElement(By.linkText("L'Oreal Paris")).click();
		String title = driver.getTitle();
		System.out.println(title);
		//Check the title contains L'Oreal Paris
		if(title.contains("L'Oreal Paris"))
		{
			System.out.println("Title contains L'Oreal Paris");
		}
		else
		{
			System.out.println("Not contains L'Oreal Paris");
		}
		//Click sort By and select customer top rated
		driver.findElement(By.className("sort-name")).click();
		driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
		//Click Category and click Hair->Click haircare->Shampoo
		driver.findElement(By.xpath("//span[text()='Category']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div/span[text()='Hair']")).click();		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//ul[@id='custom-scroll']//div/span[text()='Hair Care']")).click();
		driver.findElement(By.xpath("//label[@for='checkbox_Shampoo_316']")).click();
		//Click->Concern->Color Protection
		driver.findElement(By.xpath("//div/span[text()='Concern']")).click();
		driver.findElement(By.xpath("//div/span[text()='Color Protection']")).click();
		//check whether the Filter is applied with Shampoo
		String text = driver.findElement(By.xpath("//div/span[text()='Shampoo']")).getText();
		System.out.println(text);
		if(text.contains("Shampoo"))			
		{
			System.out.println("Shampoo filter is present");
		}
		else
		{
			System.out.println("Shampoo filter is not present");
		}
		Thread.sleep(4000);
		//Click on L'Oreal Paris Colour Protect Shampoo
		driver.findElement(By.xpath("//img[contains(@alt,'Oreal Paris Colour Protect Shampoo')]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windows = new ArrayList<String>(windowHandles);
		//GO to the new window and select size as 175ml
		driver.switchTo().window(windows.get(1));
		WebElement ele = driver.findElement(By.xpath("//select[@title='SIZE']"));
		Select dropDown = new Select(ele);
		dropDown.selectByIndex(1);
		//Print the MRP of the product
		String mrp = driver.findElement(By.xpath("//span[text()='₹189']")).getText();
		System.out.println("MRP of the product is: " +mrp);
		//Click on ADD to BAG
		driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();
		//Go to Shopping Bag 
		driver.findElement(By.xpath("//button[@type='button']/span[@class='cart-count']")).click();
		WebElement element = driver.findElement(By.className("css-acpm4k"));
		driver.switchTo().frame(element);
		//Print the Grand Total amount
		String grandTotal = driver.findElement(By.xpath("//span[@class='css-n8gwxi e171rb9k3']")).getText();
		System.out.println("Grand total price is:" +grandTotal);
		Thread.sleep(9000);		
		// Click Proceed
		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
		//Click on Continue as Guest
		driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
		driver.findElement(By.xpath("//span[@class='css-175whwo ehes2bo0']//img[@class='css-16z7tzi ek8d9s80']")).click();
		//Check if this price is the same as grandTotal
		String price = driver.findElement(By.xpath("//p[@class='css-cla92e eka6zu20']")).getText();		
		if(grandTotal.equals(price))
		{
			System.out.println("Price is same");
		}
		else
		{
			System.out.println("Price is not same");
		}
		driver.quit();
	}
}
