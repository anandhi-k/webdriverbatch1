package testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Course\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form/");
		
		//by linktext
		//driver.findElement(By.linkText("Link Test")).click();
		//driver.findElement(By.partialLinkText("Partial")).click();
		
		//By name
		//driver.findElement(By.name("firstname")).sendKeys("John");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("John");
		
		//by id
		//driver.findElement(By.id("lastname")).sendKeys("Peter");
		
		//by cssselector
		
		driver.findElement(By.cssSelector("#lastname")).sendKeys("Peter");
		
		//By classname
		
		//driver.findElement(By.className("btn")).click();
		
		//by tagename
		//driver.findElement(By.tagName("button")).click();
	//	driver.findElement(By.cssSelector("button.btn")).click();
		WebElement gender = driver.findElement(By.id("sex-0"));
		System.out.println("Before click : "+ gender.isSelected());
		gender.click();
		System.out.println("After click : "+ gender.isSelected());
		
		List<WebElement> elements = driver.findElements(By.tagName("input"));
		System.out.println("/number of elemetns : "+ elements.size());
		for(WebElement element : elements) {
			System.out.println(element.getAttribute("id"));
		}
		
		driver.close();
		
	}

}

