package P2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the original string:");

        String original = sc.nextLine();
        System.out.println("Enter the typed string:");
        String typed = sc.nextLine();

        int count = 0;
        int first = -1;

        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) == typed.charAt(i))
                count++;
            else if (first == -1)
                first = i + 1;
        }

        double accuracy = (count * 100.0) / original.length();

        System.out.println("Matched: " + count + "/" + original.length());
        System.out.println("Accuracy: " + accuracy + "%");

        if (first == -1)
            System.out.println("No Mismatches");
        else
            System.out.println("First Mismatch at position " + first);
    }
}    

