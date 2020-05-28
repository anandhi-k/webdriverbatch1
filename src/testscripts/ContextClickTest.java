package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Course\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/tooltip-and-double-click/");
		Actions actions = new Actions(driver);
		WebElement btn = driver.findElement(By.id("rightClickBtn"));
		actions.contextClick(btn).perform();
		System.out.println("Right Clicked");
		driver.findElement(By.xpath("//div[@id='rightclickItem']/div[3]")).click();
		System.out.println("Option selected : "+ driver.switchTo().alert().getText());
	}
}
