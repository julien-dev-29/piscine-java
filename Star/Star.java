package Star;

public class Star extends CelestialObject {
    private double magnitude;

    public Star(String name, double x, double y, double z, double magnitude) {
        super(x, y, z, name);
        this.magnitude = magnitude;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }
}