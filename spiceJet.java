package naveenautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class spiceJet {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	    WebDriver driver = new ChromeDriver() ;
	  driver.get("https://www.spicejet.com/");
	  Select select = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")));
	        select.selectByVisibleText("Gwalior (GWL)");

	}

}
