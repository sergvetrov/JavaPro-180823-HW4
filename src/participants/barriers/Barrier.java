package participants.barriers;

public abstract class Barrier {

    private final String name;
    private final int obstacleSize;

    public Barrier(String name, int obstacleSize) {
        this.name = name;
        this.obstacleSize = obstacleSize;
    }

    public abstract void overcome();

    public String getName() {
        return name;
    }

    public int getObstacleSize() {
        return obstacleSize;
    }
}
