import java.util.Scanner;
public class CheckPalindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        StringBuffer g2 = new StringBuffer(input);
        String reversed = g2.toString();

        boolean isPalindrome = input.equals(reversed);

        System.out.println(isPalindrome);

    }
}
