package participants;

public abstract class Participant {

    private final String name;
    private final int limitSpeed;
    private final int limitJump;
    private boolean included = true;

    public Participant(String name, int limitSpeed, int limitJump) {
        this.name = name;
        this.limitSpeed = limitSpeed;
        this.limitJump = limitJump;
    }

    public abstract void run();

    public abstract void jump();

    public String getName() {
        return name;
    }

    public int getLimitSpeed() {
        return limitSpeed;
    }

    public int getLimitJump() {
        return limitJump;
    }

    public boolean isIncluded() {
        return included;
    }

    public void setIncluded(boolean included) {
        this.included = included;
    }
}
