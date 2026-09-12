package AS2.P2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a sentence: ");

            String sentence = sc.nextLine();

            String[] words = sentence.split(" ");

            for (int i = 0; i < words.length; i++) {
                StringBuilder s = new StringBuilder(words[i]);
                System.out.print(s.reverse());

                if (i < words.length - 1)
                    System.out.print(" ");
            }
        }
    }
}
