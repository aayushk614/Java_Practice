package Sorting;

public class test {
    public static void main(String[] args) {

        String strs[] = {"flower","flow","flight"};
        String prefix = strs[0];


        for(String s : strs){

            while(s.indexOf(prefix) != 0){
                System.out.println(s);
                System.out.println(s.indexOf(prefix));
                prefix = prefix.substring(0, prefix.length()-1);

                System.out.println(prefix);
            }


        }


        //System.out.println(prefix);






    }
}
