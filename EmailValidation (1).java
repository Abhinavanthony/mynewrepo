import java.util.Scanner;
import java.util.regex.*;

public class EmailValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an email ID: ");
        String email = scanner.nextLine();

        if (isValidEmail(email)) {
            System.out.println("Email is valid");
        } else {
            System.out.println("Email is invalid");
        }

        scanner.close();
    }

    public static boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}


