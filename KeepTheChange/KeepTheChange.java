package KeepTheChange;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class KeepTheChange {
    public static List<Integer> computeChange(int amount, Set<Integer> coins) {
        List<Integer> chosenCoins = new ArrayList<>();
        List<Integer> sortedCoins = new ArrayList<>(coins);
        sortedCoins.sort((o1, o2) -> o2 - o1);
        for (Integer coin : sortedCoins) {
            while (amount >= coin) {
                amount -= coin;
                chosenCoins.add(coin);
            }
        }

        if (amount != 0) {
            throw new IllegalArgumentException("Impossible de rendre la monnaie avec les pièces données.");
        }
        return chosenCoins;
    }
}
