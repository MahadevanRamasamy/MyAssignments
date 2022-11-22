package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Mahadevan");
		driver.findElement(By.id("lastNameField")).sendKeys("Ramasamy");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Mahadevan");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Ramasamy");
		driver.findElement(By.name("departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Testing team");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("mahadevan.it@gmail.com");
		WebElement ele = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dropDown = new Select(ele);
		dropDown.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@value='Create Contact']")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Description cleared");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		System.out.println("The title of the page is " + driver.getTitle());
		
	}

}
