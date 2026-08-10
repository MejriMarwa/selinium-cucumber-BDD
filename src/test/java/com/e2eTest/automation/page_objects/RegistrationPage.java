package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class RegistrationPage extends BasePage {
	
	/*
	 * Retrieve web element
	 **/
	@FindBy(how = How.CSS, using = ".ico-register")
	private static WebElement registerBarMenu;
	
	@FindBy(how = How.ID, using = "gender-female")
	private static WebElement gender;
	
	@FindBy(how = How.ID, using = "FirstName")
	private static WebElement inputFirstName;
	
	@FindBy(how = How.ID, using = "LastName")
	private static WebElement inputLastName;
	
	@FindBy(how = How.ID, using = "Email")
	private static WebElement inputEmail;
	
	@FindBy(how = How.ID, using = "Password")
	private static WebElement inputPassword;
	
	@FindBy(how = How.ID, using = "ConfirmPassword")
	private static WebElement inputConfirmedPassword;
	
	@FindBy(how = How.ID, using = "register-button")
	private static WebElement btnRegister;
	
	public RegistrationPage() {
		super(Setup.getDriver());
	}
	
	public static void openURL(String url) {
		Setup.getDriver().get(url);	}
	
	public static void clickOnRegisterBarMenu() {
		registerBarMenu.click();
	}
	
	public static void checkGender() {
		gender.click();
	}
	
	public static void fillInputFirstName(String firstName) {
		inputFirstName.sendKeys(firstName);
	}
	
	public static void fillInputLastName(String lastName) {
		inputLastName.sendKeys(lastName);
	}
	
	public static void fillInputEmail(String email) {
		inputEmail.sendKeys(email);
	}
	
	public static void fillInputPassword(String password) {
		inputPassword.sendKeys(password);
	}
	
	public static void fillInputConfirmedPassword(String confirmedPassword) {
		inputConfirmedPassword.sendKeys(confirmedPassword);
	}
	
	public static void clickOnBtnRegister() {
		btnRegister.click();
	}


}