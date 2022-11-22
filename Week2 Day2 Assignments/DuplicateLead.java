package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("mahadevan.it@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-firstName ']//a[@class='linktext']")).getText();
		System.out.println("Captured name of 1st lead is: " +text);
		driver.findElement(By.xpath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-firstName ']//a[@class='linktext']")).click();
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		String text1 = driver.findElement((By.xpath("//div[@id='sectionHeaderTitle_leads']"))).getText();
		if(text1.equals("Duplicate Lead"))
		{
			System.out.println("Title is Duplicate Lead");
		}
		else
		{
			System.out.println("Incorrect title");
		}
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		String text2 = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println("Name is :" +text2);
		if(text.equals(text2))
		{
			System.out.println("Duplicated lead name is same as captured name");
		}
		else
		{
			System.out.println("Its not same");
		}
		
	}	

}
