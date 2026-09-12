package AS2.P4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String code = sc.nextLine().trim();

        if (code.length() != 13) {
            System.out.println("Invalid: wrong length");
            return;
        }

        String first = code.substring(0, 3).toUpperCase();
        code = first + code.substring(3);

        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(code.charAt(i))) {
                System.out.println("Invalid: publisher code must be 3 letters");
                return;
            }
        }

        for (int i = 3; i < 13; i++) {
            if (!Character.isDigit(code.charAt(i))) {
                System.out.println("Invalid: body must contain only digits");
                return;
            }
        }

        StringBuilder result = new StringBuilder();

        result.append("[")
              .append(code.substring(0, 3))
              .append("] YEAR: ")
              .append(code.substring(3, 7))
              .append(" | CATALOG: ")
              .append(code.substring(7));

        System.out.println(result);
    }
}
