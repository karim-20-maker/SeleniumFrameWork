package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Contactus;
import pages.HomePage;
import pages.RegisterationPage;


public class TestRegisteration extends TestBase {

	HomePage HomeObj ; 
	RegisterationPage registObj ;
	Contactus contactObj ;
	String name = "karim" ;
	String mail = "fcBarcelona@teo.com";
	String pass = "123456";
	String message = "just test";
	String lastname = "ahmed";

	@Test 
	public void UserCanRedirsctTORegisterationPageSuccessfully () {

		registObj = new RegisterationPage(driver);
		HomeObj= new HomePage(driver);
		HomeObj.OpenRegisterationLink();
		Assert.assertEquals(registObj.RegistMessage.getText(), "Your Personal Details");
	}

	@Test  (dependsOnMethods = "UserCanRedirsctTORegisterationPageSuccessfully")
	public void UserCanREgisterSuccessfuuly() { 

		registObj = new RegisterationPage(driver);
		registObj.userRegisterationMethod(name, lastname, mail, pass);
		Assert.assertEquals(registObj.SuccessMessage.getText(), "Your registration completed");
		registObj.pressConteniu();
	}


	@Test(dependsOnMethods = "UserCanREgisterSuccessfuuly")
	public void clickOnContactUs () {
		HomeObj = new HomePage(driver);
		HomeObj.OpenContactUsPage();



	}

	@Test(dependsOnMethods = "clickOnContactUs")
	public void UCanContactUsNow() {
		contactObj = new Contactus(driver);
		contactObj.YOUCanContactUsSuccessfully(name, mail, message);
		Assert.assertEquals(contactObj.AssertContact.getText(), "Contact Us");
	}

	@Test(dependsOnMethods = "UCanContactUsNow")
	public void SoHeCanLogoutNow () {

		registObj = new RegisterationPage(driver);
		registObj.logoutAfterRegisteration();
		Assert.assertEquals(registObj.logoutAssert.getTagName(), "a");

	}





}
