class animal {
    public void parler() {
        System.out.println();
    }
}
class chat extends animal {
    public void parler() {
        System.out.println("miaou");
    }
}
class chien extends animal{
    public void parler() {
        System.out.println("waouf");
    }
}
public class PolymorphismeParHeritage {
    public static void main(String[] args) {
        animal[] animaux = {new chat(), new chien()};
        for(animal a : animaux ){
            a.parler();
        }
        
    }
}
Heritage