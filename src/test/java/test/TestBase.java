package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
public static WebDriver driver ; 

@BeforeSuite
 public void StartDriver () {
	String FireFoxPath = System.getProperty("user.dir")+"/drivers/geckodriver.exe";
	
	System.setProperty("webdriver.gecko.driver",FireFoxPath );
	driver = new FirefoxDriver();
	
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	driver.navigate().to("https://demo.nopcommerce.com/");
	
}

@AfterSuite 
public void CloseDriver () {
	
	driver.quit();
	
	
}
	
	
	
}
