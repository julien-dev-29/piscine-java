package Star;

import java.util.Objects;

/**
 *
 */
public class CelestialObject {
    public final static double KM_IN_ONE_AU = 150000000;
    private double x;
    private double y;
    private double z;
    private String name;
    private int mass;

    public CelestialObject() {
        this.name = "Soleil";
    }

    public CelestialObject(String name, double x, double y, double z, int mass) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
        this.mass = mass;
    }

    public static double getDistanceBetween(CelestialObject object1, CelestialObject object2) {
        return Math.round(
                Math.sqrt(
                        Math.pow(0.0, 2) +
                                Math.pow(object2.getY() - object1.getY(), 2) +
                                Math.pow(object2.getZ() - object1.getZ(), 2)
                )
        );
    }

    public static double getDistanceBetweenInKm(CelestialObject object1, CelestialObject object2) {
        return getDistanceBetween(object1, object2) * KM_IN_ONE_AU;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    @Override
    public String toString() {
        return this.name + " is positioned at ("
                + String.format("%.3f", x) + ", "
                + String.format("%.3f", y) + ", "
                + String.format("%.3f", z) + ")";
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (!(obj instanceof CelestialObject other)) return false;

        return Objects.equals(this.name, other.name)
                && Double.compare(this.x, other.x) == 0
                && Double.compare(this.y, other.y) == 0
                && Double.compare(this.z, other.z) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z, name);
    }
}