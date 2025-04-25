import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Custom exception for underage users
          class UnderageException extends Exception {
            public UnderageException(String message) {
                super(message);
            }
        }


        try {
            // Ask user for their age
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            // Check eligibility
            if (age < 18) {
                throw new UnderageException("You must be at least 18 years old to vote in the USA.");
            }

            System.out.println("You are eligible to vote!");

        } catch (UnderageException e) {
            // Handle the custom exception
            System.out.println("Eligibility Error: " + e.getMessage());
        } catch (Exception e) {
            // Handle invalid input
            System.out.println("Invalid input. Please enter a valid number for age.");
        } finally {
            scanner.close(); 
        }
    }
}
