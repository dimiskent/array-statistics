import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner;
    static int[] array;
    public static void main(String[] args) {
        // ask length for array
        System.out.println("How many numbers do you want to add?");
        int amount = getNumber();
        // initialize array and fill it up with user info
        array = new int[amount];
        for(int i = 0; i < amount; i++) {
            System.out.printf("Enter number %d/%d\n", i+1, amount);
            array[i] = getNumber();
        }
        // sort it (very important!!!)
        Arrays.sort(array);
        System.out.println("Lowest: " + getLowest());
        System.out.println("Highest: " + getHighest());
        System.out.println("Sum: " + getSum());
        System.out.println("Average: " + getAverage());
        scanner.close();
    }
    public static int getLowest() {
        return array[0];
    }
    public static int getHighest() {
        return array[array.length-1];
    }
    public static int getSum() {
        int sum = 0;
        for(int number : array) {
            sum += number;
        }
        return sum;
    }
    public static double getAverage() {
        return (double) getSum() / (double) array.length;
    }
    public static int getNumber() {
        scanner = new Scanner(System.in);
        while(true) {
            System.out.print("Enter number: ");
            if(scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                scanner.next();
                System.out.println("Must be a whole number!");
            }
        }
    }
}
