
import java.util.Properties;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Store;



// Tutorial
// https://old.chuidiang.org/java/herramientas/javamail/leer-correo-javamail.php
public class Email {


    private String de;
    private String asunto;
    private String mensaje;

    public Email(String de, String asunto, String mensaje){
        this.de = de;
        this.asunto = asunto;
        this.mensaje = mensaje;
    }

    public Email(){

    }    

    public String getDe() {
        return de;
    }

    public void setDe(String de) {
        this.de = de;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }


    public void leerEmail(Boolean asistencia) throws MessagingException{

    Asistente asistente = new Asistente();  

   
    Properties prop = new Properties();

// Deshabilitamos TLS
prop.setProperty("mail.pop3.starttls.enable", "false");

// Hay que usar SSL
prop.setProperty("mail.pop3.socketFactory.class","javax.net.ssl.SSLSocketFactory" );
prop.setProperty("mail.pop3.socketFactory.fallback", "false");

// Puerto 995 para conectarse.
prop.setProperty("mail.pop3.port","995");
prop.setProperty("mail.pop3.socketFactory.port", "995");

Session sesion = Session.getInstance(prop);
sesion.setDebug(true);

Store store = sesion.getStore("pop3");
store.connect("pop.gmail.com","miniretodaw@gmail.com","zjhq kkit dmrc zmf");
Folder folder = store.getFolder("INBOX");
folder.open(Folder.READ_ONLY);

// obtener los mensajes en un array
Message [] mensajes = folder.getMessages();


for (int i=0;i<mensajes.length;i++)
{
    if (mensajes[i] !=null) {
   System.out.println("From:"+mensajes[i].getFrom()[0].toString());
   System.out.println("Subject:"+mensajes[i].getSubject());
    }
}
    }

}