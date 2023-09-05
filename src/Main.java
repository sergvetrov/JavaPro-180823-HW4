import figures.Round;
import figures.Square;
import figures.Triangle;
import figures.Volumetric;
import participants.*;
import participants.barriers.Barrier;
import participants.barriers.Treadmill;
import participants.barriers.Wall;

public class Main {
    public static void main(String[] args) {
        makeFirstPartOfHW();
        makeSecondPartOfHW();
    }

    private static void makeFirstPartOfHW() {
        Round round = new Round(14.2);
        Square square = new Square(13.2);
        Triangle triangle = new Triangle(10.2, 11.3, 12.4);

        Volumetric[] figures = {round, square, triangle};

        System.out.println(getTotalAreas(figures));
    }

    private static double getTotalAreas(Volumetric[] figures) {
        double totalAreas = 0;
        for (Volumetric figure : figures) {
            totalAreas = totalAreas + figure.getArea();
        }
        return totalAreas;
    }

    private static void makeSecondPartOfHW() {
        Participant[] competitors = {new Human("Alex", 30, 7),
                new Cat("Barsik", 5, 5),
                new Robot("R2D2", 40, 2)};
        Barrier[] barricades = {new Treadmill("Middle treadmill", 20),
                new Wall("Military wall", 6)};

        Competitions.start(competitors, barricades);
    }
}