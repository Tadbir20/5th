import java.util.Scanner;
public class CountVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char Char[] = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            for (int j = 0; j < Char.length; j++) {
                if (ch == Char[j]) {
                    count++;
                    break;
                }
            }
        }

        System.out.println("Number of vowels: " + count);
    }
}
