import java.util.Scanner;

class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Read an integer from the user and divide by another number
            System.out.print("Enter numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();

            int divisionResult = numerator / denominator;
            System.out.println("Result of division: " + divisionResult);

            // Access an element from an array
            int[] numbers = {10, 20, 30, 40, 50};

            System.out.print("Enter index to access array element: ");
            int index = scanner.nextInt();

            System.out.println("Array element at index " + index + ": " + numbers[index]);

            // Parse a string to an integer
            scanner.nextLine(); // clear newline character
            System.out.print("Enter a number as a string: ");
            String numberString = scanner.nextLine();

            int parsedNumber = Integer.parseInt(numberString);
            System.out.println("Parsed integer: " + parsedNumber);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index is out of bounds.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input string, cannot parse to integer.");
        } finally {
            System.out.println("Program finished.");
        }
    }
}
