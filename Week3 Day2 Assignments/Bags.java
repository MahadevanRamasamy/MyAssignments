package week3.assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bags {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("bags", Keys.ENTER);
		// To the left  of the screen under " Gender" click the "Men"
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
		Thread.sleep(3000);
		//Under "Category" click "Fashion Bags"
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
		Thread.sleep(2000);
		// Print the count of the items Found.
		String text = driver.findElement(By.className("length")).getText();
		System.out.println("Total number of the items: " + text);
		//Get the list of brand of the products displayed in the page and print the list.
		System.out.println(" List of Brands");
		List<WebElement> bagBrandList = driver.findElements(By.className("brand"));
		for(int i= 0; i<bagBrandList.size(); i++)
		{
			WebElement webElement = bagBrandList.get(i);
			String bagBrand = webElement.getText();
			System.out.println(bagBrand);
			
		}
		// Get the list of names of the bags and print it
		System.out.println(" List of Bag names");
		List<WebElement> bagNameList = driver.findElements(By.className("nameCls"));
		for(int i= 0; i<bagNameList.size(); i++)
		{
			//Thread.sleep(2000);
			WebElement webElement = bagNameList.get(i);
			String bagName = webElement.getText();
			System.out.println(bagName);
			
		}
		
	}

}
