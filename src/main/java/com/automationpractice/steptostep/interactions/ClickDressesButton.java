package com.automationpractice.steptostep.interactions;

import com.automationpractice.steptostep.userinterfaces.HomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ClickDressesButton implements Interaction{
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(HomePage.DRESSES_BUTTON));
	}
	
	public static ClickDressesButton onDressPage() {
		return Tasks.instrumented(ClickDressesButton.class);
	}

}
