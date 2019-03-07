package RealPackage.RealProject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobject.HomePage;
import pageobject.LoginEmail;
import pageobject.LoginPassword;
import resources.Base;

public class Testcase1 extends Base {
	
	@BeforeTest
	public void beforetest() throws IOException
	{
		driver = launch();
		driver.get(url);
	}

		//@Test(dataProvider="getdata")
	@Test
public void launchtc1() throws IOException, InterruptedException
{
			
	HomePage hp = new HomePage(driver);
	hp.login().click();
	LoginEmail le = new LoginEmail(driver);
	le.email().sendKeys("vsharat10@gmail.com");
	le.email().sendKeys(Keys.ENTER);
	LoginPassword lp = new LoginPassword(driver);
	lp.password().sendKeys("chenvin1");
	lp.password().sendKeys(Keys.ENTER);

}
	

	@AfterTest
	public void aftertest()
	{
		driver.close();
		driver=null;
	}

/*@DataProvider
public Object[][] getdata()
{
	Object[][] data = new Object[2][2];
	data[0][0] = "vsharat10@gmail.com";
	data[0][1] = "chenvin1";
	
	
	data[1][0] = "vsharat93@gmail.com";
	data[1][1] = "chenvin1";
	
	return data;
	
}*/



}
