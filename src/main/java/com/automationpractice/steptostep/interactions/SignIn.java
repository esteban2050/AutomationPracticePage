package com.automationpractice.steptostep.interactions;


import com.automationpractice.steptostep.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SignIn implements Interaction{
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(HomePage.SIGN_IN));
	}
	
	public static SignIn onStore() {
		return Tasks.instrumented(SignIn.class);
	}

}
