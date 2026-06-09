import KeepTheChange.KeepTheChange;

import java.io.IOException;
import java.util.Set;

public class ExerciseRunner {
    public static void main(String[] args) throws IOException {
        System.out.println(KeepTheChange.computeChange(18, Set.of(1, 3, 7)));
    }
}
