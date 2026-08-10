package com.e2eTest.automation.step_definitions;


import com.e2eTest.automation.page_objects.RegistrationPage;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class RegistrationSteps {
	
	RegistrationPage registrationPage = new RegistrationPage();
	
	@When("Je clique sur le bouton register dans le barMenu")
	public void jeCliqueSurLeBoutonRegisterDansLeBarMenu() {
		RegistrationPage.clickOnRegisterBarMenu();
	}

	@When("Je choisis le genre")
	public void jeChoisisLeGenre() {
		RegistrationPage.checkGender();
	}
	@When("Je saisis le prenom {string}")
	public void jeSaisisLePrenom(String firstName) {
		RegistrationPage.fillInputFirstName(firstName);
	}
	@When("Je saisis le nom {string}")
	public void jeSaisisLeNom(String lastName) {
		RegistrationPage.fillInputLastName(lastName);
	}
	@When("Je saisis adresse mail {string}")
	public void jeSaisisAdresseMail(String adressMail) {
		RegistrationPage.fillInputEmail(adressMail);
	}
	@When("Je saisis un mot de passe {string}")
	public void jeSaisisUnMotDePasse(String password) {
		RegistrationPage.fillInputPassword(password);
	}
	@When("Je ressaisis le mot de passe {string}")
	public void jeRessaisisLeMotDePasse(String password) {
		RegistrationPage.fillInputConfirmedPassword(password);  
	}
	@When("Je clique sur le bouton register")
	public void jeCliqueSurLeBoutonRegister() {
		RegistrationPage.clickOnBtnRegister(); 
	}
	@Then("Je me redirige vers la page de confirmation de registration")
	public void jeMeRedirigeVersLaPageDeConfirmationDeRegistration() { 
	}

}
