import java.util.*;
public class SampleProblem3 {

	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int n3 = s.nextInt();
		
		if(n1>=n2 && n1>=n3) {
			System.out.println("Is the first number the largest? yes "+n1);
		}
		else if(n2>=n1 && n2>=n3)
		{
			System.out.println("Is the second number the largest ? yes "+n2);
		}
		else {
			System.out.println("Is the third number the largest ? yes "+n3);
		}
	}

}
