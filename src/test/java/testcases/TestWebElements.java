package testcases;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
public class TestWebElements {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver= new FirefoxDriver();
        driver.get("http://gmail.com");
        driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       //WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
       Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
    	       .withTimeout(Duration.ofSeconds(30))
    	       .pollingEvery(Duration.ofSeconds(5))
    	       .withMessage("Timeout as the condition is not met")
    	       .ignoring(NoSuchElementException.class);
       
       WebElement username=driver.findElement(By.id("identifierId"));
	    username.sendKeys("trainer@way2automation.com");
	    driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
	    driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("asdfsf");
	    //Thread.sleep(2000);
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"))).sendKeys("asdfsf");
	    driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button")).click();
	   System.out.println(driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/div/div[1]/div/form/span/section[2]/div/div/div[1]/div[2]/div[2]/span")).getText());
	}

}




