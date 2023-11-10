package DependencyInjectionExmple;

public class ClassMemberVariable {

    private Shape shape;

    public void setShape(Shape shape){
        this.shape = shape;
    }

    public void drawShape(){
        shape.draw();
    }

}
