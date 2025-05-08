import java.util.Scanner;
public class ReverseAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        StringBuffer g2 = new StringBuffer(input);
        g2.reverse();
        System.out.println("Reversed String: " + g2);
    }
}

