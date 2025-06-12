package practice_set;
import java.util.*;
public class Q10_odd_even {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number ");
		int number = sc.nextInt();
		
		
		if(number % 2 == 0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
	}
}
