public class Fish extends Animal implements MovementBehavior {
    public Fish(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating algae.");
    }

    @Override
    public void move() {
        System.out.println(name + " is swimming.");
    }
}
