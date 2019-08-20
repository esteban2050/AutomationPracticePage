package com.automationpractice.steptostep.exeptions;

public class LoginIncorrect extends AssertionError{
	/**
	 * 
	 * @author Juan Esteban Lopez Giraldo
	 *
	 */
	
	private static final long serialVersionUID=1L;
	
	//Mensaje que sera mostrado cuando el loggeo sea incorrecto
	public static final String LOGGIN_INCORRECT = "No fue posible iniciar sesion";

	public LoginIncorrect(String message, Throwable cause) {
		super(message, cause);
	}
}
