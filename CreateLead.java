package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();	
		WebElement element = driver.findElement(By.id("username"));
		element.sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Cognizant");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mahadevan");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ramasamy");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Deva");
		driver.findElement(By.name("departmentName")).sendKeys("Testing");
		driver.findElement(By.name("description")).sendKeys("Mahadevan from Testing Team");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("mahadevan.it@gmail.com");
		WebElement ele = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dropDown = new Select(ele);
		dropDown.selectByVisibleText("Colorado");
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println(title);
		/*
		 * WebElement ele = driver.findElement(By.id("createLeadForm_dataSourceId"));
		 * Select dd = new Select(ele); dd.selectByVisibleText("Conference");
		 * driver.findElement(By.name("submitButton")).click();
		 */
		
		
	}

}
