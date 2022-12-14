package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesTask {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		driver.switchTo().frame("frame1");
		//Topic
		driver.findElement(By.xpath("//b[@id='topic']/following-sibling::input")).sendKeys("Frames");
		//Inner Frame check box
		driver.switchTo().frame("frame3");
		driver.findElement(By.xpath("//b[text()='Inner Frame Check box :']/following-sibling::input")).click();
		driver.switchTo().defaultContent();
		//Select dropdown
		driver.switchTo().frame("frame2");
		WebElement ele = driver.findElement(By.xpath("//select[@id='animals']"));
		Select dropDown = new Select(ele);
		dropDown.selectByIndex(3);
		

	}

}
