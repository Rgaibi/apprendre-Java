import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
public class FilewriterExemple {
    public static void main (String[] args) {
        String message = "utilisateur connecté : karim";
        try(FileWriter writer = new FileWriter("log.txt", true)) {
            writer.write(LocalDateTime.now()+" - "+message+"\n");
            System.out.println("log enregistré");
        } catch(IOException e) {
            e.printStackTrace();
          }

        
    }
}