package participants.barriers;

public class Treadmill extends Barrier {

    public Treadmill(String name, int length) {
        super(name, length);
    }

    @Override
    public void overcome() {
        System.out.println("Treadmill overcome");
    }
}
