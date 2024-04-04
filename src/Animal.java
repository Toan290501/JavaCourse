public abstract class Animal implements AnimalBehavior {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}
