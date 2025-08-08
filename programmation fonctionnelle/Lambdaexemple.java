import java.time.LocalDateTime;
import java.util.function.Supplier;

interface Myprint {
    void print(String text);
}

interface Mymath {
    int calc(int a, int b);
}

public class Lambdaexemple {
    public static void main(String[] args) {
        //exemple avec un seul param
        Myprint p = (text) -> System.out.println(text);
        p.print("bonjour lambda");
        
        //exemple sans param
        Supplier<LocalDateTime> currentTime = () -> LocalDateTime.now();
        System.out.println("date et heure actuelles :" +currentTime.get());

        //exemple avec deux params
        Mymath addition = (a, b) -> a+b;
        int resultat = addition.calc(3, 7);
        System.out.println("resultat de l'addition : " + resultat);
    }
}