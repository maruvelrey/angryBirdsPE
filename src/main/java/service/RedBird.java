package service;

import lombok.ToString;

@ToString(callSuper = true)
public class RedBird extends AngryBird {
    public RedBird( SoundBehavior soundBehavior) {
        this.soundBehavior = soundBehavior;
    }

    @Override
    public void display() {
        System.out.println("Mostrando apariencia de RedBird clásico.");
    }
}
