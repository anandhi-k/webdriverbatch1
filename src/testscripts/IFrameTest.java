package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Course\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames");
		
		String lblValue = driver.findElement(By.xpath("//label/span")).getText();
		System.out.println(lblValue);
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello Welcome");

		WebElement frame3 = driver.findElement(By.xpath("//iframe[@id='frame3']"));
		
		//driver.switchTo().frame(frame3);
		driver.switchTo().frame(0);
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		if(!checkbox.isSelected()) {
			checkbox.click();
		}
		//from frame3 to frame1
		driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath("//input[@type='text']")).clear();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Clicked checkbox");
		
		driver.switchTo().defaultContent();
		System.out.println("After coming back : "+driver.findElement(By.xpath("//label/span")).getText());
			
	}

}
