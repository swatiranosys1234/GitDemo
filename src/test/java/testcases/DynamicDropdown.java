package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       
	       driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	       driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	       driver.findElement(By.xpath("//a[@value='BLR']")).click();
	       driver.findElement(By.xpath("//a[@value='MAA']")).click();

	
	
	
	}

}
