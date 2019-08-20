package com.automationpractice.steptostep.utils;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Properties;

import javax.imageio.ImageIO;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


import javax.mail.Message;


import javax.mail.PasswordAuthentication;

public class takeScreenShot {

	public static void TakePicture()  throws Exception {
		BufferedImage screenshot = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		Thread.sleep(2000);		
		File file = new File("C:/voucher.jpg");
		ImageIO.write(screenshot, "jpg", file);
	}
	
	 public static void SendMail() {
	        Properties props = new Properties();
	        props.put("mail.smtp.auth", "true");
	        props.put("mail.smtp.starttls.enable", "true");
	        props.put("mail.smtp.host", "smtp.gmail.com");
	        props.put("mail.smtp.port", "587");

	        Session session = Session.getInstance(props,
	                new javax.mail.Authenticator() {
	                    protected PasswordAuthentication getPasswordAuthentication() {
	                        return new PasswordAuthentication("ju.eslogi97@gmail.com", "clave");
	                    }
	                });

	        try {

	            Message message = new MimeMessage(session);
	            message.setFrom(new InternetAddress("ju.eslogi@gmail.com"));
	            message.setRecipients(Message.RecipientType.TO,
	                    InternetAddress.parse("ju.eslogi@hotmail.com"));
	            message.setSubject("Prueba");
	            message.setText("Te envio la imagen");

	            Transport.send(message);            

	        } catch (MessagingException e) {
	            throw new RuntimeException(e);
	        }
	    }
}
