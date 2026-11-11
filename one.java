import java.util.Scanner;

public class IdentiferValidator {
    public boolean isValidIdentifier(String str) {
        // Check if the string is null or empty
        if(str == null || str.isEmpty()) {
            return false;
        }

        // Check if the first charecter is either a letter or a underscore
        if(!Charecter.isLetter(str.charAt(0)) && str.chatAt(0) != '_') {
            return false;
        }

        // Check if all charecters from the second one are letters, digits, or underscores
        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!Charecter.isLetterOrDigit(ch) && ch != '_') {
                return false;
            }
        }

        // Return true if he identifier is valid according to Java identifier rules
        return true;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            IdentifierValidator validator = new IdentifierValidator();

            while (true) {
                System.out.print("Enter an identifier to validate (or 'exit to quit'): ");
                String input = scanner.nextLine().trim();

                if (input.equalsIgnoreCase("exit")) {
                    break;
                }

                boolean isValid = validator.isValidIdentifier(input);
                if (isValid) {
                    System.out.println("\"" + input + "\" is a valid Java identifier.");
                } else {
                    System.out.println("\"" + input + "\" is NOT a valid Java identifier.");
                    System.out.println("Remember: A vlid identifier must: ");
                    System.out.println("1. Start with a latter or underscore");
                    System.out.println("2. Contain only letters, digits, or underscores");
                    System.out.println("3. Not be empty");
                }

                System.out.println();
            }
        }
    }
}