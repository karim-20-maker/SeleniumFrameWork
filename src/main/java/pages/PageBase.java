package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {

protected WebDriver driver ; 
public JavascriptExecutor Jse ;

public PageBase (WebDriver driver) {
	
	PageFactory.initElements(driver, this);
	
	
}
protected static  void clickBottun(WebElement Bottun) {
	
	Bottun.click();}
	
protected static void SetText(WebElement Text , String value)	{
	
	Text.sendKeys(value);
}
	
public void ScrollDown () {
	Jse.executeScript("scrollBy(0,2500)");

}







 

	
	
	
	
	
	
	
	
	
}
