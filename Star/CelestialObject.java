package Star;

/**
 *
 */
public class CelestialObject {
    public final static double KM_IN_ONE_AU = 150000000;
    private double x;
    private double y;
    private double z;
    private String name;

    public CelestialObject() {
        this.name = "Soleil";
    }

    public CelestialObject(String name, double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.name = name;
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
}