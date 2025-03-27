package servlet;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class sendmail {
  String to,from,subject,text;
  public sendmail(String to,String from,String subject,String text)
  {
      this.to=to;
      this.from=from;
      this.subject=subject;
      this.text=text;
  }
 public void sendMail() {

 

//Get the session object
  Properties props = new Properties();
  props.put("mail.smtp.host", "smtp.gmail.com");
  props.put("mail.smtp.socketFactory.port", "465");
  props.put("mail.smtp.socketFactory.class",
        	"javax.net.ssl.SSLSocketFactory");
  props.put("mail.smtp.auth", "true");
  props.put("mail.smtp.port", "465");
 
  Session session = Session.getDefaultInstance(props,
   new javax.mail.Authenticator() {
   protected PasswordAuthentication getPasswordAuthentication() {
   return new PasswordAuthentication(from,"online1995ide");//change accordingly
   }
  });
 
//compose message
  try {
   MimeMessage message = new MimeMessage(session);
   message.setFrom(new InternetAddress(from));//change accordingly
   message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
   message.setSubject(subject);
   message.setText(text);
   
   //send message
   Transport.send(message);

   System.out.println("message sent successfully");
 
  } catch (MessagingException e) {throw new RuntimeException(e);}
 
 }
}