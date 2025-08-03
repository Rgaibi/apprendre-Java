class animal {
    public void parler() {
        System.out.println("l'animal fait un bruit");
    }
}
public class chienAvecHeritage extends animal {
    public void aboyer() {
        System.out.println("waouf");
    }
    public static void main(String[] args) {
        chienAvecHeritage c = new chienAvecHeritage();
        c.parler();
        c.aboyer();
    }
}