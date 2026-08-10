package com.e2eTest.automation.page_objects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class LoginPage extends BasePage {
	
	/*
	 * Retrieve web element
	 **/
	@FindBy(how = How.CSS, using = ".ico-login")
	private static WebElement loginBarMenu;
	
	@FindBy(how = How.ID, using = "Email")
	private static WebElement inputEmail;
	
	@FindBy(how = How.ID, using = "Password")
	private static WebElement inputPassword;
	
	@FindBy(how = How.XPATH, using = "//input[@value='Log in']")
	private static WebElement btnLogin;
	
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='ichrafbenmohamed@gmail.com']")
	private static WebElement adress_mail;
	
	public LoginPage() {
		super(Setup.getDriver());
	}
	
	public static void openURL(String url) {
		Setup.getDriver().get(url);
	}
	
	public static void clickOnLoginBarMenu() {
		loginBarMenu.click();
	}
	
	public static void fillInputEmail(String email) {
		inputEmail.sendKeys(email);
	}
	
	public static void fillInputPassword(String password) {
		inputPassword.sendKeys(password);
	}
	
	public static void clickOnBtnLogin() {
		btnLogin.click();
	}
	
	public String getAdressEmail() {
		return adress_mail.getText();	
	}



}
