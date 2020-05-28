package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Course\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.stqatools.com/demo/DoubleClick.php");
		
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		WebElement btn = driver.findElement(By.xpath("//button[contains(text(),'Double')]"));
		action.doubleClick(btn).perform();

	}

}
