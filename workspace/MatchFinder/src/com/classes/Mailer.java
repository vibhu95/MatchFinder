package com.classes;


import java.util.Properties;    
import javax.mail.*;    
import javax.mail.internet.*;    
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;    
public class Mailer{  
    private static Object put;

	public static void send(final String from,final String password,String to,String sub,String msg)throws Exception{  
		//Get properties object    
        
		Properties props = new Properties();    
        try{
		props.put("mail.smtp.host", "smtp.gmail.com");    
        }catch(Exception e){ System.out.println(e);}
		props.put("mail.smtp.socketFactory.port", "465");    
        props.put("mail.smtp.socketFactory.class",    
                  "javax.net.ssl.SSLSocketFactory");    
        props.put("mail.smtp.auth", "true");    
        props.put("mail.smtp.port", "465");    
        //get Session   
        Session session = Session.getDefaultInstance(props,    
         new javax.mail.Authenticator() {    
         protected PasswordAuthentication getPasswordAuthentication() {    
         return new PasswordAuthentication(from,password);  
         }    
        });          
        try {    
           MimeMessage message = new MimeMessage(session);    
           message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));    
           message.setSubject(sub);    
           message.setText(msg);    
           //send message  
           Transport.send(message);    
          } catch (MessagingException e) {throw new RuntimeException(e);}    
             
    }
	public static void main(String ar[]){
		Mailer.send("vibhutinarayan995@gmail.com","pu13/305","vibhutinarayan95@gmail.com","testing","Testing 09:02 am Hello");
	}
}  