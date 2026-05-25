package Adventure;

public record Weapon(String name, int damage) {

    @Override
    public String toString() {
        return this.name + " deals " + this.damage + " damages.";
    }
}
