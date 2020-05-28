package testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Course\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		Select select = new Select(driver.findElement(By.id("select-demo")));
		select.selectByValue("Wednesday");
		
		Select mulSelect = new Select(driver.findElement(By.id("multi-select")));
		if(mulSelect.isMultiple()) {
			mulSelect.selectByIndex(2);
			mulSelect.selectByIndex(3);
			mulSelect.selectByIndex(4);
			List<WebElement> values = mulSelect.getOptions();
			int size  = values.size();
			System.out.println("Values are");
			for(int i =0;i<size;i++) {
				System.out.println(values.get(i).getText());
			}
			
			
		}

	}

}
