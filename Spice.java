package naveenautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spice {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("https://www.spicejet.com/");
			//following address is for triangular drop down button 
			WebElement list = driver.findElement(By.xpath("//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']"));
			list.click();
			
			 WebElement optAmritsar = driver.findElement(By.xpath("//a[contains(.,'Gwalior (GWL)')]"));
			 optAmritsar.click();
			 
			 WebElement list1 = driver.findElement(By.xpath("//span[@id='ctl00_mainContent_ddl_destinationStation1_CTXTaction']"));
				list1.click();
				
				 WebElement optAmritsar1 = driver.findElement(By.xpath("//a[contains(.,'Bengaluru (BLR)')]"));
				 optAmritsar1.click();
				 
			
			/*
			 * WebDriverWait wait=new WebDriverWait(driver, 10);
			 * wait.until(ExpectedConditions.elementToBe(list));
			 */
			/*
			 * Select sel = new Select(list); sel.selectByIndex(2);
			 */
			//list.click();
			
			
		}
	}

}
