package DependencyInjectionExmple;

/**
 * The Square class represents a square shape.
 * It extends the Shape class and provides a specific implementation for drawing a square.
 */
public class Square extends Shape {

    /**
     * Draws the square shape.
     * This method overrides the draw method in the Shape class.
     */
    public void draw(){
        System.out.println("This is Square class");
    }
}
