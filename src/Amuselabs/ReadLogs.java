package Amuselabs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ReadLogs {
    public static void main(String[] args) throws IOException {

        HashMap<String, Integer> views = new HashMap<>();
        HashMap<String, Integer> purchases = new HashMap<>();


        BufferedReader br = new BufferedReader(new FileReader("/Users/aayushkumar/Desktop/Practice/src/Amuselabs/logs.txt"));
        String line;
        while ((line = br.readLine()) != null){
            //System.out.println(line);

            if(line.contains("viewed product")){
                String product = line.split("viewed product \\[")[1].split("]")[0];
                views.put(product, views.getOrDefault(product, 0)+1);
                //System.out.println(product);
            }

            else if (line.contains("purchased product")) {
            String product = line.split("purchased product \\[")[1].split("]")[0];
            purchases.put(product, purchases.getOrDefault(product, 0) + 1);
        }

        }

        String mostLiked = mostLiked(purchases);
        String leastLiked = leastLiked(purchases);

        System.out.println("Most liked product = " + mostLiked);
        System.out.println("Least liked product = " + leastLiked);


        List<String> viewed_not_bought = new ArrayList<>();

        for(String prod : views.keySet()){

            if(!purchases.containsKey(prod)){
                viewed_not_bought.add(prod);
            }
        }

        System.out.println("Viewed but not purchased products = " + viewed_not_bought);


    }

    public static String mostLiked(HashMap<String, Integer> map){

        String res ="";
        int maxi = -9999;
        for(String prod : map.keySet()){

            if(map.get(prod) > maxi){
                maxi = map.get(prod);
                res = prod;
            }

        }
        return res;

    }

    public static String leastLiked(HashMap<String, Integer> map){

        String res ="";
        int mini = 9999;
        for(String prod : map.keySet()){

            if(map.get(prod) < mini){
                mini = map.get(prod);
                res = prod;
            }

        }
        return res;

    }
}
