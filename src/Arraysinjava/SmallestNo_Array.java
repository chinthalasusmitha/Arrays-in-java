package Arraysinjava;

    import java.util.Scanner;

public class SmallestNo_Array {
    public static void main(String args[])
    {

        int arr[] = {10, 15, 25, 100, 34, 10};

        int min = arr[0];

        for(int i=0; i<arr.length; i++) { if(min > arr[i])
        {
            min = arr[i];
        }

        }

        System.out.print(min);
    }

}
