package lessons;

import java.util.Scanner;

public class example11 {
    
    public static void main(String[] Args) {
        // Example 11
        Scanner input = new Scanner(System.in);

        String data1, data2, data3;

        data1 = input.nextLine();
        data2 = input.nextLine();
        data3 = input.nextLine();
        input.close();

        System.out.println("Data:");
        System.out.printf("%s%n%s%n%s%n", data1, data2, data3);
    }
}