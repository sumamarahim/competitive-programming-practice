// Standard input and output part ii
// Dated: 09 May 2025

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        int i = scan.nextInt();

        // Write your code here.
        double d = scan.nextDouble();
        scan.nextLine(); // to make sure to reset the input buffer
        String s = scan.nextLine();
        scan.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
