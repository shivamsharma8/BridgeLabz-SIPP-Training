import java.util.*;
public class SampleProblem6 {

	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		int n =s.nextInt();
		
		if(n>0) {
			System.out.println("The number is positive.");
		}
		else if(n<0){
			System.out.println("The number is negative");
		}
		else {
			System.out.println("the number is zero");
		}
	}

}
