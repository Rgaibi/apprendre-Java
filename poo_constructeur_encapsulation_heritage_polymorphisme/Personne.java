// introduction POO

public class Personne {
    String nom;
    int age;
    public void serepresenter() {
        System.out.println("je m'appelle " +nom+ "et j'ai " +age+ "ans");
    }
    public static void main(String[] args) {
        Personne p = new Personne();
        p.nom = "karim";
        p.age = 33;
        p.serepresenter();
    }
}