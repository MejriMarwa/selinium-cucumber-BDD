package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_objects.ElectronicsPage;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;


public class ElectronicsSteps {
	
	ElectronicsPage electronicsPage = new ElectronicsPage();
	
    @When("Je clique sur le bouton Electronics dans le menu")
	public void jeCliqueSurLeBoutonElectronicsDansLeBarMenu() {
    	ElectronicsPage.clickOnElectronicsMenu();
	}
	
	@When("Je clique sur la catégorie")
	public void jeCliqueSurLaCategorie() {
		ElectronicsPage.clickOnCategory();
	}
	
	@When("Je sélectionne un produit Electronics")
	public void jeSelectionneUnProduitElectronics() {
		ElectronicsPage.sélectionnerProduit();
	}

	@When("Je clique sur le bouton")
	public void jeCliqueSurLeBoutonAddCompare() {
		ElectronicsPage.clickButtonAddCompare();
	}

	@Then("Je suis redirigé vers la page Comparaison produit")
	public void jeSuisRedirigeVersLaPage() {
	}
}
