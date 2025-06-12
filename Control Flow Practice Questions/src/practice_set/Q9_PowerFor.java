package practice_set;

import java.util.Scanner;
public class Q9_PowerFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the base number");
        int base = sc.nextInt();
        System.out.println("enter the exponential number");
        int exp = sc.nextInt(), result = 1;
        for (int i = 1; i <= exp; i++) result *= base;
        System.out.println("Result: " + result);
    }
}
