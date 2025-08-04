class Animal {
    public void parler() {
        System.out.println("l'animal fait un bruit");
    }
}
public class ChienAvecHeritage extends Animal {
    public void aboyer() {
        System.out.println("waouf");
    }
    public static void main(String[] args) {
        ChienAvecHeritage c = new ChienAvecHeritage();
        c.parler();
        c.aboyer();
    }
}