import java.security.SecureRandom;
import java.util.Scanner;

class Alphabet {
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBERS = "0123456789";
    private static final String SYMBOLS = "!@#$%^&*()-_=+<>?/";

    public static String getFullAlphabet() {
        return LOWERCASE + UPPERCASE + NUMBERS + SYMBOLS;
    }
}

class Generator {
    private static final SecureRandom random = new SecureRandom();

    public static String generatePassword(int length) {
        String alphabet = Alphabet.getFullAlphabet();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(alphabet.length());
            password.append(alphabet.charAt(index));
        }
        return password.toString();
    }
}

class Password {
    private String value;

    public Password(int length) {
        this.value = Generator.generatePassword(length);
    }

    public String getValue() {
        return value;
    }
}

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter password length: ");
            
            if (scanner.hasNextInt()) {
                int length = scanner.nextInt();
                scanner.nextLine();  // Consume the newline character
                
                // Check if length is zero
                if (length == 0) {
                    System.out.println("Password length cannot be 0! Try again.");
                    continue;
                }

                Password password = new Password(length);
                System.out.println("Generated Password: " + password.getValue());
            } else {
                System.out.println("Invalid input! Please enter a number.");
                scanner.nextLine();  // Consume invalid input
            }
        }
    }
}
