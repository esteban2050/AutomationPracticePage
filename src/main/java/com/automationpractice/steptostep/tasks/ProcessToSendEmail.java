package com.automationpractice.steptostep.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.automationpractice.steptostep.userinterfaces.HotmailPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class ProcessToSendEmail implements Task{
	
	@Override
	public <T extends Actor> void performAs(T actor) {		
		if(HotmailPage.BUTTON_LOGGIN_HOTMAIL.resolveFor(actor).isDisplayed())
			actor.wasAbleTo(Click.on(HotmailPage.BUTTON_LOGGIN_HOTMAIL));
		    
		actor.wasAbleTo(Enter.theValue("ju.eslogi97@hotmail.com").into(HotmailPage.EMAIL_HOTMAIL),
					 	   Click.on(HotmailPage.BUTTON_NEXT),
						   Enter.theValue("1037655996j").into(HotmailPage.PASS_HOTMAIL),
						   Click.on(HotmailPage.BUTTON_SIG_IN),
						   Click.on(HotmailPage.NEW_MESSAGE),
						   Enter.theValue("ju.eslogi97@hotmail.com").into(HotmailPage.FOR),
						   Enter.theValue("PRUEBA").into(HotmailPage.SUBJECT),
						   Click.on(HotmailPage.ADD),
						   Click.on(HotmailPage.BUTTON_EXAMINE));
	}
	
	public static ProcessToSendEmail ToAnotherPerson() {
		return instrumented(ProcessToSendEmail.class);
	}

}
