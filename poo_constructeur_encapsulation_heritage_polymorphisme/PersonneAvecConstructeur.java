public class PersonneAvecConstructeur {
    String nom;
    int age;
    public PersonneAvecConstructeur(String n, int a) {
        nom = n;
        age = a;
    }
    public void serepresenter() {
        System.out.println("je m'appelle " +nom+ "et j'ai " +age+ "ans");
    }
    public static void main(String[] args){
        PersonneAvecConstructeur p = new PersonneAvecConstructeur("karim", 33);
        p.serepresenter();
    }
}
