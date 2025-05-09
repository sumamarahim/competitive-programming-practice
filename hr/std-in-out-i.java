// standard input and output part i
// dated: 09 May 2025

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String s = scan.nextLine();
        int i = scan.nextInt();

        // Write your code here.
        double d = scan.nextDouble();
        scan.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
