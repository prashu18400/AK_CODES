import java.util.*;
import java.lang.Math;
public class NumDigits {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int num = (int)Math.log10(n) + 1;  // to find number of digits in a number
		System.out.println("Number of digits = "+ num);
	}
}
