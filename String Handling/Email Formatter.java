import java.util.Scanner;
public class EmailFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String Name = scanner.nextLine();

        String email = "";

        for (int i = 0; i < Name.length(); i++) {
            char ch = Name.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }


            if (ch == ' ') {
                email += '.';
            } else {
                email += ch;
            }
        }

        email += "@company.com";

        System.out.println("Formatted Email: " + email);
    }
}
