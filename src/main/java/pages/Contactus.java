package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Contactus extends PageBase {

	public Contactus(WebDriver driver) {
		super(driver);
	
	}

	@FindBy(id = "FullName")
	WebElement ContactsName;
	
	@FindBy (id = "Email")
	WebElement contactsmail;
	
	@FindBy(id = "Enquiry")
	WebElement yourMessage;
	
	@FindBy (css = "input.button-1.contact-us-button")
	WebElement ContactBtn ;
	
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[1]/h1")
	public WebElement AssertContact;
	
	
	
	public void YOUCanContactUsSuccessfully( String name , String  mail , String message) {
		
		SetText(ContactsName, name);
		SetText(contactsmail, mail);
		SetText(yourMessage, message);
		clickBottun(ContactBtn);
		
		
	}
	
	
	
	
	
}
