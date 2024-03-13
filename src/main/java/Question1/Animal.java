package Question1;

public abstract class Animal {

    public String name;
    public int age;
    public Gender gender;

    public enum Gender{
        MALE, FEMALE
    }

    public Animal(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public  abstract void eat();
    public abstract void makeSound();

    public abstract void sleep();

}
