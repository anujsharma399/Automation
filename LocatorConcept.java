package naveenautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
    WebDriver driver = new ChromeDriver() ;
  driver.get("https://www.ebay.com/");
  
  driver.findElement(By.xpath("//*[@class='gh-tb ui-autocomplete-input']")).sendKeys("Mobile");
	
  driver.findElement(By.xpath("//*[@id='gh-btn']")).click();
	}
	
	

}
