package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterationPage extends PageBase{

	public RegisterationPage(WebDriver driver) {
		super(driver);

	}

	



	@FindBy (id = "gender-male")
	WebElement genderBotton;

	@FindBy (id = "FirstName")
	WebElement InsertYourName;

	@FindBy(id = "LastName")
	WebElement insertYourLastName;

	@FindBy(id = "Email")
	WebElement INsertYourValidEmail;

	@FindBy (id = "Password")
	WebElement INsertStrongPass;

	@FindBy (id = "ConfirmPassword")
	WebElement ConfirmPass;

	@FindBy (id = "register-button")
	WebElement RegisterBtn;

	@FindBy (css = "div.result")
	public WebElement SuccessMessage;//3mlth public 3shan ana h3ml assertion fel test

	@FindBy(linkText = "Log out")
	public WebElement logout ;
	
	@FindBy (css = "a.ico-login")
	public WebElement logoutAssert;
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[1]/strong")
	public WebElement RegistMessage ;
	
@FindBy (xpath = "/html/body/div[6]/div[3]/div/div/form/div/div[2]/div[2]/input")
WebElement continuea ;


	public void userRegisterationMethod(String firestName , String lastName , String Email , String pass) {

		clickBottun(genderBotton);
		SetText(InsertYourName, firestName);
		SetText(insertYourLastName, lastName);
		SetText(INsertYourValidEmail, Email);
		SetText(INsertStrongPass, pass);
		SetText(ConfirmPass, pass);
		clickBottun(RegisterBtn);

	}
	public void logoutAfterRegisteration () {
		clickBottun(logout);

	}

public void pressConteniu () {
	
	
	clickBottun(continuea);
}


}

