import java.util.Scanner;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            boolean found = false;
            for (int j = 0; j < result.length(); j++) {
                if (result.charAt(j) == ch) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                result += ch;
            }
        }

        System.out.println("Result: " + result);
    }
}
