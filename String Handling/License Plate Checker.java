import java.util.Scanner;
public class LicensePlateChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter license plate: ");
        String pl = scanner.nextLine();

        if (pl.length() != 7) {
            System.out.println("Invalid plate");
        }

        boolean isValid = true;

        for (int i = 0; i < 3; i++) {
            char ch = pl.charAt(i);
            if (!(ch >= 'A' && ch <= 'Z') && !(ch >= 'a' && ch <= 'z')) {
                isValid = false;
                break;
            }
        }

        for (int i = 3; i < 7; i++) {
            char ch = pl.charAt(i);
            if (!(ch >= '0' && ch <= '9')) {
                isValid = false;
                break;
            }
        }

        if (isValid) {
            System.out.println("Valid plate");
        } else {
            System.out.println("Invalid plate");
        }
    }
}
