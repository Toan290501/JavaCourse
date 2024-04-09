import collections.ListDemo;
import collections.MapDemo;
import collections.SetDemo;
import immutable.ImmutableClass;
import sealed.Circle;
import sealed.Rectangle;
import sealed.Shape;

public class Main {
    public static void main(String[] args) {
        ListDemo.showListDemo();
        SetDemo.showSetDemo();
        MapDemo.showMapDemo();
        ImmutableClass.showImmutable();
        Shape shape = new Circle(5);
        System.out.println(shape.area());
        shape = new Rectangle(4, 5);
        System.out.println(shape.area());
    }
}
