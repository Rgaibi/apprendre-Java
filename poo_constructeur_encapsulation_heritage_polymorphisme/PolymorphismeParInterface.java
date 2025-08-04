interface Animal3 {
   void parler();     
}
class Chien3 implements Animal3 {
    public void parler() {
        System.out.println("waouf");
    }
}
class Chat3 implements Animal3 {
    public void parler() {
        System.out.println("miaou");
    }
}
public class PolymorphismeParInterface {
    public static void main(String[] args) {
        Animal3[] animaux = {new Chat3(), new Chien3()};
        for(Animal3 a : animaux ){
            a.parler();
        }
    }
}
