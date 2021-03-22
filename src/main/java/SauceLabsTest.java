import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SauceLabsTest {
	
	
	public static final String USERNAME = ("minhaj6969");
	public static final String ACCESS_KEY =("75ccf240-dbef-4622-9b63-707e75765388");
	public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.us-east-1.saucelabs.com/wd/hub";

	public static void main(String[] args) throws Throwable {
		
		
		DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platform", "Windows 10");
        caps.setCapability("version", "latest");
        caps.setCapability("name", "googleTest");
        
        
      // WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
        System.setProperty("webdriver.gecko.driver","./Browser/geckodriver");
        WebDriver driver = new FirefoxDriver(); //only for the local test
        
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
        driver.findElement(By.name("q")).sendKeys("Automation step by step");
        driver.findElement(By.name("btnK")).click();
        System.out.println(driver.getTitle());
        
        driver.quit();
        System.out.println("Test completed");

		
		
		

	}

}
