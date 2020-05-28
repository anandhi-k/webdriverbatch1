package testscripts;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Course\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.opencart.com/");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		//WebDriverWait wait = new WebDriverWait(driver, 15);
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='My Account']"))).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("search"))).sendKeys("Laptop");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.className("input-group-btn"))).click();
		
	}

}
;