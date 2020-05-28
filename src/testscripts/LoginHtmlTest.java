package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginHtmlTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Course\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///F:/Selenium_Course/Documents/DemoHTMLFiles/LoginForm.html");
		driver.findElement(By.xpath("//a[contains(text(),'Google')]")).click();
		driver.navigate().back();
		//driver.findElement(By.xpath("//a[starts-with(@name,'OpenCart')]")).click();
		//driver.navigate().back();
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Tom");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@name='username']")).clear();
		
		driver.findElement(By.xpath("//input[@name='continue' or @value='Login']")).click();
		
	}

}
