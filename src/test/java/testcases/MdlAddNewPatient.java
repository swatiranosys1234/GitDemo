package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class MdlAddNewPatient {

	
	
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver= new ChromeDriver();
	        driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       driver.get("https://mydoclab--mdl2qat.sandbox.my.site.com/clinic/s/login/?ec=302&startURL=%2Fclinic%2Fs%2F");
	       driver.findElement(By.xpath("//input[@id='63:2;a']")).sendKeys("mohit.soni+elitecaremedicalgroupqat@ranosys.com");
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//input[@id='76:2;a']")).sendKeys("Ranosys@1234");
	       Thread.sleep(2000);
	       driver.findElement(By.cssSelector("button[type='button']")).click();
	       driver.findElement(By.xpath("//button[normalize-space()='Doctor Consultations']")).click();
	       driver.findElement(By.xpath("//a[@title='Add Patient']")).click();
	       driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Shivangi");
	       driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Gupta");
	       driver.findElement(By.xpath("//input[@name='email']")).sendKeys("swati.gupta@ranosys.com");
	       driver.findElement(By.id("combobox-button-18")).sendKeys("Eesti");
	       
	       driver.findElement(By.xpath("//input[@name='nationalID']")).sendKeys("JPR123490");
	       driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9011760717");
	       driver.findElement(By.xpath("//textarea[@name='addressLine1']")).sendKeys("Ranosys E-141");
	       driver.findElement(By.xpath("//textarea[@name='addressLine2']")).sendKeys("Rano E-141");
	       driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Jaipur Rajasthan");
	       driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("302033");
	       driver.findElement(By.xpath("//button[normalize-space()='Send OTP']")).click();
		}
	       
		
		
		}



	





	

