package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
		public class EdgeBrowser {
			public static void main(String[] args) {
		             WebDriver driver = new EdgeDriver();
                       driver.manage().window().maximize();
		    	        driver.get("https://mydoclab--mdl2qat.sandbox.my.site.com/clinic/s/login/?ec=302&startURL=%2Fclinic%2Fs%2F");

	}

}
