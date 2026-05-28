package SortList;

import java.util.ArrayList;
import java.util.List;

public class SortList {
    public static List<Integer> sort(List<Integer> list) {
        List<Integer> sortedList = new ArrayList<>(list);
        sortedList.sort(null);
        return sortedList;
    }

    public static List<Integer> sortReverse(List<Integer> list) {
        return sort(list).reversed();
    }
}
