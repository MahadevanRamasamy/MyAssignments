package week4.day1;

import java.awt.List;
import java.awt.Window;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		driver.findElement(By.xpath("//table/following-sibling::a/img")).click();
		Set<String> windowHandle = driver.getWindowHandles();
		ArrayList<String> windows = new ArrayList<String>(windowHandle);
		driver.switchTo().window(windows.get(1));
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//tr/td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']/div/a[@class='linktext'])[1]")).click();
		driver.switchTo().window(windows.get(0));
		driver.findElement(By.xpath("(//table/following-sibling::a/img)[2]")).click();
		Set<String> windowHandle1 = driver.getWindowHandles();
		ArrayList<String> windows1 = new ArrayList<String>(windowHandle1);
		driver.switchTo().window(windows1.get(1));
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//tr/td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']/div/a[@class='linktext'])[2]")).click();
		driver.switchTo().window(windows1.get(0));
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		System.out.println(driver.getTitle());
		
	}

}
