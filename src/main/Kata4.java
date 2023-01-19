
package main;

import java.util.List;
import model.*;
import view.*;

public class Kata4 {

    private static String fileName;
    private static List<Mail> mailList;
    private static Histogram<String> histogram;
    private static HistogramDisplay histogramdisplay;

    public static void main(String[] args) {
        fileName = "email.txt";
        execute();
    }

    private static void execute() {
        input();
        process();
        output();
    }

    private static void input() {
         mailList = MailListReaderBD.read();
    }

    private static void process() {
         histogram = MailHistogramBuilder.build(mailList);
    }

    private static void output() {
        histogramdisplay = new HistogramDisplay(histogram, "Histograma");
        histogramdisplay.execute();
    }
}
