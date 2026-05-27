package Singleton;

public record Excalibur(String name) {
    private static Excalibur instance;

    public static Excalibur getInstance() {
        if (instance == null) {
            instance = new Excalibur("Sword");
        }
        return instance;
    }
}
