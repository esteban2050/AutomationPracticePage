package com.automationpractice.steptostep.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automationpractice.com/index.php")
public class HomePage extends PageObject{

	//LOGGEO
	public static final Target SIGN_IN = Target.the("Button sign in").located(By.xpath("//a[@class='login']"));
	public static final Target EMAIL = Target.the("Input email").located(By.id("email"));
	public static final Target PASSWORD = Target.the("Input password").located(By.id("passwd"));
	public static final Target SIGN_IN_GREEN = Target.the("Button sign in green to go in to the page").located(By.xpath("//p[@class='submit']//span[1]"));
	

	//INSIDE THE PAGE
	public static final Target MY_ACCOUNT_TITLE = Target.the("My account title after loggeo").located(By.xpath("//h1[@class='page-heading']"));
	public static final Target DRESSES_BUTTON = Target.the("The dresses button that is inside the page").located(By.xpath("//body[@id='my-account']/div[@id='page']/div[@class='header-container']/header[@id='header']/div/div[@class='container']/div[@class='row']/div[@id='block_top_menu']/ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[2]/a[1]"));
	public static final Target ADD_TO_CART = Target.the("This button is to add to cart").located(By.xpath("//button[@name='Submit']"));
	public static final Target POCEED_TO_CHEKOUT = Target.the("This button is present after click on purcharse button").located(By.xpath("//a[@class='btn btn-default button button-medium']"));
	public static final Target POCEED_TO_CHEKOUT_CONTINUE = Target.the("This button is to continue with the purchase").located(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']"));
	public static final Target POCEED_TO_CHEKOUT_CONTINUE2 = Target.the("This button is to continue with the purchase").located(By.xpath("//button[@name='processAddress']"));
	public static final Target CHECKBOX_TERMS = Target.the("Checkbox to accept the terms").located(By.id("cgv"));
	public static final Target POCEED_TO_CHEKOUT_CONTINUE3 = Target.the("This button is to continue with the purchase").located(By.xpath("//button[@name='processCarrier']"));
	public static final Target PAY_BY_CHECK = Target.the("One of the payment methods").located(By.xpath("//a[@class='cheque']"));
	public static final Target CONFIRM_BUTTON = Target.the("Button to confirm the purchase").located(By.xpath("//button[@class='button btn btn-default button-medium']"));
    public static final Target PRICE = Target.the("The price of the dresses").located(By.xpath("//div[@class='right-block']//span[@itemprop='price']"));
		
	//CONFIRM PURCHASE
	public static final Target TEXT_TO_CONFIRM_PURCHASE = Target.the("Successful message for the purchase").located(By.xpath("//p[@class='alert alert-success']"));
	
	
}
