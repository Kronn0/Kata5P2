
package model;

public class Mail {
    
    private final String mail;

    public Mail(String mail){
        this.mail = mail;
    }

    public String getDomain() {
        String domain = mail.substring(this.mail.indexOf("@")+1);
        return domain;
        
    }
    
    public static boolean isMail(String line){
        return line.matches("^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$");
    
    } 
}
