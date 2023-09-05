package participants;

import participants.barriers.Barrier;
import participants.barriers.Wall;

public class Competitions {

    public static void start(Participant[] competitors, Barrier[] barricades) {
        for (Participant competitor : competitors) {
            for (Barrier barricade : barricades) {
                if (barricade instanceof Wall) {
                    if (competitor.isIncluded()) {
                        if (competitor.getLimitJump() >= barricade.getObstacleSize()) {
                            System.out.print(competitor.getName() + " ");
                            competitor.jump();
                        } else {
                            System.out.print(competitor.getName() + " ");
                            System.out.println("fail wall");
                            competitor.setIncluded(false);
                        }
                    }
                } else {
                    if (competitor.isIncluded()) {
                        if (competitor.getLimitSpeed() >= barricade.getObstacleSize()) {
                            System.out.print(competitor.getName() + " ");
                            competitor.run();
                        } else {
                            System.out.print(competitor.getName() + " ");
                            System.out.println("fail treadmill");
                            competitor.setIncluded(false);
                        }
                    }
                }
            }
        }
    }
}
