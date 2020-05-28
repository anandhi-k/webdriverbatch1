package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ControlKeyTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Course\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.opencart.com");
		WebElement searchbox = driver.findElement(By.name("search"));
		searchbox.sendKeys("Phone");
		driver.findElement(By.xpath("//*[@id='search']/span/button")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id='search']/span/button")).sendKeys(Keys.PAGE_DOWN);
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='search']/span/button")).sendKeys(Keys.PAGE_UP);
		Thread.sleep(1000);
		searchbox = driver.findElement(By.name("search"));
		searchbox.sendKeys(Keys.BACK_SPACE);
	}

}
