package service;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class AngryBird {
    protected SoundBehavior soundBehavior;

    public abstract void display();

    public void launch() {
        System.out.println("Lanzando personaje desde el tirachinas...");
    }

    public void makeSound() {
        soundBehavior.makeSound();
    }

    @Override
    public String toString() {
        return "AngryBird";
    }
}