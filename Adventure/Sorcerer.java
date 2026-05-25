package Adventure;

public class Sorcerer extends Character implements Healer {
    private final int healCapacity;

    public Sorcerer(String name, int maxHealth, int healCapacity, Weapon weapon) {
        super(name, maxHealth, weapon);
        this.healCapacity = healCapacity;
    }

    @Override
    public void heal(Character character) {
        if (character.currentHealth + this.healCapacity <= character.getMaxHealth()) {
            character.currentHealth += healCapacity;
        }
    }

    @Override
    public int getHealCapacity() {
        return this.healCapacity;
    }

    @Override
    public void takeDamage(int damages) throws DeadCharacterException {
        if (this.currentHealth <= 0) {
            throw new DeadCharacterException(this);
        }
        if (damages >= this.currentHealth) {
            this.currentHealth = 0;
        } else {
            this.currentHealth -= damages;
        }
    }

    @Override
    public void attack(Character character) throws DeadCharacterException {
        if (character.getCurrentHealth() <= 0) {
            throw new DeadCharacterException(character);
        }
        this.heal(this);
        character.takeDamage(10);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.getName());
        if (this.currentHealth <= 0) {
            builder
                    .append(" is a dead sorcerer. So bad, it could heal ")
                    .append(this.healCapacity)
                    .append(" HP");
        } else {
            builder
                    .append(" is a sorcerer with ")
                    .append(this.currentHealth)
                    .append(" HP. It can heal ")
                    .append(this.healCapacity)
                    .append(" HP");
        }
        builder
                .append(". He has the weapon ")
                .append(this.getWeapon().toString());
        return builder.toString();
    }
}
