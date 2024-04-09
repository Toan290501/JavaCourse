package sealed;

public sealed abstract class Shape permits Circle, Rectangle {
    public abstract double area();
}
