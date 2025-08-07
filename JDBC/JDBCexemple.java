import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
public class JDBCexemple {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/credit_card_database";
        String user = "root";
        String password = "password";
        try(
            Connection cnx = DriverManager.getConnection(url, user, password);
            Statement stmt = cnx.createStatement();
            ResultSet rslt = stmt.executeQuery("SELECT * FROM clients")
        ) {
            while(rslt.next()) {
                System.out.println(
                    "client_id : " + rslt.getInt("client_id") +
                    ", sex : " + rslt.getString("sex") +
                    ", education : " + rslt.getString("education") +
                    ", marriage : " + rslt.getInt("marriage") + 
                    ", age : " + rslt.getInt("age")
                );
            }
          } catch(Exception e) {
            e.printStackTrace();
            }
    }
}
