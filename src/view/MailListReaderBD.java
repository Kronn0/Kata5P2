
package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Mail;

public class MailListReaderBD {
    
    private static List<Mail> list = new ArrayList();

    private static Connection connect() {
        String url = "jdbc:sqlite:Kata5.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    
    public static List<Mail> read() {
        String sql = "SELECT MAIL FROM EMAIL";
        try ( Connection conn = connect();  
                Statement stmt = conn.createStatement();  
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                if(Mail.isMail(rs.getString("mail"))){
                list.add(new Mail(rs.getString("Mail")));
                   
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
}


    

