import java.util.HashSet;
import java.util.Set; // ensemble non ordonné sans doublons, sans index
public class SetExemple {
    public static void main(String[] args) {
        Set<String> ensemble = new HashSet<>();
        ensemble.add("élément 1");
        ensemble.add("élément 2");
        ensemble.add("élément 3");
        ensemble.add("élément 1"); // Ajout d'un doublon, ignoré par le Set
        for (String element : ensemble) {
            System.out.println(element);
        }
    }
}
