import java.util.*;
public class SampleProblem1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		
		
		if(n%5==0) {
			System.out.println( "Is the number "+n+ " divisible by 5? is yes");
		}
		else {
			System.out.println( "Is the number "+n+ " divisible by 5 is? NO");
		}
	}

}
