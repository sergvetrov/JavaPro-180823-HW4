package figures;

public class Round implements Volumetric {

    private final double radius;

    public Round(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
