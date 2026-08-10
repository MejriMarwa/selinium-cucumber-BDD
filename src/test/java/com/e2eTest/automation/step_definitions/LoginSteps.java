package com.e2eTest.automation.step_definitions;

import org.junit.jupiter.api.Assertions;

import com.e2eTest.automation.page_objects.LoginPage;
import com.e2eTest.automation.utils.ConfigFileReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	LoginPage loginPage= new LoginPage();
	ConfigFileReader configFileReader=new ConfigFileReader();

	@Given("Je me connecte sur le site Demo Web Shop")
	public void jeMeConnecteSurLeSiteDemoWebShop() {
		LoginPage.openURL(configFileReader.getProperty("home.url"));
	 }
	
	@When("Je clique sur le bouton log in")
	public void jeCliqueSurLeBoutonLogIn() {
		LoginPage.clickOnLoginBarMenu();
	   
	}
	@When("Je saisis une adresse email")
	public void jeSaisisUneAdresseEmail() {
		LoginPage.fillInputEmail(configFileReader.getProperty("home.email"));
	   
	}
	@When("Je saisis le mot de passe")
	public void jeSaisisLeMotDePasse() {
		LoginPage.fillInputPassword(configFileReader.getProperty("home.password"));
	   
	}
	@When("Je clique sur le bouton login")
	public void jeCliqueSurLeBoutonLogin() {
		LoginPage.clickOnBtnLogin();
	    
	}
	@Then("Je me redirige vers la page home {string}")
	public void jeMeRedirigeVersLaPageHome(String adressEmail) throws InterruptedException {
	Thread.sleep(3000);
	Assertions.assertEquals(loginPage.getAdressEmail(), adressEmail);
	}

}
