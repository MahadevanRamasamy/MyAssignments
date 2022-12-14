package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement brands = driver.findElement(By.xpath("//span[contains(text(),'Men')]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(brands).perform();
		driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
		String count = driver.findElement(By.xpath("//div[@class='child-cat-count ']")).getText();
		int noOfItems = Integer.parseInt(count);
		System.out.println("Count of the sport shoes: "+noOfItems);
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		driver.findElement(By.xpath("//div[@class='sort-selected']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul[@class='sort-value']/li[@data-index='1']")).click();
		List<WebElement> findElements = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
		System.out.println("Size is : "+findElements.size());
		List<Integer> li = new ArrayList<Integer>();
		Thread.sleep(5000);
		for(int i = 1; i<=findElements.size();i++)
		{			
			String price = driver.findElement(By.xpath("(//span[@class='lfloat product-price'])["+i+"]")).getDomAttribute("data-price");
			int shoesPrice = Integer.parseInt(price);
			li.add(shoesPrice);		
		}
		System.out.println(li);
		Set<Integer> lowtoHigh = new TreeSet<Integer>(li);
		Set<Integer> lowToHigh2 = new LinkedHashSet<Integer>(li);
		if(lowtoHigh.equals(lowToHigh2))
		{
			System.out.println("Sorted low to high");
		}
		else
		{
			System.out.println("Not sorted correctly");
		}
		WebElement fromVal = driver.findElement(By.name("fromVal"));
		fromVal.clear();
		fromVal.sendKeys("600");
		WebElement toVal = driver.findElement(By.name("toVal"));
		toVal.clear();
		toVal.sendKeys("1200");
		driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
		
		WebElement navyColor = driver.findElement(By.xpath("//input[@id='Color_s-Navy']/following-sibling::label"));
		Thread.sleep(2000);
		navyColor.click();
		
		 String priceFilterText = driver.findElement(By.xpath("//div[@class='navFiltersPill']/a")).getText();
		 System.out.println(priceFilterText);
		 String filterNavy = driver.findElement(By.xpath("//div[@class='navFiltersPill']/a[@data-value='Navy']")).getText();
		 System.out.println(filterNavy);
		 WebElement firstResult = driver.findElement(By.xpath("//picture[@class='picture-elem']//img"));
		 builder.moveToElement(firstResult).perform();
		 driver.findElement(By.xpath("//div[contains(text(),'Quick View')]")).click();
		 String price = driver.findElement(By.className("payBlkBig")).getText();
		 System.out.println(price);
		 String percentage = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		 System.out.println(percentage);
		 //Screenshot
		 File source = driver.getScreenshotAs(OutputType.FILE);
		 File dest = new File("./snaps/new.png");
		 FileUtils.copyFile(source, dest);
		 WebElement xbutton = driver.findElement(By.xpath("//div[@class='close close1 marR10']"));
			xbutton.click();
			driver.close();
			System.out.println("Closed the browser");
				
	}

}
