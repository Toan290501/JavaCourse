import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        ArrayList<MovementBehavior> movers = new ArrayList<>();

        animals.add(new Lion("Leo"));
        animals.add(new Elephant("Ella"));
        animals.add(new Bird("Tweety"));
        animals.add(new Fish("Nemo"));

        movers.add((MovementBehavior) animals.get(2));
        movers.add((MovementBehavior) animals.get(3));

        for (Animal animal : animals) {
            System.out.println("Name: " + animal.name);
            animal.eat();
            animal.sleep();
        }

        System.out.println("\nMovement Behaviors:");
        for (MovementBehavior mover : movers) {
            mover.move();
        }
    }
}