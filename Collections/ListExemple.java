import java.util.ArrayList;
import java.util.List; // liste ordonée avec doublons
public class ListExemple {
    public static void main(String[] args) {
       List<String> noms = new ArrayList<>();
       noms.add("Alice");
       noms.add("Bob");
       noms.add("Charlie");
       noms.add("Alice"); // Ajout d'un doublon
       for (String nom : noms) {
           System.out.println(nom);
       }
    }
}