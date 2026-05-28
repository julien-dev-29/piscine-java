package Decorator;

public abstract class RacletteDecorator implements Raclette {
    private final Raclette raclette;

    public RacletteDecorator(Raclette raclette) {
        this.raclette = raclette;
    }

    @Override
    public int getCalories() {
        return this.raclette.getCalories();
    }

    @Override
    public String getIngredients() {
        return this.raclette.getIngredients();
    }

    @Override
    public String toString() {
        return this.getIngredients() + " pour " + this.getCalories() + " calories";
    }
}
