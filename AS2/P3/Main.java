package AS2.P3;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a record: ");

        String line = sc.nextLine();

        String[] data = line.split(",");

        if (data.length != 3) {
            System.out.println("Invalid Record");
        }
        else {
            System.out.println("Product: " + data[0]
                    + " | SKU: " + data[1]
                    + " | Qty: " + data[2]);
        }
    }
}
