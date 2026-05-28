import Strategy.ConcatStrategy;
import Strategy.Context;
import Strategy.MaxStrategy;

import java.io.IOException;

public class ExerciseRunner {
    public static void main(String[] args) throws IOException {
        Context context = new Context();
        System.out.println(context.execute(23, 43));

        context.changeStrategy(new MaxStrategy());
        System.out.println(context.execute(23, 43));

        context.changeStrategy(new ConcatStrategy());
        System.out.println(context.execute(23, 43));
    }
}
