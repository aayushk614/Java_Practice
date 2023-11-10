package ExceptionHandling;

public class trycatchfinally {

    public static int print(){

        try{

            //int a = 10/0;
            System.out.println("Try block");
            return 1;
        }
        catch (Exception e){
            //System.out.println("catch block");
            return 2;
        }
        finally {
            System.exit(0);
            System.out.println("finally block");
            return 3;
        }




    }

    public static void main(String[] args) {

        System.out.println(print());
    }





}
