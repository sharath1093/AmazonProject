	package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static WebDriver driver;
	public Properties prop;
	public String url;
	
	public WebDriver launch() throws IOException
	{
	
	Properties prop = new Properties();
	FileInputStream fis = new FileInputStream("G:\\Workspace\\Projects\\Java Projects\\RealProject\\src\\main\\java\\resources\\data.properties");
    prop.load(fis);
    String browserName=prop.getProperty("browser");
    url=prop.getProperty("url");
            
    if(browserName.equals("chrome"))
    {
      WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
    }


    driver.manage().window().maximize();
    
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    return driver;
       
}
	
	 public void getscreenshot(String result) throws IOException
	    {
	    	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    	FileUtils.copyFile(src,new File("G:\\Screenshots\\"+result+"screenshot.jpeg"));
	    	
	    }
}	
