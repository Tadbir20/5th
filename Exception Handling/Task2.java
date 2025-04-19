import java.util.Scanner;

 class Task2 {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4};


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the index: ");
        int index = scanner.nextInt();

        try {

            int value = numbers[index];
            System.out.println("Element at index " + index + " is " + value);
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Out of bounds.");
        }

    }
}
