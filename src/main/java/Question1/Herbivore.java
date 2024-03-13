package Question1;

public abstract class Herbivore extends Animal
{
    public Herbivore(String name, int age, Gender gender) {
        super(name, age, gender);
    }

    @Override
    public void eat() {
        System.out.println("I like vegetables");
    }
}
 non-sealed class Elephant extends Herbivore implements Migrate,Adaptable{

     public Elephant(String name, int age, Gender gender) {
         super(name, age, gender);
     }

     @Override
    public void makeSound() {
        System.out.println("Trumpetttttt!");
    }

     @Override
     public void migrate() {
         System.out.println("I migrate");
     }

     @Override
     public void sleep() {
         System.out.println("Sleeping on my side like a true elephant");
     }

     @Override
     public void adapt(Animal animal) {
         if(animal instanceof Elephant){
             System.out.println("Not build for adaptation");
         }
     }

     public static void main(String[] args) {
         Animal a1 = new Elephant("Elephant",3,Gender.FEMALE);


     }
 }
