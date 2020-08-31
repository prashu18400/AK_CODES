import java.util.*;
public class UserInput {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		float f = sc.nextFloat();
		System.out.println("The given number is "+d);
		System.out.println("The given float number is "+f);

		sc.close();
	}
	
}
