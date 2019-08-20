package com.automationpractice.steptostep.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;

import com.automationpractice.steptostep.models.LoginData;
import com.automationpractice.steptostep.userinterfaces.HomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LoginOn implements Task {
	
private List<LoginData> user;
	
	public LoginOn(List<LoginData> user) {
		this.user=user;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(						
						 Enter.theValue(user.get(0).getEmail()).into(HomePage.EMAIL),
				         Enter.theValue(user.get(0).getPass()).into(HomePage.PASSWORD),
				         Click.on(HomePage.SIGN_IN_GREEN)
				         );		
	}	

	public static Performable webPage(List<LoginData> user) {
			return instrumented(LoginOn.class,user);
	}

}
