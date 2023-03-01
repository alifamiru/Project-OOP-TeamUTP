import java.util.Scanner;

public class InputScanner {
    private static final Scanner scanner = new Scanner(System.in);

    public static String scanString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static int scanInt(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            scanner.nextLine(); // Consume invalid input
            System.out.print("Invalid input. " + prompt);
        }
        int input = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        return input;
    }
}
