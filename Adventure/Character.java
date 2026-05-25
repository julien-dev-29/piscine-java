package Adventure;

import java.util.ArrayList;
import java.util.List;

public abstract class Character {
    private static final List<Character> allCharacters = new ArrayList<>();
    private final int maxHealth;
    private final String name;
    private final Weapon weapon;
    public int currentHealth;

    public Character(String name, int maxHealth, Weapon weapon) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        this.weapon = weapon;
        allCharacters.add(this);
    }

    public static void printStatus() {
        if (allCharacters.isEmpty()) {
            System.out.println("------------------------------------------");
            System.out.println("Nobody's fighting right now !");
            System.out.println("------------------------------------------");
        } else {
            System.out.println("------------------------------------------");
            System.out.println("Characters currently fighting : ");
            for (Character character : allCharacters) {
                System.out.println(" - " + character);
            }
            System.out.println("------------------------------------------");
        }
    }

    public static Character fight(Character character1, Character character2) {
        try {
            while (character1.getCurrentHealth() > 0 && character2.getCurrentHealth() > 0) {
                character1.attack(character2);
                if (character2.getCurrentHealth() > 0) {
                    character2.attack(character1);
                }
            }
            if (character1.currentHealth <= 0) {
                return character2;
            } else {
                return character1;
            }
        } catch (DeadCharacterException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public abstract void takeDamage(int damages) throws DeadCharacterException;

    public abstract void attack(Character character) throws DeadCharacterException;

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public String getName() {
        return name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.name);
        if (this.currentHealth == 0) {
            builder.append(" : KO");
        } else {
            builder
                    .append(" : ")
                    .append(this.currentHealth)
                    .append("/")
                    .append(this.maxHealth);
        }
        builder
                .append(". He has the weapon ")
                .append(this.getWeapon().toString());
        return builder.toString();
    }
}