package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroudInput {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/input.xhtml;jsessionid=node01j540a7o52can13p945ps0fry4418339.node0");
		driver.manage().window().maximize();
		//Type your name
		driver.findElement(By.xpath("//div[@class='grid formgrid']//input[@role='textbox']")).sendKeys("Mahadevan Ramasamy");
		//Append Country to this City.
		driver.findElement(By.xpath("//input[@value='Chennai']")).sendKeys("India");
		//Verify if text box is disabled
		boolean enabled = driver.findElement(By.xpath("//input[@disabled='disabled']")).isEnabled();
		if(enabled == true)
		{
			System.out.println("Button is enabled");
		}
		else
		{
			System.out.println("Button is disabled");
		}
		//Clear the typed text.
		driver.findElement(By.xpath("//input[@value='Can you clear me, please?']")).clear();
		//Retrieve the typed text.
		String text = driver.findElement(By.xpath("//input[@value='My learning is superb so far.']")).getAttribute("value");
		System.out.println(text);
		//Type email and Tab. Confirm control moved to next element.
		driver.findElement(By.xpath("//input[@placeholder='Your email and tab']")).sendKeys("mahadevan.it@gmail.com", Keys.TAB);
		//Type about yourself
		driver.findElement(By.xpath("//textarea[@placeholder='About yourself']")).sendKeys("This is Mahadevan");
		//Text Editor
		driver.findElement(By.xpath("(//button[@class='ql-bold'][@type='button'])[1]")).click();
		driver.findElement(By.xpath("//span[@class='ql-color ql-picker ql-color-picker']")).click();
		driver.findElement(By.xpath("//span[@data-value='#9933ff']")).click();
		driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']")).sendKeys("Test whether it typing in Violet color");
		//Just Press Enter and confirm error message*
		driver.findElement(By.xpath("//h5[contains(text(),'Just Press Enter')]/following-sibling::div//input")).sendKeys(Keys.ENTER);
		String text2 = driver.findElement(By.xpath("//span[text()='Age is mandatory']")).getText();
		if(text2.equals("Age is mandatory"))
		{
			System.out.println("Error message is displayed correctly");
		}
		else
		{
			System.out.println("Incorrect error message");
		}
		
		//Custom Toolbar
		driver.findElement(By.xpath("(//button[@class='ql-bold'])[2]")).click();
		driver.findElement(By.xpath("(//button[@class='ql-underline'])[2]")).click();
		driver.findElement(By.xpath("//span[@aria-controls='ql-picker-options-6']")).click();
		driver.findElement(By.xpath("(//span[@data-value='huge'])[2]")).click();
		driver.findElement(By.xpath("//div[@data-placeholder='Enter your content']")).sendKeys("Text should be in bold, underlined & in huge size");
		
		}
}
		
		

	


