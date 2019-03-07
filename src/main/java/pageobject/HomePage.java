package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public WebDriver driver;
	
	By signin = By.xpath("//div[@class='nav-right']//a[1]");
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	
	public WebElement login() throws InterruptedException
	{
		
		return driver.findElement(signin);
    }
	
	
}
