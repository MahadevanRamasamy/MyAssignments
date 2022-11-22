package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundRadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//label[text()='Chrome']/preceding-sibling::div[@class='ui-radiobutton ui-widget']//span)[1]")).click();
		driver.findElement(By.xpath("//label[text()='Chennai']/preceding-sibling::div[@class='ui-radiobutton ui-widget']//span")).click();
		driver.findElement(By.xpath("//label[text()='Chennai']/preceding-sibling::div[@class='ui-radiobutton ui-widget']//span")).click();
		String text = driver.findElement(By.xpath("(//label[text()='Safari'])[2]")).getText();
		System.out.println(text);
		

	}

}
