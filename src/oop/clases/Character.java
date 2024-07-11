package oop.clases;

public abstract class Character {
    private String name;
    private int age;

    public Character(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract String introduce();


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    

}
