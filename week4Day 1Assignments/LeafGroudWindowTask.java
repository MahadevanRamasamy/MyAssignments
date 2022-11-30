package week4.day1;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroudWindowTask {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml;jsessionid=node0ssnceyfd5mtq1u38yu3inp0zh436503.node0");
		driver.manage().window().maximize();
		//Click and Confirm new Window Opens
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		Set<String> windowHandle = driver.getWindowHandles();
		ArrayList<String> windows = new ArrayList<String>(windowHandle);
		driver.switchTo().window(windows.get(1));
		System.out.println("New window title is : "+driver.getTitle());
		driver.close();
		driver.switchTo().window(windows.get(0));
		System.out.println("Main window title is: "+driver.getTitle());
		
		
		//Find the number of opened tabs
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		Set<String> windowHandle1 = driver.getWindowHandles();
		ArrayList<String> windows1 = new ArrayList<String>(windowHandle1);
		System.out.println("Number of opened windows is : "+windows1.size());
		driver.switchTo().window(windows1.get(1)).close();
		driver.switchTo().window(windows1.get(2)).close();
		driver.switchTo().window(windows1.get(0));
		
		//Close all windows except Primary
		driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
		Set<String> windowHandle2 = driver.getWindowHandles();
		ArrayList<String> windows2 = new ArrayList<String>(windowHandle2);
		System.out.println("Number of opened windows is : "+windows2.size());
		driver.switchTo().window(windows2.get(1)).close();
		driver.switchTo().window(windows2.get(2)).close();
		driver.switchTo().window(windows2.get(3)).close();
		driver.switchTo().window(windows2.get(0));
		
		//Wait for 2 new tabs to open
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		Thread.sleep(3000);
		Set<String> windowHandle3 = driver.getWindowHandles();
		ArrayList<String> windows3 = new ArrayList<String>(windowHandle3);
		System.out.println("Number of opened windows is : "+windows3.size());
		System.out.println(driver.switchTo().window(windows3.get(1)).getTitle());
		System.out.println(driver.switchTo().window(windows3.get(2)).getTitle());
	}

}
