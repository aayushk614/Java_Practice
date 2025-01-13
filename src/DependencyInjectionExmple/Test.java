package DependencyInjectionExmple;

/**
 * This class demonstrates dependency injection using a class member variable.
 */
public class Test {
    public static void main(String[] args) {

        // Create a Triangle object
        Triangle triangle = new Triangle();

        // Create a ClassMemberVariable object and set the shape to triangle
        ClassMemberVariable classMemberVariable = new ClassMemberVariable();
        classMemberVariable.setShape(triangle);
        classMemberVariable.drawShape();
    }
}
