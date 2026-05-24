package Wedding;

import java.util.*;

public class Wedding {
    public static Map<String, String> createCouple(Set<String> first, Set<String> second) {
        Map<String, String> map = new HashMap<>();

        List<String> firstList = new ArrayList<>(first);
        List<String> secondList = new ArrayList<>(second);

        Collections.shuffle(firstList);
        Collections.shuffle(secondList);

        for (int i = 0; i < firstList.size(); i++) {
            map.put(firstList.get(i), secondList.get(i));
        }
        return map;
    }
}