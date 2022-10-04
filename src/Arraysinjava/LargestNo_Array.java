package Arraysinjava;
    import java.util.Arrays;


public class LargestNo_Array {
    public static void main(String[] args){
        int arr[] = {10, 324, 45, 90, 100};
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println("Largest in given array is " +max);
    }

}

