import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        User userA = new User("Gabriel", "Araujo");
        System.out.println(userA.output());
        System.out.println(userA.output(false));
    }
}