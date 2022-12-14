package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/drag.xhtml;jsessionid=node01qey7o6oowt9dc09s8l9hc4bu437441.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		//Draggable
		WebElement source = driver.findElement(By.xpath("//span[text()='Drag me around']"));
		Point location = source.getLocation();
		System.out.println(location);
		Actions builder = new Actions(driver);
//		Point location = target.getLocation();
//			 int x = location.getX();
//			 int y = location.getY();
		builder.dragAndDropBy(source, 300, 100).perform();
		Point location2 = source.getLocation();
		System.out.println(location2);
		if(location == location2)
		{
			System.out.println("Not dragged");
		}
		else
		{
			System.out.println("Dragged");
		}
		
		//Draggable Columns
		WebElement source2 = driver.findElement(By.xpath("//span[text()='Category']"));
		WebElement target2 = driver.findElement(By.xpath("//span[text()='Quantity']"));
		builder.dragAndDrop(target2, source2).perform();
		
		
		//Droppable
		
		WebElement source3 = driver.findElement(By.xpath("//p[text()='Drag to target']"));
		WebElement target3 = driver.findElement(By.xpath("//p[text()='Drop here']"));
		builder.dragAndDrop(source3, target3).perform();
		
		//Draggable Rows
		Thread.sleep(3000);
		WebElement source4 = driver.findElement(By.xpath("(//td[text()='Bamboo Watch'])[2]"));
		WebElement target4 = driver.findElement(By.xpath("(//td[text()='Bracelet'])[2]"));
		//builder.clickAndHold(source4).clickAndHold(target4).perform();
		builder.dragAndDrop(target4, source4).perform();
		
				
		//Progress Bar
		
		driver.findElement(By.xpath("//span[text()='Start']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Cancel']")).click();
		
		//Range Slider
		
		WebElement leftSlider = driver.findElement(By.xpath("//span[@style='left: 30%;']"));
		Point lefslider = leftSlider.getLocation();
		System.out.println(lefslider);
		builder.dragAndDropBy(leftSlider, 65, 0).perform();
		Point location3 = leftSlider.getLocation();
		System.out.println("After left slider movement: "+location3);
		
		
		WebElement rightSlider = driver.findElement(By.xpath("//span[@style='left: 80%;']"));
		Point rigslider = rightSlider.getLocation();
		System.out.println(rigslider);
		builder.dragAndDropBy(rightSlider, 70, 0).perform();
		Point location4 = rightSlider.getLocation();
		System.out.println("After right slider movement: "+   location4);
	}

}
