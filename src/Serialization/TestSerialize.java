package Serialization;

import java.io.*;

public class TestSerialize implements Serializable {


    private String name;
    private int id;
    private int age;
    private double balance;

    TestSerialize(String n, int i, int a, float b){
        name = n;
        id = i;
        age = a;
        balance = b;

    }

    public void display(){

        System.out.println(name + "-" + id + "-" + age +"-" + balance);


    }

    public static void main(String[] args) throws IOException {

        TestSerialize obj = new TestSerialize("aayush", 56938, 23, 1.0F);

        obj.display();

//        FileOutputStream ob = new FileOutputStream("a1.txt");
//        ObjectOutputStream os = new ObjectOutputStream(ob);
//
//
//
//        //os.writeObject(obj);
//
//        ObjectInputStream oi = new ObjectInputStream(new FileInputStream("a1.txt"));






















    }






}
