package testscripts;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryDateTest {

	public static void main(String[] args) throws ParseException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Course\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		driver.findElement(By.xpath("//*[@id='datepicker']")).click();
		String setDatestr="25/04/2020";
		String currDatestr=driver.findElement(By.className("ui-datepicker-title")).getText();
		Date setDate = new SimpleDateFormat("dd/MM/yyyy").parse(setDatestr);
		Date currDate = new SimpleDateFormat("MMMM yyyy").parse(currDatestr);
		String day;
		day = new SimpleDateFormat("dd").format(setDate);
		driver.findElement(By.xpath("//a[text()='"+ Integer.parseInt(day) +"']")).click();
									//a[text()='26']	
	}
	
}
