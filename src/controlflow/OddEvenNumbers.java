package controlflow;
import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        
        if (number <= 0) {
            System.out.println("Please enter a natural number (greater than 0).");
        } else {
            
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                	System.out.println(i + " is an even number.");
                } else {
                    System.out.println(i + " is an odd number.");
                }
            }
        }

       
    }
}
