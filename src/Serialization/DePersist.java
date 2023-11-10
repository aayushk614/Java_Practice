package Serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DePersist {

    public static void main(String[] args) {

        try {

            ObjectInputStream in = new ObjectInputStream(new FileInputStream("a2.txt"));

            TestSerialize obj = (TestSerialize) in.readObject();

            obj.display();

            in.close();



        }

        catch (Exception e){
            System.out.println(e);
        }






    }
}
