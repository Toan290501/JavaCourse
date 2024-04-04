public class Bird extends FlyingAnimal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating seeds.");
    }
}
