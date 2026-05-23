package Star;

import java.util.Objects;

public class Star extends CelestialObject {
    private double magnitude;

    public Star(String name, double x, double y, double z, double magnitude, int mass) {
        super(name, x, y, z, mass);
        this.magnitude = magnitude;
    }

    /**
     *
     */
    public Star() {

    }

    public double getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }

    @Override
    public String toString() {
        return this.getName() + " shines at the "
                + String.format("%.3f", this.magnitude)
                + " magnitude";
    }

    @Override
    public boolean equals(Object obj) {
        Star other = (Star) obj;
        return this.magnitude == other.magnitude;
    }

    @Override
    public int hashCode() {
        return Objects.hash(magnitude);
    }
}