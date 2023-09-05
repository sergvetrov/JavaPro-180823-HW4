package participants;

public class Robot extends Participant {

    public Robot(String name, int limitSpeed, int limitJump) {
        super(name, limitSpeed, limitJump);
    }

    @Override
    public void run() {
        System.out.println("runs over obstacle");
    }

    @Override
    public void jump() {
        System.out.println("jumps over obstacle");
    }
}
