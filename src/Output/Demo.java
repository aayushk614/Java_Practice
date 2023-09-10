package Output;

class Car{
     int wheels;

    Car(int wheels){
        this.wheels = wheels;
    }

    public void display(){
        System.out.println("this car has " + wheels + " wheels!");
    }


}


class Maruti extends Car{

    private String name;

    Maruti(){
        super(4);
        name = "Maruti";
    }

    public void display(){

        System.out.println(name + " car has " + wheels + " wheels!");
        wheels = 7;
        System.out.println(name + " car has " + wheels + " wheels!");
    }

}


class Bike{

    public static void run1(){
        System.out.println("From static bike");
    }

}

public class Demo {

    public static void main(String[] args)  {

        char ch = 'a';




        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};

        for(int i[] : arr){
            for(int j : i){
                System.out.print(j + " ");
            }
            System.out.println();

        }

        int res[][] = new int[3][3];
        for(int i =0;i<3;i++){
            for (int j = 0;j<3;j++){
                res[j][i] = arr[i][j];

            }
        }

        for(int i[] : res){
            for(int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }







    }
}
