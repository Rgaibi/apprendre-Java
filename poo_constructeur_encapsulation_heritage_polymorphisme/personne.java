// introduction POO

public class personne {
    String nom;
    int age;
    public void serepresenter() {
        System.out.println("je m'appelle " +nom+ "et j'ai " +age+ "ans");
    }
    public static void main(String[] args) {
        personne p = new personne();
        p.nom = "karim";
        p.age = 33;
        p.serepresenter();
    }
}