package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroudCheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget']")).click();
		driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		driver.findElement(By.xpath("//div[@class='ui-chkbox ui-widget']/div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		driver.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget']/div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[2]")).click();
		driver.findElement(By.xpath("//span[@class='ui-chkbox-icon ui-c ']/parent::div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		boolean enabled = driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-disabled ui-state-disabled']//preceding-sibling::div[@class='ui-helper-hidden-accessible']/input[@disabled='disabled']")).isEnabled();
		if(enabled == true)
		{
			System.out.println("Checkbox is enabled");
		}
		else
		{
			System.out.println("Checkbox is disabled");
		}
		driver.findElement(By.xpath("//ul[@class='ui-selectcheckboxmenu-multiple-container ui-widget ui-inputfield ui-state-default ui-corner-all']")).click();
		driver.findElement(By.xpath("//li[@data-item-value='London']//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		driver.findElement(By.xpath("//li[@data-item-value='Rome']//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		driver.findElement(By.xpath("//li[@data-item-value='Berlin']//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		
	
	}

}
