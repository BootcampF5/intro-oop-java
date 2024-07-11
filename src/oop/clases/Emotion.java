package oop.clases;

public class Emotion extends Character{
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
        return super.introduce() + " and I'm an emotion.";
    }
}
