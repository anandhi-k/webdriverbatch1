package testscripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotTest {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Course\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.opencart.com/");
		
		driver.findElement(By.name("search")).sendKeys("Laptop");
		
		TakesScreenshot screen = (TakesScreenshot)driver;
		File screenshotfile = screen.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotfile, new File("F:\\Selenium_Course\\ScreenshotImage.png"));
		
		
		

	}

}
