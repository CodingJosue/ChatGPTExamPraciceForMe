package Question1;

public class Habitat {
    public static void simulate(Animal[] animals){
        for(Animal animal: animals){
            System.out.println(" ");
            animal.eat();
            System.out.println(" ");
            animal.makeSound();
            System.out.println(" ");
            animal.sleep();

            if(animal instanceof Migrate){
                ((Migrate) animal).migrate();
            }
        }
    }

    public static void main(String[] args) {
        Animal[] animals = {new Elephant("Elephant",4, Animal.Gender.MALE), new Lion("King",3, Animal.Gender.MALE)};
        simulate(animals);
    }
}
