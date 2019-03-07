package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import RealPackage.RealProject.Testcase1;

public class LoginEmail {
	
	public WebDriver driver;
	
		
	By email = By.xpath("//input[@type='email']");
	By forgot = By.partialLinkText("Forgot");
	By details = By.linkText("Details");
	By otp = By.cssSelector("#continue");
	By change = By.linkText("Change");
	By conditions = By.partialLinkText("Conditions");
	By privacy = By.partialLinkText("Privacy");
	By help = By.partialLinkText("Help");
	
	
	public LoginEmail(WebDriver driver)
	{
	
		this.driver= driver;
		
	}
	
	
	public WebElement email() throws InterruptedException 
	{
		
		return driver.findElement(email);
	}
	
	/*public WebElement submit()
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		WebElement until = wait.until(ExpectedConditions.visibilityOfElementLocated(submit));
		return driver.findElement(submit);
	}*/
	

}
