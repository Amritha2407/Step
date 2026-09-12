package P5;

import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter review: ");
        String review = sc.nextLine();

        String[] words = review.split(" ");

        int shortWord = 0;
        int medium = 0;
        int longWord = 0;

        for (int i = 0; i < words.length; i++) {

            int length = words[i].length();

            if (length <= 4)
                shortWord++;
            else if (length <= 8)
                medium++;
            else
                longWord++;
        }

        System.out.println("Short: " + shortWord);
        System.out.println("Medium: " + medium);
        System.out.println("Long: " + longWord);
    }
}
