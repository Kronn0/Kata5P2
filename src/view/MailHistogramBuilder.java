package view;


import model.Mail;
import model.Histogram;
import java.util.List;

public class MailHistogramBuilder {
    
    public static Histogram<String> build(List<Mail> mail){
        Histogram<String> histogram = new Histogram();
        mail.forEach((email) -> {
            histogram.increment(email.getDomain());
        });
        return histogram;
    }
    
    
}