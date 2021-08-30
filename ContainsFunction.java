package naveenautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainsFunction {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}


	public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.ebay.com/");
	
	driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     
    
    driver.findElement(By.xpath("//input[contains(@placeholder,'Search for anything')]")).sendKeys("smartwatches");
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    
driver.findElement(By.xpath("//input[contains(@value,'Search')]")).click();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

driver.findElement(By.xpath("//h3[contains(text(),'Samsung Galaxy Watch Sm-r800')]")).click();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

}
