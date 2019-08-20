package com.automationpractice.steptostep.questions;

import com.automationpractice.steptostep.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheName implements Question <String> {

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(HomePage.MY_ACCOUNT_TITLE).viewedBy(actor).asString();
	}

	public static TheName successful() {
		return new TheName();
	}
}
