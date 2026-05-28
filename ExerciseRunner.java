import Decorator.BaseRaclette;
import Decorator.Raclette;
import Decorator.WithColdMeats;
import Decorator.WithPickles;

import java.io.IOException;

public class ExerciseRunner {
    public static void main(String[] args) throws IOException {
        Raclette r = new BaseRaclette();
        System.out.println(r);
        r = new WithPickles(r);
        System.out.println(r);
        r = new WithColdMeats(r);
        System.out.println(r);
    }
}
