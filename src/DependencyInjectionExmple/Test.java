package DependencyInjectionExmple;


//dependency is not hard coded but it is injected by an entity outside the class.
public class Test {
    public static void main(String[] args) {

        Triangle triangle  = new Triangle();

        ClassMemberVariable obj = new ClassMemberVariable();
        obj.setShape(triangle);
        obj.drawShape();










    }
}
