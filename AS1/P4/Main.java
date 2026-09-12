package P4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        int[] A = new int[n];
        int[] B = new int[n];

        int sumA = 0;
        int sumB = 0;

        System.out.println("Enter Section A quantities:");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
            sumA = sumA + A[i];
        }

        System.out.println("Enter Section B quantities:");
        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
            sumB = sumB + B[i];
        }

        System.out.println("Section A Total: " + sumA);
        System.out.println("Section B Total: " + sumB);

        if (sumA == sumB)
            System.out.println("Status: Balanced");
        else
            System.out.println("Status: Not Balanced");

        int max = A[0];
        String section = "A";
        int index = 0;

        for (int i = 1; i < n; i++) {
            if (A[i] > max) {
                max = A[i];
                section = "A";
                index = i;
            }
        }

        for (int i = 0; i < n; i++) {
            if (B[i] > max) {
                max = B[i];
                section = "B";
                index = i;
            }
        }

        System.out.println("Highest Quantity: " + max +
                           " in Section " + section +
                           " at index " + index);
    }
}

