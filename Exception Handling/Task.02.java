//>>>>>: Character Class:

public class Character {
     String name;
     String classType;
     int level;

    public Character(String name, String classType, int level) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }

        if (!classType.equalsIgnoreCase("warrior") && !classType.equalsIgnoreCase("mage")) {
            throw new IllegalArgumentException("Invalid class type. Must be 'warrior' or 'mage'.");
        }

        if (level < 1 || level > 100) {
            throw new IllegalArgumentException("Level must be between 1 and 100.");
        }

        this.name = name;
        this.classType = classType;
        this.level = level;
    }

    @Override
    public String toString() {
        return "Character Created: " + name + " | Class: " + classType + " | Level: " + level;
    }
}



//>>>>>: Main Class:

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Create a New Game Character ===");

        try {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter class type (warrior/mage): ");
            String classType = scanner.nextLine();

            System.out.print("Enter level (1-100): ");
            int level = scanner.nextInt();

            Character character = new Character(name, classType, level);
            System.out.println(character);

        } catch (IllegalArgumentException e) {
            System.out.println("Error creating character: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
