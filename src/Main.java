import java.util.Scanner;

public class Main {
    static Scanner scanner;
    static int[] array;
    public static void main(String[] args) {
        // ask length for array
        System.out.println("How many numbers do you want to add?");
        int amount = getNumber(true);
        // initialize array and fill it up with user info
        array = new int[amount];
        for(int i = 0; i < amount; i++) {
            System.out.printf("Enter number %d/%d\n", i+1, amount);
            array[i] = getNumber(false);
        }
        // actually we don't need array sorting
        System.out.println("Lowest: " + getLowest());
        System.out.println("Highest: " + getHighest());
        System.out.println("Sum: " + getSum());
        System.out.println("Average: " + getAverage());
        scanner.close();
    }
    public static int getLowest() {
        int lowest = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i] < lowest) {
                lowest = array[i];
            }
        }
        return lowest;
    }
    public static int getHighest() {
        int highest = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i] > highest) {
                highest = array[i];
            }
        }
        return highest;
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
    public static int getNumber(boolean noNegative) {
        scanner = new Scanner(System.in);
        while(true) {
            System.out.print("Enter number: ");
            if(scanner.hasNextInt()) {
                int num = scanner.nextInt();
                if(noNegative && num <= 0) {
                    System.out.println("Invalid array size!");
                } else {
                    return num;
                }
            } else {
                scanner.next();
                System.out.println("Must be a whole number!");
            }
        }
    }
}
