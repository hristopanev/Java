package P01_shapes_Drawing;

public class Main {
    public static void main(String[] args) {

        Drawable circle = new Circle(5);

        circle.draw();

        Drawable rectangle = new Rectangle(10, 20);

        rectangle.draw();

    }
}
