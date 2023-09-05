package figures;

public class Square implements Volumetric {

    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
