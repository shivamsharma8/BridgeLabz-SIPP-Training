package practice_set;
import java.util.Scanner;
public class Q13_Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Salary");
        double salary = sc.nextDouble();
        int years = sc.nextInt();
        if (years > 5)
            System.out.println("Bonus: " + (salary * 0.05));
        else
            System.out.println("No Bonus");
    }
}
