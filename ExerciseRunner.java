import DoOp.DoOp;

import java.io.IOException;

public class ExerciseRunner {
    public static void main(String[] args) throws IOException {
        System.out.println(DoOp.operate(new String[]{"1", "+", "2"}));
        System.out.println(DoOp.operate(new String[]{"1", "-", "1"}));
        System.out.println(DoOp.operate(new String[]{"1", "%", "0"}));
        System.out.println(DoOp.operate(args));
    }
}
