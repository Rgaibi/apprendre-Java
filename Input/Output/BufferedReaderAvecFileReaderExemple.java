import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class BufferedReaderAvecFileReaderExemple {
    public static void main (String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("log.txt"))) {
            String ligne;
            while((ligne = reader.readLine()) !=null) {
                System.out.println(ligne);
            }
        } catch (IOException e) {
            e.printStackTrace();
          }
    }   
}