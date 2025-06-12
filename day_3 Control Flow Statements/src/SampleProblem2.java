import java.util.*;
public class SampleProblem2 {

	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int n3 = s.nextInt();
		
		if(n1<=n2 && n1<=n3) {
			System.out.println("Is the first number the smallest "+n1);
		}
		else
		{
			System.out.println("Is the first number the smallest in 3 no is no ");
		}
	}

}
