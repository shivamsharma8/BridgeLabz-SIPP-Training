import java.util.Scanner;
public class CountDown_for {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int counter = s.nextInt();
		
		for(;counter>=1;counter--) {
			System.out.println(counter);
		}

	}

}
