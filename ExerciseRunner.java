import SortList.SortList;

import java.io.IOException;
import java.util.List;

public class ExerciseRunner {
    public static void main(String[] args) throws IOException {
        System.out.println(SortList.sort(List.of(15, 1, 14, 18, 14, 98, 54, -1, 12)));
        System.out.println(SortList.sortReverse(List.of(15, 1, 14, 18, 14, 98, 54, -1, 12)).toString());
    }
}
