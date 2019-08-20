package com.automationpractice.steptostep.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://hotmail.com")
public class HotmailPage extends PageObject{
	
	//CORREO
		public static final Target BUTTON_LOGGIN_HOTMAIL = Target.the("Principal button in hotmail page").located(By.xpath("//a[@class='linkButtonSigninHeader']"));
		public static final Target EMAIL_HOTMAIL = Target.the("Input email of hotmail").located(By.id("i0116"));
		public static final Target BUTTON_NEXT = Target.the("Button next on hotmail").located(By.id("idSIButton9"));
		public static final Target PASS_HOTMAIL = Target.the("Input password of hotmail").located(By.id("i0118"));
		public static final Target BUTTON_SIG_IN = Target.the("Button to sig in").located(By.id("idSIButton9"));
		public static final Target NEW_MESSAGE = Target.the("Button to send a new message").located(By.xpath("//button[@class='ms-Button _2niWxMBunlZ9hZHAWvmh4N ms-Button--action ms-Button--command root-53']//div[@class='ms-Button-flexContainer flexContainer-54']"));
		public static final Target FOR = Target.the("The person who is going to receive the email").located(By.xpath("//input[@class='ms-BasePicker-input pickerInput_ecad0f63']"));
		public static final Target SUBJECT = Target.the("The subject of email").located(By.id("subjectLine0"));
		public static final Target ADD = Target.the("Button to add some files").located(By.xpath("//div[@class='ms-FocusZone css-41 ms-CommandBar root-136']//button[@name='Adjuntar']"));
		public static final Target BUTTON_EXAMINE = Target.the("Button to examine the pc").located(By.xpath("//span[contains(text(),'Examinar este equipo')]"));

}
