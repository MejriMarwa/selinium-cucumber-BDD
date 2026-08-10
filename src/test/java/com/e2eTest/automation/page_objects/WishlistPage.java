package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class WishlistPage extends BasePage {
	
	/*
	 * Retrieve web element
	 **/
	@FindBy(how = How.CSS, using = "a[class='ico-wishlist'] span[class='cart-label']")
	private static WebElement wishlistBtn;
	
	@FindBy(how = How.CSS, using = ".wishlist-content")
	private static WebElement wishListStatus;


	public WishlistPage() {
		super(Setup.getDriver());
	}
	
	public static WebElement getWishListBtn() {
		return wishlistBtn;
		
	}
	
	public static WebElement getWishListStatus() {
		return wishListStatus;
		
	}
}
