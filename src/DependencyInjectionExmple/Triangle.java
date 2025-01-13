package DependencyInjectionExmple;

/**
 * The Triangle class represents a triangle shape.
 * It extends the Shape class and provides a specific implementation for drawing a triangle.
 */
public class Triangle extends Shape {

    /**
     * Draws the triangle shape.
     * This method overrides the draw method in the Shape class.
     */
    public void draw() {
        System.out.println("This is Triangle class");
    }
}
