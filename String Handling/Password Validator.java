import java.util.Scanner;
public class PasswordValidator {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("Enter the password: ");
        String password = input.nextLine();

        boolean Uppercase = false;
        boolean digit = false;
        boolean space = false;

        if (password.length() < 8) {
            System.out.println("Invalid Password");
            return;
        }

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                Uppercase = true;
            }
            if (Character.isDigit(ch)) {
                digit = true;
            }
            if (Character.isWhitespace(ch)) {
                space = true;
            }
        }

        if (Uppercase && digit && !space) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }

    }
}
