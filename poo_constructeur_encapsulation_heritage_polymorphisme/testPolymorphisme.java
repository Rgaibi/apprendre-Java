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
public class testPolymorphisme {
    public static void main(String[] args) {
        animal a = new chat();
        a.parler();
    }
}
