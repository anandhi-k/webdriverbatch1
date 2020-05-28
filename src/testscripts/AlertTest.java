package testscripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Course\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///F:/Selenium_Course/Documents/DemoHTMLFiles/AlertBoxDemos.html");

		//Simple Alert
		driver.findElement(By.id("alert")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert Message : "+ alert.getText());
		Thread.sleep(2000);
		alert.accept();
		
		//Confirm Alert
		driver.findElement(By.id("confirm")).click();
		Alert confirm = driver.switchTo().alert();
		System.out.println("Confirm Message : "+ confirm.getText());
		Thread.sleep(2000);
		confirm.dismiss();
		
		//Prompt
		driver.findElement(By.id("prompt")).click();
		Alert prompt = driver.switchTo().alert();
		System.out.println("prompt Message : "+ prompt.getText());
		Thread.sleep(3000);
		prompt.sendKeys("Welcome to selenium");
		prompt.accept();
		
		
	}

}
