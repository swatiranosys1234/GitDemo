package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       
	       driver.get("https://rahulshettyacademy.com/locatorspractice/");
	       driver.findElement(By.id("inputUsername")).sendKeys("Swati");
	       driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");	
	       Thread.sleep(2000);
	       driver.findElement(By.className("signInBtn")).click();
	       System.out.println(driver.findElement(By.cssSelector("div[class='login-container'] p")).getText());
	       //Assert.assertEquals((driver.findElement(By.tagName("p")).getText()),"You are successfully logged in.");
	      
	       driver.findElement(By.cssSelector("button.logout-btn")).click();


	}

}
