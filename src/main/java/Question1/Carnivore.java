package Question1;

public abstract class Carnivore extends Animal{
    public Carnivore(String name, int age, Gender gender) {
        super(name, age, gender);
    }

    @Override
    public void eat() {
        System.out.println("Meat, Meat I love juicy meat !");
    }

}
class Lion extends  Carnivore implements Adaptable{
    public Lion(String name, int age, Gender gender) {
        super(name, age, gender);
    }

    @Override
    public void makeSound() {
        System.out.println("ROOOOOAAAAARRRRooooaaaaarrrr!");
    }

    @Override
    public void sleep() {
        System.out.println("Taking a snooze up a tree like a true King of savanna");
    }

    @Override
    public void adapt(Animal animal) {
        if(animal instanceof Lion){
            System.out.println("Claw open ready to hunt adapt to kill and hunt preys");
        }
    }
}