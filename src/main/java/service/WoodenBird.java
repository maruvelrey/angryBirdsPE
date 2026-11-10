package service;

public class WoodenBird extends AngryBird {
    public WoodenBird(SoundBehavior soundBehavior) {
        this.soundBehavior = soundBehavior;
    }

    @Override
    public void display() {
        System.out.println("WoodenBird");
    }

    @Override
    public String toString() {
        return "WoodenBird";
    }
}