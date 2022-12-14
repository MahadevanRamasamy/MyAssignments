 package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		WebElement ele = driver.findElement(By.id("txtStationFrom"));
		ele.clear();
		ele.sendKeys("MAS", Keys.ENTER);
		WebElement ele2 = driver.findElement(By.id("txtStationTo"));
		ele2.clear();
		ele2.sendKeys("CBE", Keys.ENTER);
		driver.findElement(By.xpath("//td[@id='tdDateOnly']/input[@id='chkSelectDateOnly']")).click();
		List<WebElement> findElements = driver.findElements(By.xpath("//div[@id='divTrainsList']/table/tbody/tr/td[2]"));
		List<String> trainnames = new ArrayList<String>();
		Set<String> text = new LinkedHashSet<String>();
		int size = findElements.size();
		System.out.println(size);
		for (int i = 0; i < size; i++) 
		{
			String text2 = findElements.get(i).getText();
			trainnames.add(text2);	
		
		}
		Set<String> tnames = new HashSet<String>(trainnames);
		System.out.println(tnames.size());
		if(trainnames.size() == tnames.size())
		{
			System.out.println("Count is matching");
		}
		else
		{
			System.out.println("Count is not matching");

		}
		
		

	}

}
