package testscripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupWinTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Course\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///F:/Selenium_Course/Documents/DemoHTMLFiles/PopUpWinDemo.html");
		
		String parentWin = driver.getWindowHandle();
		
		driver.findElement(By.id("newtab")).click();
		for(String childWin : driver.getWindowHandles()) {
			if(!childWin.equals(parentWin)) {
				driver.switchTo().window(childWin);
				driver.findElement(By.id("alert")).click();
				Alert alert = driver.switchTo().alert();
				Thread.sleep(1000);
				alert.accept();
			}
		}
		driver.switchTo().window(parentWin);
		//driver.close();
		
		driver.findElement(By.id("newwindow")).click();
		for(String childWin : driver.getWindowHandles()) {
			if(!childWin.equals(parentWin)) {
				driver.switchTo().window(childWin);
				break;
			}
		}
			Thread.sleep(2000);
			
			driver.quit();
	}

}
