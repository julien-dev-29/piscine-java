package Adventure;

public class Templar extends Character implements Tank, Healer {
    private final int healCapacity;
    private final int shield;

    public Templar(String name, int maxHealth, int healCapacity, int shield, Weapon weapon) {
        super(name, maxHealth, weapon);
        this.healCapacity = healCapacity;
        this.shield = shield;
    }

    @Override
    public void heal(Character character) throws DeadCharacterException {
        if (character.getCurrentHealth() <= 0) {
            throw new DeadCharacterException(character);
        }
        if (character.currentHealth + this.healCapacity <= character.getMaxHealth()) {
            character.currentHealth += healCapacity;
        }
    }

    @Override
    public int getHealCapacity() {
        return this.healCapacity;
    }

    @Override
    public int getShield() {
        return this.shield;
    }

    @Override
    public void takeDamage(int damages) throws DeadCharacterException {
        if (this.getCurrentHealth() <= 0) {
            throw new DeadCharacterException(this);
        }
        int realDamages = damages - this.getShield();
        if (realDamages >= this.currentHealth) {
            this.currentHealth = 0;
        } else {
            this.currentHealth -= realDamages;
        }
    }

    @Override
    public void attack(Character character) throws DeadCharacterException {
        if (character.getCurrentHealth() <= 0) {
            throw new DeadCharacterException(character);
        }
        this.heal(this);
        character.takeDamage(6);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.getName());
        if (this.currentHealth <= 0) {
            builder
                    .append(" has been beaten, even with its ")
                    .append(this.getShield())
                    .append(" shield. So bad, it could heal ")
                    .append(this.getHealCapacity())
                    .append(" HP.");

        } else {
            builder
                    .append(" is a strong Templar with ")
                    .append(this.getCurrentHealth())
                    .append(" HP. It can heal ")
                    .append(this.getHealCapacity())
                    .append(" HP and has a shield of ")
                    .append(this.getShield())
                    .append(".");
        }
        builder
                .append(". He has the weapon ")
                .append(this.getWeapon().toString());
        return builder.toString();
    }
}
