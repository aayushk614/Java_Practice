package Amuselabs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * This class reads a log file and processes the data to find the most liked, least liked,
 * and viewed but not purchased products.
 */
public class ReadLogs {
    public static void main(String[] args) throws IOException {

        HashMap<String, Integer> productViews = new HashMap<>();
        HashMap<String, Integer> productPurchases = new HashMap<>();

        // Update the file path to be relative
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/Amuselabs/logs.txt"));
        String logLine;
        while ((logLine = bufferedReader.readLine()) != null) {
            // Check if the log line contains "viewed product"
            if (logLine.contains("viewed product")) {
                String product = logLine.split("viewed product \\[")[1].split("]")[0];
                productViews.put(product, productViews.getOrDefault(product, 0) + 1);
            }
            // Check if the log line contains "purchased product"
            else if (logLine.contains("purchased product")) {
                String product = logLine.split("purchased product \\[")[1].split("]")[0];
                productPurchases.put(product, productPurchases.getOrDefault(product, 0) + 1);
            }
        }

        String mostLikedProduct = mostLiked(productPurchases);
        String leastLikedProduct = leastLiked(productPurchases);

        System.out.println("Most liked product = " + mostLikedProduct);
        System.out.println("Least liked product = " + leastLikedProduct);

        List<String> viewedNotBoughtProducts = new ArrayList<>();

        for (String product : productViews.keySet()) {
            if (!productPurchases.containsKey(product)) {
                viewedNotBoughtProducts.add(product);
            }
        }

        System.out.println("Viewed but not purchased products = " + viewedNotBoughtProducts);
    }

    /**
     * This method finds the most liked product based on the number of purchases.
     *
     * @param productPurchaseMap A map containing product names and their purchase counts.
     * @return The name of the most liked product.
     */
    public static String mostLiked(HashMap<String, Integer> productPurchaseMap) {
        String result = "";
        int maxCount = -9999;
        for (String product : productPurchaseMap.keySet()) {
            if (productPurchaseMap.get(product) > maxCount) {
                maxCount = productPurchaseMap.get(product);
                result = product;
            }
        }
        return result;
    }

    /**
     * This method finds the least liked product based on the number of purchases.
     *
     * @param productPurchaseMap A map containing product names and their purchase counts.
     * @return The name of the least liked product.
     */
    public static String leastLiked(HashMap<String, Integer> productPurchaseMap) {
        String result = "";
        int minCount = 9999;
        for (String product : productPurchaseMap.keySet()) {
            if (productPurchaseMap.get(product) < minCount) {
                minCount = productPurchaseMap.get(product);
                result = product;
            }
        }
        return result;
    }
}
