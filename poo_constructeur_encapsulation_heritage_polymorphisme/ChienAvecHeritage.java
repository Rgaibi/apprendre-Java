class Animal {
    public void Parler() {
        System.out.println("l'animal fait un bruit");
    }
}
public class ChienAvecHeritage extends animal {
    public void Aboyer() {
        System.out.println("waouf");
    }
    public static void main(String[] args) {
        ChienAvecHeritage c = new ChienAvecHeritage();
        c.parler();
        c.aboyer();
    }
}