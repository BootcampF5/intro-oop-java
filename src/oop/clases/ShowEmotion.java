package oop.clases;

public class ShowEmotion {
    public static void main(String[] args) {
        Emotion sadness = new Emotion("Sadness", 13, "blue", true, 5);
        System.out.println(sadness.introduce());
        System.out.println(sadness.color);
    }
}
