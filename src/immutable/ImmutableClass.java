package immutable;

public final class ImmutableClass {
    private final int id;
    private final String name;

    public ImmutableClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static void showImmutable() {
        ImmutableClass obj = new ImmutableClass(1, "John");
        System.out.println("ID: " + obj.getId() + ", Name: " + obj.getName());
    }
}
