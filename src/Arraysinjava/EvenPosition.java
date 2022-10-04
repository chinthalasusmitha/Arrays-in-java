package Arraysinjava;

public class EvenPosition {
    public static void main(String[] args) {

        //Initializing the array
        int [] numbers = new int [] {5, 10, 15, 20, 25, 30, 150, 120};
        for (int i = 1; i < numbers.length; i = i+2) {
            System.out.println(numbers[i]);
        }
    }
}
