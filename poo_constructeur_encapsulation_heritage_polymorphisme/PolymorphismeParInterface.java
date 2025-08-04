interface Animal {
   void parler();     
}
class Chien implements Animal {
    public void parler() {
        System.out.println("waouf");
    }
}
class Chat implements Animal {
    public void parler() {
        System.out.println("miaou");
    }
}
public class PolymorphismeParInterface {
    public static void main(String[] args) {
        Animal[] animaux = {new Chat(), new Chien()};
        for(Animal A : animaux ){
            A.parler();
        }
    }
}
