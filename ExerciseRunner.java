import Capitalize.Capitalize;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ExerciseRunner {
    public static void main(String[] args) throws IOException {
        Capitalize.capitalize(new String[]{"input.txt", "output.txt"});
        String expectedResult = new String(Files.readAllBytes(Paths.get("result.txt")));
        String userOutput = new String(Files.readAllBytes(Paths.get("output.txt")));
        System.out.println(expectedResult.equals(userOutput));
    }
}
