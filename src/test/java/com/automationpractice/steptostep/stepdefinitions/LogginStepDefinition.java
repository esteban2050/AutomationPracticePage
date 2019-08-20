package com.automationpractice.steptostep.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.automationpractice.steptostep.exeptions.LoginIncorrect;
import com.automationpractice.steptostep.interactions.SignIn;
import com.automationpractice.steptostep.models.LoginData;
import com.automationpractice.steptostep.questions.TheName;
import com.automationpractice.steptostep.tasks.LoginOn;
import com.automationpractice.steptostep.tasks.OpenTheBrowser;
import com.automationpractice.steptostep.userinterfaces.HomePage;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.ClearCookiesPolicy;
import net.thucydides.core.annotations.Managed;

/**
 * 
 * @author Juan Esteban Lopez Giraldo
 *
 */
public class LogginStepDefinition {

	@Managed(driver = "chrome", clearCookies=ClearCookiesPolicy.BeforeEachTest)
	private WebDriver hisDriver;
	
	private Actor Esteban = Actor.named("Esteban");
	
	private HomePage HomePage;
	
	@Before
	public void setUp() {
		Esteban.can(BrowseTheWeb.with(hisDriver));		
	}
	
	@Given("^Esteban goes to the web$")
	public void estebanGoesToTheWeb() throws Exception {
		Esteban.wasAbleTo(OpenTheBrowser.On(HomePage));	   
		hisDriver.manage().window().maximize();
	}
	
	@When("^he clicks in the login button$")
	public void heClicksInTheLoginButton() throws Exception {
	    Esteban.wasAbleTo(SignIn.onStore());
	}
	
	@And("^enter the credentials$")
	public void enter_the_credentials(List<LoginData> data) throws Exception {		
		Esteban.attemptsTo(SignIn.onStore());
		JavascriptExecutor js = (JavascriptExecutor)hisDriver;
		js.executeScript("window.scroll(0, 180);");
	    Esteban.attemptsTo(LoginOn.webPage(data));
	}
	
	@Then("^he should see his user on the page$")
	public void heShouldSeeHisUserOnThePage() throws Exception {
	    Esteban.should(seeThat(TheName.successful(), is("MY ACCOUNT")).orComplainWith(LoginIncorrect.class, LoginIncorrect.LOGGIN_INCORRECT));
	    
	}

}
