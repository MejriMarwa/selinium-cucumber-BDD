package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;


import org.openqa.selenium.interactions.Actions;
public class ElectronicsPage extends BasePage {
	
	/*
	 * Retrieve web element
	 **/
	
    @FindBy(how = How.XPATH, using = "//ul[@class='top-menu']//a[normalize-space()='Electronics']")
	private static WebElement electronicsBarMenu;
    
    @FindBy(how = How.XPATH, using = "//ul[@class='top-menu']//a[normalize-space()='Camera, photo']")
	private static WebElement cameraPhotoBarMenu;
    
    @FindBy(how = How.XPATH, using = "//img[@title='Show details for 1MP 60GB Hard Drive Handycam Camcorder']")
	private static WebElement selectProduit;
    
    
    @FindBy(how = How.XPATH, using = "//input[@value='Add to compare list']")
	private static WebElement btnAddTocompare;
	
    
    public ElectronicsPage() {
		super(Setup.getDriver());
	}
	
    public static void openURL(String url) {
		Setup.getDriver().get(url);	
	}
	
    public static void clickOnElectronicsMenu() {
    	electronicsBarMenu.click();
    }
    
    public static void clickOnCategory() {
    	 // Créer l'objet Actions
        Actions actions = new Actions(Setup.getDriver());
       
        // Faire un hover sur Electronics
        actions.moveToElement(electronicsBarMenu).perform();

    	cameraPhotoBarMenu.click();
    }
    
    public static void sélectionnerProduit() {
    	selectProduit.click();
    }
    
    public static void clickButtonAddCompare() {
    	btnAddTocompare.click();
    }
	

}
