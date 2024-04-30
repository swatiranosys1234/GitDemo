package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
    
    public class Calendar {
            
        public static void main(String[] args) throws InterruptedException {    
            
            	
               
                
                WebDriver driver = new ChromeDriver();

       	       driver.manage().window().maximize();
    	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	       
    	       driver.get("https://mydoclab--mdl2qat.sandbox.my.site.com/clinic/s/login/?ec=302&startURL=%2Fclinic%2Fs%2F");
    	       driver.findElement(By.xpath("//input[@id='63:2;a']")).sendKeys("mohit.soni+elitecaremedicalgroupqat@ranosys.com");
    	       Thread.sleep(2000);
    	       driver.findElement(By.xpath("//input[@id='76:2;a']")).sendKeys("Test@1234");
    	       Thread.sleep(2000);
    	       driver.findElement(By.cssSelector("button[type='button']")).click();
    	       driver.findElement(By.xpath("//button[normalize-space()='Doctor Consultations']")).click();
    	       driver.findElement(By.xpath("//a[@title='Add Patient']")).click();
    	       driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Shivangi");
    	       driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Gupta");
    	       driver.findElement(By.xpath("//input[@name='email']")).sendKeys("swati.gupta@ranosys.com");
    	     
    	       
    	       driver.findElement(By.xpath("//input[@name='nationalID']")).sendKeys("JPR123490");
    	       driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("7486694049");
    	       driver.findElement(By.xpath("//textarea[@name='addressLine1']")).sendKeys("Ranosys E-141");
    	       driver.findElement(By.xpath("//textarea[@name='addressLine2']")).sendKeys("Rano E-141");
    	       driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Jaipur Rajasthan");
    	       driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("302033");
    	       driver.findElement(By.xpath("//button[@name='selectedCountry']")).click();
    	       Thread.sleep(1000);

    	       driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='MY']")).click();
    	       Thread.sleep(2000);
    	       
    		          
    	       driver.findElement(By.xpath("//button[@name='selectedState']")).click();
    	       Thread.sleep(2000L);
    	       
    	       
    	       driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Johor']")).click();
    	       Thread.sleep(2000);
    	       
    	       
    	       
    	       driver.findElement(By.xpath("//button[@name='idType']")).click();
    	       Thread.sleep(2000);
    	       driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='1']")).click();
    	       Thread.sleep(2000);
    	       
    	       
    	       
    	     
               driver.findElement(By.xpath("//input[@name='dob']")).sendKeys("7 Mar 2024");
               driver.findElement(By.xpath("//button[@name='countryCode']")).click();
    	       Thread.sleep(1000);
    	       driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='+65']")).click();
    	       Thread.sleep(1000);
               driver.findElement(By.xpath("//button[normalize-space()='Send OTP']")).click();
               Thread.sleep(3000);
               
              
               driver.findElement(By.xpath("//input[@name='otp']")).sendKeys("123456");
    	       Thread.sleep(1000);

    	       
    	       
    	    //  String myWindowHandle=driver.getWindowHandle();
    	   //   driver.switchTo().window(myWindowHandle);
    	       
              driver.findElement(By.xpath("//lightning-button[2]//button[@kx-type='ripple'][1]")).click();
            //    driver.close();
                
        }
}