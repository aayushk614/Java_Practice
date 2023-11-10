package ExceptionHandling;

public class Test {

    public void check(int id) throws customException {

        if(id == 100)
            throw new customException("this is custom exception");

        else
            System.out.println("Id is correct");

    }

    public static void main(String[] args) {

        String s1 = new String("hello");
        String s2 = new String("hello");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1 == s2);



    }
}
