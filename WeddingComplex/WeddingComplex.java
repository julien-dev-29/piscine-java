package WeddingComplex;

import java.util.*;

public class WeddingComplex {
    public static Map<String, String> createBestCouple(Map<String, List<String>> first, Map<String, List<String>> second) {
        Map<String, String> couples = new HashMap<>();
        Queue<String> freeMembers = new LinkedList<>(first.keySet());
        Map<String, Integer> proposalIndex = new HashMap<>();

        for (String member : first.keySet()) {
            proposalIndex.put(member, 0);
        }

        while (!freeMembers.isEmpty()) {
            String proposer = freeMembers.poll();
            List<String> preferences = first.get(proposer);

            int index = proposalIndex.get(proposer);

            String target = preferences.get(index);

            proposalIndex.put(proposer, index + 1);

            if (!couples.containsValue(target)) {
                couples.put(proposer, target);
            } else {
                String currentPartner = null;
                for (Map.Entry<String, String> entry : couples.entrySet()) {
                    if (entry.getValue().equals(target)) {
                        currentPartner = entry.getKey();
                        break;
                    }
                }
                List<String> targetPreferences = second.get(target);
                if (targetPreferences.indexOf(proposer) < targetPreferences.indexOf(currentPartner)) {
                    couples.remove(currentPartner);
                    freeMembers.add(currentPartner);
                    couples.put(proposer, target);
                } else {
                    freeMembers.add(proposer);
                }
            }
        }
        return couples;
    }
}