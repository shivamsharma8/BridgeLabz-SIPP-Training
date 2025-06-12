import java.util.*;
public class Factorial {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int fac=1;
		
		if(n>0) {
			int i = 1;
			while(i<=n) {
				fac*=i;
				i++;
			}
			System.out.println("the factorial of number "+n+" is "+fac);
		}
		else {
			System.out.println("the number is o");
		}
		
	}

}
