class Animal2 {
    public void parler() {
        System.out.println();
    }
}
class Chat2 extends Animal2 {
    public void parler() {
        System.out.println("miaou");
    }
}
class Chien2 extends Animal2{
    public void parler() {
        System.out.println("waouf");
    }
}
public class PolymorphismeParHeritage {
    public static void main(String[] args) {
        Animal2[] animaux = {new Chat2(), new Chien2()};
        for(Animal2 a : animaux ){
            a.parler();
        }
        
    }
}
