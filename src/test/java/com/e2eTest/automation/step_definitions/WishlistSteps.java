package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_objects.WishlistPage;
import com.e2eTest.automation.utils.ActionsUtils;
import com.e2eTest.automation.utils.Validations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WishlistSteps {
	WishlistPage wishlistPage= new WishlistPage();
	ActionsUtils actionsUtils = new ActionsUtils();
	Validations validations = new Validations();

	@When("Je clique sur le bouton wishlist")
	public void jeCliqueSurLeBoutonWishlist() {
		actionsUtils.click(WishlistPage.getWishListBtn());
	}
	
	@Then("Je verifie que le message empty s'affiche {string}")
	public void jeVerifieQueLeMessageEmptySAffiche(String status) {
		validations.assertEquals(WishlistPage.getWishListStatus(), status);
	}
}
