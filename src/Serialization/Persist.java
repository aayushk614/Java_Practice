package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Persist {

    public static void main(String[] args) {


        try {


            TestSerialize obj = new TestSerialize("aayush", 56938, 23, 1.0F);
            obj.display();

            FileOutputStream ob = new FileOutputStream("a2.txt");
            ObjectOutputStream out = new ObjectOutputStream(ob);

            out.writeObject(obj);
            out.flush();

            out.close();







        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
