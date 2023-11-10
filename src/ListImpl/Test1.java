package ListImpl;

public class Test1 {

    public void findSmallest(int x, int y, int z){
        if(x < y && x < z)
            System.out.println(x);
        else if(y < x && y < z)
            System.out.println(y);
        else
            System.out.println(z);
    }
public static void main(String[] args) {
        System.out.println("Hello World");
    }

}
