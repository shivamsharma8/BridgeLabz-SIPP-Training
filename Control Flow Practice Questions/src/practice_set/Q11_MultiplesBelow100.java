package practice_set;

import java.util.Scanner;
public class Q11_MultiplesBelow100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        
        int num = sc.nextInt(), counter = num - 1;
        if (num <= 0 || num >= 100) {
            System.out.println("Number must be >0 and <100");
            return;
        }
        while (counter > 1) {
            if (num % counter == 0) System.out.println(counter);
            counter--;
        }
    }
}
