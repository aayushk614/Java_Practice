package Sorting;

public class MergeSort {

    public static void mergeSort(int[] arr){

        int n = arr.length;
        //Base Case
        if(n<=1)
            return;
        int mid = n/2;
        int n1 = mid;
        int n2 = n - mid;
        int[] l = new int[n1];
        int[] r = new int[n2];

        for(int i=0;i<mid;i++)
            l[i] = arr[i];

        for (int j=mid;j<n;j++)
            r[j-mid] = arr[j];

        mergeSort(l);
        mergeSort(r);

        merge(arr, l, r);

    }


    public static void merge(int[] arr, int[] l, int[] r){

        int n1 = l.length;
        int n2 = r.length;
        int i =0;
        int j = 0;
        int k=0;

        while (j<n1 && k<n2){
            if(l[j] < r[k]){
                arr[i++] = l[j++];
            }

            else{
                arr[i++] = r[k++];
            }
        }

        while (j<n1)
            arr[i++] = l[j++];

        while (k<n2)
            arr[i++] = r[k++];

    }


    public static void display(int[] arr){
        System.out.println("Array : ");
        for (int curri : arr)
            System.out.println(curri + " ");
    }



    public static void main(String[] args) {

        int[] arr = {4, 6, 92, 1, 5, 34, 11, 35};

        display(arr);

        mergeSort(arr);

        display(arr);







    }
}
