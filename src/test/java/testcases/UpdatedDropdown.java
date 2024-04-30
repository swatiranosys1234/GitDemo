package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       
	       driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	       driver.findElement(By.id("divpaxinfo")).click();
	       driver.findElement(By.id("hrefIncAdt")).click();
	       driver.findElement(By.id("btnclosepaxoption")).click();

}}
