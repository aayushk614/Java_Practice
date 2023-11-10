package Output;

import java.io.*;

public class ReadFile {

    public static void main(String[] args) throws IOException {

        String s[] = {"hello", "jp", "kop"};

        BufferedWriter writer = new BufferedWriter(new FileWriter("ab2.txt"));

        writer.write("hello from class!!");

        for(String i  :s){
            writer.write("\n" + i);

        }
        writer.close();


        BufferedReader reader = new BufferedReader(new FileReader("ab2.txt"));

        String line;

        while ((line = reader.readLine()) != null){
            System.out.println(line);

        }




    }
}
