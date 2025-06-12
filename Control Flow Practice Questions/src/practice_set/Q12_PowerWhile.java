package practice_set;
import java.util.Scanner;
public class Q12_PowerWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt(); 
        System.out.println("enter the power");
        int power = sc.nextInt(), result = 1, count = 0;
        while (count < power) {
            result *= num;
            count++;
        }
        System.out.println("Result: " + result);
    }
}
