package DependencyInjection;

public class Method1 {

    public static void drawMethod(Shape shape){
        shape.draw();
    }

    public static void main(String[] args) {

        Shape shape = new Triangle();

        drawMethod(shape);






    }


}
