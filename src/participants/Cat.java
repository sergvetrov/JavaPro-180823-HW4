package participants;

public class Cat extends Participant {

    public Cat(String name, int limitSpeed, int limitJump) {
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
