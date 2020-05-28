package testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JSExecTest {
	public static void main(String arg[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Course\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Datepicker.html");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		//js.executeScript("alert('Hello Welcome');");
//		WebElement searchbox = driver.findElement(By.name("search"));
//		searchbox.sendKeys("Laptop");
//		Thread.sleep(1000);
//		driver.findElement(By.className("input-group-btn")).click();
//		
//		String pagetitle = js.executeScript("return document.title").toString();
//		System.out.println("Search Result Page title : "+ pagetitle);
		
		//js.executeScript("window.scrollBy(500,900)");
		
//		WebDriverWait wait = new WebDriverWait(driver, 60);
//		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("astrologywidget")));
//		//driver.findElement(By.id("astrologywidget"));
		
//		String domainname = js.executeScript("return document.domain").toString();
//		System.out.println("Domain name : " + domainname);
//		Thread.sleep(1000);
//		js.executeScript("history.go(-1)");
		js.executeScript("document.querySelector('#datepicker1').value='01/05/2019'");
		
	}
}
