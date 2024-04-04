public abstract class FlyingAnimal extends Animal implements MovementBehavior {
    public FlyingAnimal(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(name + " is flying.");
    }
}
