import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner;
    public static void main(String[] args) {
        System.out.println("How many numbers do you want to add?");
        int amount = getNumber();
        int[] array = new int[amount];
        for(int i = 0; i < amount; i++) {
            System.out.printf("Enter number %d/%d\n", i+1, amount);
            array[i] = getNumber();
        }
        Arrays.sort(array);
        System.out.println("Lowest: " + array[0]);
        System.out.println("Highest: " + array[array.length-1]);
        int sum = 0;
        for(int number : array) {
            sum += number;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + ((double) sum / (double) array.length));
        scanner.close();
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
