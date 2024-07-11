import oop.clases.Emotion;

public class App {
    public static void main(String[] args) throws Exception {
        Emotion joy = new Emotion("Joy", 13, "yellow", true, 10);
        System.out.println(joy.introduce());
        System.out.println(joy.eat());
    }
}
