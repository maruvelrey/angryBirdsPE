package service;

public class RubberPig extends AngryBird {
    public RubberPig(SoundBehavior soundBehavior) {
        this.soundBehavior = soundBehavior;
    }

    @Override
    public void display() {
        System.out.println("RubberPig");
    }

    @Override
    public String toString() {
        return "RubberPig";
    }
}