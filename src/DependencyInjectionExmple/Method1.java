package DependencyInjectionExmple;

/**
 * This class demonstrates dependency injection using a method parameter.
 */
public class Method1 {

    /**
     * Draws the given shape.
     *
     * @param shape The shape to be drawn.
     */
    public static void drawMethod(Shape shape){
        shape.draw();
    }

    public static void main(String[] args) {

        Shape shape = new Triangle();

        drawMethod(shape);
    }
}
