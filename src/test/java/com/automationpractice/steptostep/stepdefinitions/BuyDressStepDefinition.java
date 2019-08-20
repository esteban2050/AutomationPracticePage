package com.automationpractice.steptostep.stepdefinitions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.automationpractice.steptostep.interactions.ClickDressesButton;
import com.automationpractice.steptostep.tasks.ProcessToSendEmail;
import com.automationpractice.steptostep.userinterfaces.HomePage;
import com.automationpractice.steptostep.userinterfaces.HotmailPage;
//import com.automationpractice.steptostep.utils.ActionOnImages
import com.automationpractice.steptostep.utils.MostExpensiveDress;
import com.automationpractice.steptostep.utils.takeScreenShot;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Scroll;
import net.thucydides.core.annotations.Managed;

/**
 * 
 * @author Juan Esteban Lopez Giraldo
 *
 */

public class BuyDressStepDefinition {

	@Managed(driver = "chrome")
	private WebDriver hisDriver;
	
	private HotmailPage HotmailPage;
	
	private Actor Esteban = Actor.named("Esteban");	
	public static String filepath = "src/test/resources/images"; 
	
	@Before
	public void setUp() {
		Esteban.can(BrowseTheWeb.with(hisDriver));		
	}
	
	@Given("^esteban clicks the dresses button$")
	public void estebanClicksTheDressesButton() throws Exception {
	    Esteban.attemptsTo(ClickDressesButton.onDressPage());
	}
	
	@When("^find the most expensive dress$")
	public void findTheMostExpensiveDress() throws Exception {
		Esteban.attemptsTo(Scroll.to(HomePage.PRICE));	
		Thread.sleep(2000);
		MostExpensiveDress.VestidoCaro(hisDriver);		
	}
	
	@And("^make the purchase process$")
	public void makeThePurchaseProcess() throws Exception {
	    JavascriptExecutor js = (JavascriptExecutor)hisDriver;
		js.executeScript("window.scroll(0, 180);");
		Esteban.attemptsTo(Click.on(HomePage.ADD_TO_CART));
		Esteban.attemptsTo(Click.on(HomePage.POCEED_TO_CHEKOUT));
		js.executeScript("window.scroll(0, 190);");
		Esteban.attemptsTo(Click.on(HomePage.POCEED_TO_CHEKOUT_CONTINUE));
		js.executeScript("window.scroll(0, 190);");
		Esteban.attemptsTo(Click.on(HomePage.POCEED_TO_CHEKOUT_CONTINUE2));
		js.executeScript("window.scroll(0, 180);");
		Esteban.attemptsTo(Click.on(HomePage.CHECKBOX_TERMS));
		Esteban.attemptsTo(Click.on(HomePage.POCEED_TO_CHEKOUT_CONTINUE3));
		js.executeScript("window.scroll(0, 190);");
		Esteban.attemptsTo(Click.on(HomePage.PAY_BY_CHECK));
		js.executeScript("window.scroll(0, 190);");
		Esteban.attemptsTo(Click.on(HomePage.CONFIRM_BUTTON));
		js.executeScript("window.scroll(0, 230);");
		takeScreenShot.TakePicture();
		//takeScreenShot.SendMail();
	}
	@Then("^send the proof of payment$")
	public void sendTheProofOfPayment() throws Exception {
		Esteban.wasAbleTo(Open.browserOn(HotmailPage));
		Esteban.attemptsTo(ProcessToSendEmail.ToAnotherPerson());
	    Thread.sleep(2000);
//		ActionOnImages.clickImage("CDESKTOP", filepath);
//		ActionOnImages.type("disc");
//		ActionOnImages.writeEnterKey();
//		ActionOnImages.clickImage("PROGRAM_FILES.png", filepath);
//		ActionOnImages.type("expensive");
//		ActionOnImages.writeEnterKey(); 
	}
}
