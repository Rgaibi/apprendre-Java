public class personneAvecConstructeur {
    String nom;
    int age;
    public personneAvecConstructeur(String n, int a) {
        nom = n;
        age = a;
    }
    public void serepresenter() {
        System.out.println("je m'appelle " +nom+ "et j'ai " +age+ "ans");
    }
    public static void main(String[] args){
        personneAvecConstructeur p = new personneAvecConstructeur("karim", 33);
        p.serepresenter();
    }
}
