package service;

public class ChuckBird extends AngryBird {
    public ChuckBird(SoundBehavior soundBehavior) {
        this.soundBehavior = soundBehavior;
    }

    @Override
    public void display() {
        System.out.println("ChuckBird");
    }

    @Override
    public String toString() {
        return "ChuckBird";
    }
}