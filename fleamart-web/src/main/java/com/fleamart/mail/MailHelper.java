package com.fleamart.mail;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.fleamart.oglas.ws.Oglas;
import com.fleamart.kategorija.ws.Uporabnik;

public class MailHelper {
	
	final static String FROMNAME = "Fleamart";
	final static String USERNAME = "fleamart007@gmail.com";
	final static String PASSWORD = "fleamart222";
	
	public static boolean sendHtmlMail(String username, String password, String fromAddress, String fromName, List<String> recipients, String subject, String htmlText) {
		final String usernameFinal = username;
		final String passwordFinal = password;
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
		
		Session session = Session.getInstance(props, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(usernameFinal, passwordFinal);
			}
		});
		
		
		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(fromAddress, fromName));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(listToString(recipients)));
			message.setSubject(subject);
			message.setContent(htmlText, "text/html; charset=utf-8");
			
			Transport.send(message);
			return true;
		} catch (AddressException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public static boolean sendCategoryReminder(String category, Uporabnik recipient, Oglas ad) {
		String subject = "Nov oglas v kategoriji "+category+"!";
		StringBuilder text;
		text = new StringBuilder();
		text.append("<p>Dragi(a) "+recipient.getIme().getValue()+",</p>");
		text.append("<p>Želimo vas obvestiti, da je v kategoriji "+category+" bil dodan nov oglas.</p>");
		text.append("<p>Ime oglasa: "+ad.getNaslov()+"<br />");
		text.append("Opis oglasa: "+ad.getOpis()+"<br />");
		if(ad.getSlike().getValue() != null) {
			if(!ad.getSlike().getValue().getString().isEmpty()) {
				text.append("<img src='"+ad.getSlike().getValue().getString().get(0)+"' style='max-height:200px;max-width:200px;' /><br /></p>");
			} else {
				text.append("</p>");
			}
		} else {
			text.append("</p>");
		}
		text.append("<p>Lep pozdrav,<br />");
		text.append("Ekipa Fleamart</p>");
		
		List<String> recipients = new ArrayList<>();
		recipients.add(recipient.getEmail().getValue());
		return sendHtmlMail(USERNAME, PASSWORD, USERNAME, FROMNAME, recipients, subject, text.toString());
	}
	
	private static String listToString(List<String> emails) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < emails.size(); i++) {
			sb.append(emails.get(i));
			if(i != emails.size()-1) {
				sb.append(" ,");
			}
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		com.fleamart.kategorija.ws.ObjectFactory ofu = new com.fleamart.kategorija.ws.ObjectFactory();
		Uporabnik u = ofu.createUporabnik();
		u.setIme(ofu.createUporabnikIme("Gregor"));
		u.setEmail(ofu.createUporabnikEmail("gregor.panic@gmail.com"));
		com.fleamart.oglas.ws.ObjectFactory ofo = new com.fleamart.oglas.ws.ObjectFactory();
		Oglas o = ofo.createOglas();
		o.setNaslov("Izdelek aaaa");
		o.setOpis("OPISSSSSSSSSSSSSS");
		com.fleamart.oglas.ws.ArrayOfstring array = new com.fleamart.oglas.ws.ArrayOfstring();
		array.getString().add("http://www.niu.edu/eshrd/Bike%20Safety/atlas_bike.gif");
		o.setSlike(ofo.createArrayOfstring(array));
		sendCategoryReminder("nekaj", u, o);
		System.out.println("POSLANO");
	}

}
