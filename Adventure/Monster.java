package Adventure;

public class Monster extends Character {
    public Monster(String name, int maxHealth, Weapon weapon) {
        super(name, maxHealth, weapon);
    }

    @Override
    public void takeDamage(int damages) throws DeadCharacterException {
        if (this.getCurrentHealth() <= 0) {
            throw new DeadCharacterException(this);
        }
        int realDamages = (int) Math.floor((double) (damages * 80) / 100);
        if (realDamages >= this.currentHealth) {
            this.currentHealth = 0;
        } else {
            this.currentHealth -= realDamages;
        }
    }

    @Override
    public void attack(Character character) throws DeadCharacterException {
        if (character.getCurrentHealth() == 0) {
            throw new DeadCharacterException(character);
        }
        character.takeDamage(7);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.getName());
        if (this.getCurrentHealth() > 0) {
            builder.append(" is a monster with ").append(this.getCurrentHealth()).append(" HP");
        } else {
            builder.append(" is a monster and is dead");
        }
        builder
                .append(". He has the weapon ")
                .append(this.getWeapon().toString());
        return builder.toString();
    }
}