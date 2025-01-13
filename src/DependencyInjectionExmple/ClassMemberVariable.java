package DependencyInjectionExmple;

/**
 * This class demonstrates dependency injection using a class member variable.
 */
public class ClassMemberVariable {

    private Shape shape;

    /**
     * Sets the shape to be drawn.
     *
     * @param shape The shape to set.
     */
    public void setShape(Shape shape){
        this.shape = shape;
    }

    /**
     * Draws the shape.
     */
    public void drawShape(){
        shape.draw();
    }

}
