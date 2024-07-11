import oop.clases.Emotion;
import oop.clases.Character;

public class App {
    public static void main(String[] args) throws Exception {
        Character riley = new Character("Riley", 13);
        System.out.println(riley.introduce());
        Emotion joy = new Emotion("Joy", 13, "yellow", true, 10);
        System.out.println(joy.introduce());
    }
}
