import java.util.Scanner;
public class ChatFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your message: ");
        String message = scanner.nextLine();
        message=message.replace("fool","******");

        System.out.println("Filtered Message: " + message);
    }
}
