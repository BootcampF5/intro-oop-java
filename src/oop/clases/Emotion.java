package oop.clases;

import oop.interfaz.Feeding;
import oop.interfaz.Routine;

public class Emotion extends Character implements Routine{
    protected String color;
    private boolean isPositive;
    private int intensity;

    public Emotion(String name, int age, String color, boolean isPositive, int intensity){
        super(name, age);
        this.color = color;
        this.isPositive = isPositive;
        this.intensity = intensity;
    }

    @Override
    public String introduce() {
        return  "Hi, I'm " + super.getName() + " and I'm an emotion.";
    }

    @Override
    public String wakeup() {
        return "I'm up!";
    }

    @Override
    public String sleep() {
        return "I'm sleeping!";
    }

}
