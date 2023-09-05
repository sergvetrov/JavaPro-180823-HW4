package participants.barriers;

public class Wall extends Barrier {

    public Wall(String name, int height) {
        super(name, height);
    }

    @Override
    public void overcome() {
        System.out.println("Wall overcome");
    }
}
