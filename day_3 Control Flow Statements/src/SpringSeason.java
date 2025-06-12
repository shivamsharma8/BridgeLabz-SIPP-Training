import java.util.Scanner;
public class SpringSeason {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter month in no");
		int month =s.nextInt();
		int day =s.nextInt();
		
		if ((month >3 && month <6)||(month == 3 && day>=20)||(month ==6 && day<=20)){
			System.out.println("Its a Spring Season");
		}
			
		else {
			System.out.println("Its not a Spring Season");
		}
	}

}
