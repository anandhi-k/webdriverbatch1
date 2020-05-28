package testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePageTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Course\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("testing");
		Thread.sleep(1000);
//		element.submit();
//		System.out.println("Title of the page is "+ driver.getTitle());
//		driver.navigate().back();
//		System.out.println("Title of the page after comme Back "+ driver.getTitle());
//		driver.navigate().forward();
//		System.out.println("Title of the page after forward"+ driver.getCurrentUrl());
//		driver.close();
		List<WebElement> eleList=driver.findElements(
				By.xpath("//ul[@role='listbox']//li//descendant::div[@class='sbtc']"));
		for(int i=0; i < eleList.size();i++) {
			System.out.println(eleList.get(i).getText());
			if(eleList.get(i).getText().equalsIgnoreCase("testing tools")) {
				eleList.get(i).click();
				break;
			}
		}
		
	}

}
