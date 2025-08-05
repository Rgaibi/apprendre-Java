import java.util.Map;
import java.util.HashMap; // Map pour stocker des paires clé-valeur
public class MapExemple {
    public static void main(String[] args) {
        Map<String, Integer> notes = new HashMap<>();
        notes.put("math", 15);
        notes.put("anglais", 14);
        notes.put("physique", 12);
        notes.put("math", 17); // Mise à jour de la valeur pour la clé math

        for (String cle : notes.keySet() ) {
           System.out.println(cle + " : " + notes.get(cle));
        }
    }
}
