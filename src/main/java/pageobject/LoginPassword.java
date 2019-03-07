package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPassword {
	
	public WebDriver driver;
     
	
	
	By password = By.name("password");
	//WebElement submit = driver.findElement(By.xpath("//*[@id='passwordNext']/content/span"));
	
	public LoginPassword(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	
	public WebElement password()
	{
		return driver.findElement(password);
	}
	/*public WebElement submit()
	{
		return submit;
	}*/
	

}
